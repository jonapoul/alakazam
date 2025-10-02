/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.core

import android.text.Editable
import android.text.TextWatcher

public abstract class SimpleTextWatcher : TextWatcher {
  override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    // To be overridden
  }

  override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    // To be overridden
  }

  override fun afterTextChanged(s: Editable?) {
    // To be overridden
  }
}
