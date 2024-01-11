package dev.jonpoulton.alakazam.tak.plugin

import android.content.Context
import android.content.Intent
import androidx.annotation.CallSuper
import com.atakmap.android.dropdown.DropDownMapComponent
import com.atakmap.android.maps.MapView

abstract class TakMapComponent : DropDownMapComponent() {
  protected abstract val dropDownReceivers: List<TakDropDownReceiver>

  @CallSuper
  override fun onCreate(pluginContext: Context, intent: Intent?, mapView: MapView) {
    super.onCreate(pluginContext, intent, mapView)
    dropDownReceivers.forEach { ddr ->
      registerDropDownReceiver(ddr, ddr.intentFilter())
    }
  }
}
