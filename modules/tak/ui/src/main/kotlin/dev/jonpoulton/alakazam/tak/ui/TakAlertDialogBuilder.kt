package dev.jonpoulton.alakazam.tak.ui

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext

class TakAlertDialogBuilder : AlertDialog.Builder {
  private val pluginContext: PluginContext

  constructor(appContext: Context, pluginContext: PluginContext) : super(appContext) {
    this.pluginContext = pluginContext
  }

  constructor(appContext: AppContext, pluginContext: PluginContext) : super(appContext) {
    this.pluginContext = pluginContext
  }

  constructor(mapView: MapView, pluginContext: PluginContext) : super(mapView.context) {
    this.pluginContext = pluginContext
  }

  override fun setView(@LayoutRes layoutResId: Int): TakAlertDialogBuilder =
    super.setView(LayoutInflater.from(pluginContext).inflate(layoutResId, null, false)) as TakAlertDialogBuilder

  override fun setView(view: View?): TakAlertDialogBuilder =
    super.setView(view) as TakAlertDialogBuilder

  override fun setTitle(@StringRes titleId: Int): TakAlertDialogBuilder =
    super.setTitle(pluginContext.getString(titleId)) as TakAlertDialogBuilder

  override fun setMessage(@StringRes messageId: Int): TakAlertDialogBuilder =
    super.setMessage(pluginContext.getString(messageId)) as TakAlertDialogBuilder

  override fun setMessage(message: CharSequence): TakAlertDialogBuilder =
    super.setMessage(message) as TakAlertDialogBuilder

  override fun setIcon(@DrawableRes iconId: Int): TakAlertDialogBuilder =
    super.setIcon(ContextCompat.getDrawable(pluginContext, iconId)) as TakAlertDialogBuilder

  fun setSimplePositiveButton(
    @StringRes text: Int = android.R.string.ok,
    onClick: (() -> Unit)? = null,
  ): TakAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setPositiveButton(string, null) as TakAlertDialogBuilder
    } else {
      setPositiveButton(string) { _, _ -> onClick.invoke() } as TakAlertDialogBuilder
    }
  }

  fun setSimpleNegativeButton(
    @StringRes text: Int = android.R.string.cancel,
    onClick: (() -> Unit)? = null,
  ): TakAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setNegativeButton(string, null) as TakAlertDialogBuilder
    } else {
      setNegativeButton(string) { _, _ -> onClick.invoke() } as TakAlertDialogBuilder
    }
  }

  fun setSimpleNeutralButton(
    @StringRes text: Int,
    onClick: (() -> Unit)? = null,
  ): TakAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setNeutralButton(string, null) as TakAlertDialogBuilder
    } else {
      setNeutralButton(string) { _, _ -> onClick.invoke() } as TakAlertDialogBuilder
    }
  }
}
