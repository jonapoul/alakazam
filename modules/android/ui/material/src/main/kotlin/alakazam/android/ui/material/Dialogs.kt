package alakazam.android.ui.material

import alakazam.android.core.inflater
import alakazam.android.ui.appcompat.setSimpleNegativeButton
import alakazam.android.ui.appcompat.setSimplePositiveButton
import alakazam.kotlin.core.ifNotNull
import android.app.Activity
import android.content.Context
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

public fun Fragment.showLoadingDialog(
  @StringRes loadingText: Int = R.string.dialog_loading,
  onClickCancel: (() -> Unit)? = null,
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog = requireActivity().showLoadingDialog(getString(loadingText), onClickCancel, extraConfig)

public fun Activity.showLoadingDialog(
  loadingText: String = getString(R.string.dialog_loading),
  onClickCancel: (() -> Unit)? = null,
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog {
  val view = inflater.inflate(R.layout.dialog_loading, null, false)
  val loadingTextView = view.findViewById<TextView>(R.id.loading_text)
  loadingTextView.text = loadingText
  return MaterialAlertDialogBuilder(this)
    .setView(view)
    .ifNotNull(onClickCancel) { setSimpleNegativeButton { it.invoke() } }
    .setCancelable(false)
    .extraConfig()
    .show()
}

public fun Activity.showSuccessDialog(
  message: String,
  title: String = getString(R.string.dialog_success),
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog = showSuccessDialogImpl(this, title, message, extraConfig)

public fun Activity.showCautionDialog(
  message: String,
  title: String = getString(R.string.dialog_caution),
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog = showCautionDialogImpl(this, title, message, extraConfig)

public fun Activity.showWarningDialog(
  message: String,
  title: String = getString(R.string.dialog_warning),
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog = showWarningDialogImpl(this, title, message, extraConfig)

public fun Fragment.showSuccessDialog(
  message: String,
  title: String = getString(R.string.dialog_success),
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog = showSuccessDialogImpl(requireActivity(), title, message, extraConfig)

public fun Fragment.showCautionDialog(
  message: String,
  title: String = getString(R.string.dialog_caution),
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog = showCautionDialogImpl(requireActivity(), title, message, extraConfig)

public fun Fragment.showWarningDialog(
  message: String,
  title: String = getString(R.string.dialog_warning),
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog = showWarningDialogImpl(requireActivity(), title, message, extraConfig)

private fun showWarningDialogImpl(
  context: Context,
  title: String,
  message: String,
  extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder,
): AlertDialog = MaterialAlertDialogBuilder(context, R.style.Theme_Alakazam_AlertDialog_Warning)
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
): AlertDialog = MaterialAlertDialogBuilder(context, R.style.Theme_Alakazam_AlertDialog_Caution)
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
): AlertDialog = MaterialAlertDialogBuilder(context, R.style.Theme_Alakazam_AlertDialog_Success)
  .setTitle(title)
  .setIcon(R.drawable.ic_check)
  .setMessage(message)
  .setSimplePositiveButton()
  .extraConfig()
  .show()
