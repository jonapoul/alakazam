package dev.jonpoulton.alakazam.tak.di

import com.atakmap.android.ipc.AtakBroadcast
import com.atakmap.android.maps.MapView
import dagger.Module
import dagger.Provides

@Module
class AlakazamAtakModule {
  @Provides
  fun atakBroadcast(): AtakBroadcast = AtakBroadcast.getInstance()

  @Provides
  fun mapView(): MapView = MapView.getMapView()
}
