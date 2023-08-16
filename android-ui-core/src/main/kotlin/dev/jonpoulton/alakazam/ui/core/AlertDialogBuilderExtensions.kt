@file:Suppress("UNCHECKED_CAST")

package dev.jonpoulton.alakazam.ui.core

import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog

/**
 * Gives a best-case API to allow callbacks on pressing the "negative" button in a dialog. Here we
 * apply a default (system-translated) string of "CANCEL" and invoke the supplied [onClick] when it's
 * pressed. If [onClick] is null, the button will simply close the dialog.
 */
fun <T : AlertDialog.Builder> T.setSimpleNegativeButton(
  @StringRes text: Int = android.R.string.cancel,
  onClick: (() -> Unit)? = null,
): T {
  return if (onClick == null) {
    setNegativeButton(text, null) as T
  } else {
    setNegativeButton(text) { _, _ -> onClick.invoke() } as T
  }
}

/**
 * Gives a best-case API to allow callbacks on pressing the "positive" button in a dialog. Here we
 * apply a default (system-translated) string of "OK" and invoke the supplied [onClick] when it's
 * pressed. If [onClick] is null, the button will simply close the dialog.
 */
fun <T : AlertDialog.Builder> T.setSimplePositiveButton(
  @StringRes text: Int = android.R.string.ok,
  onClick: (() -> Unit)? = null,
): T {
  return if (onClick == null) {
    setPositiveButton(text, null) as T
  } else {
    setPositiveButton(text) { _, _ -> onClick.invoke() } as T
  }
}

fun <T : AlertDialog.Builder> T.setSimpleNeutralButton(
  @StringRes text: Int,
  onClick: (() -> Unit)? = null,
): T {
  return if (onClick == null) {
    setNeutralButton(text, null) as T
  } else {
    setNeutralButton(text) { _, _ -> onClick.invoke() } as T
  }
}
