/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.core

import alakazam.kotlin.core.CoroutineContexts
import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import kotlinx.coroutines.withContext

public class Toaster(
  private val contexts: CoroutineContexts,
  private val appContext: Context,
  private val resourcesContext: Context = appContext,
) {
  public fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(appContext, message, length).show()
  }

  public fun toast(
    @StringRes message: Int,
    length: Int = Toast.LENGTH_LONG,
  ) {
    toast(resourcesContext.getString(message), length)
  }

  /**
   * If you're trying to show a [Toast] from a coroutine context, you can either:
   * - Manually ensure that you're on the main dispatcher, to avoid interacting with UI from a background thread
   * - use [coToast] to do that for you
   */
  public suspend fun coToast(message: String, length: Int = Toast.LENGTH_LONG) {
    withContext(contexts.main) { toast(message, length) }
  }

  public suspend fun coToast(
    @StringRes message: Int,
    length: Int = Toast.LENGTH_LONG,
  ) {
    coToast(resourcesContext.getString(message), length)
  }
}
