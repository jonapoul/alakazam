package dev.jonpoulton.alakazam.core

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import kotlinx.coroutines.withContext

class Toaster(
  private val context: Context,
  private val main: MainDispatcher,
) {
  fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(context, message, length).show()
  }

  fun toast(@StringRes message: Int, length: Int = Toast.LENGTH_LONG) {
    toast(context.getString(message), length)
  }

  /**
   * If you're trying to show a [Toast] from a coroutine context, you can either:
   * - Manually ensure that you're on the main dispatcher, to avoid interacting with UI from a background thread
   * - use [coToast] to do that for you
   */
  suspend fun coToast(message: String, length: Int = Toast.LENGTH_LONG) {
    withContext(main) { toast(message, length) }
  }

  suspend fun coToast(@StringRes message: Int, length: Int = Toast.LENGTH_LONG) {
    coToast(context.getString(message), length)
  }
}
