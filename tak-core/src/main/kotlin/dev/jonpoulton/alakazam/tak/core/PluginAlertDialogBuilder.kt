package dev.jonpoulton.alakazam.tak.core

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.drawable.Drawable
import android.view.View
import androidx.annotation.ArrayRes
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.core.getCompatDrawable
import dev.jonpoulton.alakazam.core.inflater

class PluginAlertDialogBuilder : AlertDialog.Builder {
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

  override fun setView(@LayoutRes layoutResId: Int): PluginAlertDialogBuilder =
    super.setView(pluginContext.inflater.inflate(layoutResId, null, false)) as PluginAlertDialogBuilder

  override fun setView(view: View): PluginAlertDialogBuilder =
    super.setView(view) as PluginAlertDialogBuilder

  override fun setTitle(@StringRes titleId: Int): PluginAlertDialogBuilder =
    super.setTitle(pluginContext.getString(titleId)) as PluginAlertDialogBuilder

  fun setTitle(title: String): PluginAlertDialogBuilder =
    super.setTitle(title) as PluginAlertDialogBuilder

  override fun setMessage(@StringRes messageId: Int): PluginAlertDialogBuilder =
    super.setMessage(pluginContext.getString(messageId)) as PluginAlertDialogBuilder

  override fun setMessage(message: CharSequence): PluginAlertDialogBuilder =
    super.setMessage(message) as PluginAlertDialogBuilder

  override fun setIcon(@DrawableRes iconId: Int): PluginAlertDialogBuilder =
    super.setIcon(pluginContext.getCompatDrawable(iconId)) as PluginAlertDialogBuilder

  override fun setIcon(icon: Drawable?): PluginAlertDialogBuilder =
    super.setIcon(icon) as PluginAlertDialogBuilder

  override fun setCancelable(cancelable: Boolean): PluginAlertDialogBuilder =
    super.setCancelable(cancelable) as PluginAlertDialogBuilder

  @Suppress("DeprecatedCallableAddReplaceWith")
  @Deprecated(level = DeprecationLevel.ERROR, message = "Doesn't work in ATAK plugins!")
  override fun setIconAttribute(attrId: Int): PluginAlertDialogBuilder =
    super.setIconAttribute(attrId) as PluginAlertDialogBuilder

  override fun setItems(
    @ArrayRes itemsId: Int,
    listener: DialogInterface.OnClickListener?,
  ): PluginAlertDialogBuilder = super.setItems(
    pluginContext.resources.getStringArray(itemsId),
    listener,
  ) as PluginAlertDialogBuilder

  override fun setMultiChoiceItems(
    @ArrayRes itemsId: Int,
    checkedItems: BooleanArray?,
    listener: DialogInterface.OnMultiChoiceClickListener?,
  ): PluginAlertDialogBuilder = super.setMultiChoiceItems(
    pluginContext.resources.getStringArray(itemsId),
    checkedItems,
    listener
  ) as PluginAlertDialogBuilder

  override fun setSingleChoiceItems(
    @ArrayRes itemsId: Int,
    checkedItem: Int,
    listener: DialogInterface.OnClickListener?,
  ): PluginAlertDialogBuilder = super.setSingleChoiceItems(
    pluginContext.resources.getStringArray(itemsId),
    checkedItem,
    listener,
  ) as PluginAlertDialogBuilder

  override fun setSingleChoiceItems(
    items: Array<out CharSequence>?,
    checkedItem: Int,
    listener: DialogInterface.OnClickListener?,
  ): PluginAlertDialogBuilder = super.setSingleChoiceItems(
    items,
    checkedItem,
    listener
  ) as PluginAlertDialogBuilder

  fun setSimplePositiveButton(
    @StringRes text: Int = android.R.string.ok,
    onClick: (() -> Unit)? = null,
  ): PluginAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setPositiveButton(string, null) as PluginAlertDialogBuilder
    } else {
      setPositiveButton(string) { _, _ -> onClick.invoke() } as PluginAlertDialogBuilder
    }
  }

  fun setSimpleNegativeButton(
    @StringRes text: Int = android.R.string.cancel,
    onClick: (() -> Unit)? = null,
  ): PluginAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setNegativeButton(string, null) as PluginAlertDialogBuilder
    } else {
      setNegativeButton(string) { _, _ -> onClick.invoke() } as PluginAlertDialogBuilder
    }
  }

  fun setSimpleNeutralButton(
    @StringRes text: Int,
    onClick: (() -> Unit)? = null,
  ): PluginAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setNeutralButton(string, null) as PluginAlertDialogBuilder
    } else {
      setNeutralButton(string) { _, _ -> onClick.invoke() } as PluginAlertDialogBuilder
    }
  }
}
