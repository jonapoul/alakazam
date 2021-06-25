package com.jonapoul.extensions.activity

import android.app.Activity
import android.view.View
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Returns the [Activity]'s content (root) view.
 */
val Activity.rootView: View
    get() = findViewById(android.R.id.content)

/**
 * Simplified method of quickly showing dialogs in the [Activity].
 */
inline fun Activity.alert(body: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder) {
    MaterialAlertDialogBuilder(this)
        .body()
        .show()
}
