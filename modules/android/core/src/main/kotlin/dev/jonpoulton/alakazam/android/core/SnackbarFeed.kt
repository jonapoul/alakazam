package dev.jonpoulton.alakazam.android.core

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ChannelResult
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlin.time.Duration.Companion.seconds

class SnackbarFeed {
  private val pending = Channel<SnackbarMessage>(MESSAGE_QUEUE_SIZE, BufferOverflow.DROP_OLDEST)

  /**
   * A flow of [SnackbarMessage]s to display in the UI as snackbars. The flow will immediately
   * emit "null", and will then emit messages sent via [add]. Once 2 seconds has elapsed, null
   * will be emitted to remove the current message.
   */
  val snackbars: Flow<SnackbarMessage?> = flow {
    emit(null)
    pending.receiveAsFlow().collect {
      emit(it)
      delay(TIMEOUT)
      emit(null)
    }
  }

  suspend fun add(message: SnackbarMessage) {
    pending.send(message)
  }

  fun post(message: SnackbarMessage): ChannelResult<Unit> {
    return pending.trySend(message)
  }

  private companion object {
    val TIMEOUT = 2.seconds
    const val MESSAGE_QUEUE_SIZE = 3
  }
}
