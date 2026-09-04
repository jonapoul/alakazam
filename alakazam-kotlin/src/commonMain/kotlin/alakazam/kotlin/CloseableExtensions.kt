package alakazam.kotlin

import java.io.Closeable
import kotlinx.coroutines.CancellationException

public fun Closeable.quietlyClose() {
  try {
    close()
  } catch (e: CancellationException) {
    throw e
  } catch (_: Exception) {
    // No-op
  }
}
