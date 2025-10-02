/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.logging

import android.os.Build

public actual fun Thread.getThreadId(): Long = if (Build.VERSION.SDK_INT >= 36) {
  threadId()
} else {
  @Suppress("DEPRECATION")
  id
}
