package com.jonapoul.extensions.context

import android.app.Service
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Shorthand method to start the specified [Service] class with the given [action] string.
 */
inline fun <reified S : Service> Context.startServiceWithAction(action: String) {
    startService(
        Intent(this, S::class.java).apply {
            setAction(action)
        }
    )
}

/**
 * Want your user to choose Single thing from a bunch? call showSinglePicker and provide your options to choose from
 */
fun Context.showSinglePicker(
    choices: Collection<String>,
    onResponse: (index: Int) -> Unit,
    checkedItemIndex: Int = -1
): AlertDialog = MaterialAlertDialogBuilder(this)
    .setSingleChoiceItems(choices.toTypedArray(), checkedItemIndex) { dialog, which ->
        onResponse.invoke(which)
        dialog.dismiss()
    }.show()

/**
 * Choose a selection of items from a given [Array]
 */
fun Context.showMultiPicker(
    choices: Collection<String>,
    onResponse: (index: Int, isChecked: Boolean) -> Unit,
    checkedItems: BooleanArray? = null
): AlertDialog = MaterialAlertDialogBuilder(this)
    .setMultiChoiceItems(choices.toTypedArray(), checkedItems) { _, which, isChecked ->
        onResponse.invoke(which, isChecked)
    }.setPositiveButton(android.R.string.ok, null)
    .show()
