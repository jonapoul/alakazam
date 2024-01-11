package dev.jonpoulton.alakazam.tak.dagger

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.plugin.TakDropDownReceiver

abstract class DaggerDropDownReceiver(mapView: MapView) : TakDropDownReceiver(mapView), ViewModelStoreOwner {
  override val viewModelStore = ViewModelStore()

  @CallSuper
  override fun disposeImpl() {
    viewModelStore.clear()
  }
}
