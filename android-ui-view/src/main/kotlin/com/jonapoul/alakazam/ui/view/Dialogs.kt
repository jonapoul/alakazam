package com.jonapoul.alakazam.ui.view

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.jonapoul.alakazam.core.ifNotNull
import com.jonapoul.alakazam.ui.view.databinding.DialogLoadingBinding

fun Fragment.showLoadingDialog(
    @StringRes loadingText: Int = R.string.dialog_loading,
    onClickCancel: (() -> Unit)? = null,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = requireActivity().showLoadingDialog(getString(loadingText), onClickCancel, extraConfig)

fun Activity.showLoadingDialog(
    loadingText: String = getString(R.string.dialog_loading),
    onClickCancel: (() -> Unit)? = null,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog {
    val inflater = LayoutInflater.from(this)
    val binding = DialogLoadingBinding.inflate(inflater, null, false)
    binding.loadingText.text = loadingText
    return MaterialAlertDialogBuilder(this)
        .setView(binding.root)
        .ifNotNull(onClickCancel) { setSimpleNegativeButton { it.invoke() } }
        .setCancelable(false)
        .extraConfig()
        .show()
}

fun Activity.showSuccessDialog(
    message: String,
    title: String = getString(R.string.dialog_success),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showSuccessDialogImpl(this, title, message, extraConfig)

fun Activity.showCautionDialog(
    message: String,
    title: String = getString(R.string.dialog_caution),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showCautionDialogImpl(this, title, message, extraConfig)

fun Activity.showWarningDialog(
    message: String,
    title: String = getString(R.string.dialog_warning),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showWarningDialogImpl(this, title, message, extraConfig)

fun Fragment.showSuccessDialog(
    message: String,
    title: String = getString(R.string.dialog_success),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showSuccessDialogImpl(requireActivity(), title, message, extraConfig)

fun Fragment.showCautionDialog(
    message: String,
    title: String = getString(R.string.dialog_caution),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showCautionDialogImpl(requireActivity(), title, message, extraConfig)

fun Fragment.showWarningDialog(
    message: String,
    title: String = getString(R.string.dialog_warning),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showWarningDialogImpl(requireActivity(), title, message, extraConfig)

private fun showWarningDialogImpl(
    context: Context,
    title: String,
    message: String,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder,
): AlertDialog = MaterialAlertDialogBuilder(context, R.style.Theme_Common_AlertDialog_Warning)
    .setTitle(title)
    .setIcon(R.drawable.ic_warning)
    .setMessage(message)
    .setSimplePositiveButton()
    .extraConfig()
    .show()

private fun showCautionDialogImpl(
    context: Context,
    title: String,
    message: String,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder,
): AlertDialog = MaterialAlertDialogBuilder(context, R.style.Theme_Common_AlertDialog_Caution)
    .setTitle(title)
    .setIcon(R.drawable.ic_caution)
    .setMessage(message)
    .setSimplePositiveButton()
    .extraConfig()
    .show()

private fun showSuccessDialogImpl(
    context: Context,
    title: String,
    message: String,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder,
): AlertDialog = MaterialAlertDialogBuilder(context, R.style.Theme_Common_AlertDialog_Success)
    .setTitle(title)
    .setIcon(R.drawable.ic_check)
    .setMessage(message)
    .setSimplePositiveButton()
    .extraConfig()
    .show()
