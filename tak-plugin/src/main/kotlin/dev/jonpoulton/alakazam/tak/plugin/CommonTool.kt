@file:Suppress("DEPRECATION")

package dev.jonpoulton.alakazam.tak.plugin

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.res.ResourcesCompat
import com.atakmap.android.ipc.AtakBroadcast
import timber.log.Timber
import transapps.mapi.MapView
import transapps.maps.plugin.tool.Group
import transapps.maps.plugin.tool.Tool
import transapps.maps.plugin.tool.ToolDescriptor

abstract class CommonTool(
  protected val pluginContext: Context,
  @DrawableRes private val iconRes: Int,
  @StringRes private val titleRes: Int,
  @StringRes private val descriptionRes: Int,
  private val launchIntent: () -> Intent,
) : Tool(), ToolDescriptor {

  constructor(
    pluginContext: Context,
    @DrawableRes iconRes: Int,
    @StringRes titleRes: Int,
    @StringRes descriptionRes: Int,
    intentAction: String,
  ) : this(
    pluginContext = pluginContext,
    iconRes = iconRes,
    titleRes = titleRes,
    descriptionRes = descriptionRes,
    launchIntent = { Intent(intentAction) },
  )

  override fun getIcon(): Drawable = ResourcesCompat.getDrawable(
    pluginContext.resources,
    iconRes,
    pluginContext.theme,
  )!!

  override fun getShortDescription(): String = pluginContext.getString(titleRes)

  override fun getDescription(): String = pluginContext.getString(descriptionRes)

  override fun getGroups(): Array<Group> = arrayOf(Group.GENERAL)

  override fun onActivate(
    activity: Activity?,
    mapView: MapView?,
    viewGroup: ViewGroup?,
    bundle: Bundle?,
    callback: ToolCallback?,
  ) {
    Timber.v("onActivate")

    /* Hack to close the dropdown that auto-opens when a tool plugin is activated */
    callback?.onToolDeactivated(this)

    /* Launch the plugin UI */
    AtakBroadcast.getInstance().sendBroadcast(launchIntent.invoke())
  }

  override fun onDeactivate(callback: ToolCallback?) {
    Timber.v("onDeactivate")
  }
}
