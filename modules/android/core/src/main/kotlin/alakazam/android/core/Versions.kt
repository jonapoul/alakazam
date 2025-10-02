/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.core

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

public object Versions {
  /**
   * Useful little shorthand if you want to perform a runtime check of the device build version. The
   * [ChecksSdkIntAtLeast] annotation means that any version-related lint warnings will be removed in the block
   * immediately after this check.
   */
  @ChecksSdkIntAtLeast(parameter = 0)
  public fun isAtLeast(version: Int): Boolean = Build.VERSION.SDK_INT >= version
}
