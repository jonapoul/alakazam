package dev.jonpoulton.alakazam.tak.plugin

import android.content.Context
import android.content.Intent
import androidx.annotation.CallSuper
import androidx.annotation.StyleRes
import com.atakmap.android.dropdown.DropDownMapComponent
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.ui.CommonDropDownReceiver

abstract class CommonMapComponent(
  @StyleRes private val styleRes: Int = R.style.Theme_Atak_Common,
) : DropDownMapComponent() {

  protected abstract val dropDownReceivers: List<CommonDropDownReceiver>

  @CallSuper
  override fun onCreate(pluginContext: Context, intent: Intent?, mapView: MapView) {
    pluginContext.setTheme(styleRes)
    super.onCreate(pluginContext, intent, mapView)
    dropDownReceivers.forEach { ddr ->
      registerDropDownReceiver(ddr, ddr.intentFilter())
    }
  }
}
