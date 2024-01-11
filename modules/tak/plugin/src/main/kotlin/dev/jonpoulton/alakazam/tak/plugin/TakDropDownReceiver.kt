package dev.jonpoulton.alakazam.tak.plugin

import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.ipc.AtakBroadcast.DocumentedIntentFilter
import com.atakmap.android.maps.MapView

abstract class TakDropDownReceiver(mapView: MapView) : DropDownReceiver(mapView) {
  abstract fun intentFilter(): DocumentedIntentFilter
}
