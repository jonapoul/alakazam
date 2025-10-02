/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.core.res

import android.content.Context
import androidx.annotation.DimenRes

public abstract class DimensCreator(protected val context: Context) {
  protected fun dimension(
    @DimenRes res: Int,
  ): Float = context.resources.getDimension(res)

  protected fun pixelOffset(
    @DimenRes res: Int,
  ): Int = context.resources.getDimensionPixelOffset(res)

  protected fun pixelSize(
    @DimenRes res: Int,
  ): Int = context.resources.getDimensionPixelSize(res)
}
