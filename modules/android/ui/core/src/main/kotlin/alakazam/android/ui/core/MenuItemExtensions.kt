/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.core

import android.view.MenuItem

public fun MenuItem.show() {
  isVisible = true
}

public fun MenuItem.hide() {
  isVisible = false
}

public fun MenuItem.showIfTrue(condition: Boolean) {
  if (condition) show() else hide()
}

public fun MenuItem.hideIfTrue(condition: Boolean) {
  showIfTrue(!condition)
}
