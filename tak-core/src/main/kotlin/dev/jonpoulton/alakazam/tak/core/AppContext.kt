package dev.jonpoulton.alakazam.tak.core

import android.content.Context
import android.content.ContextWrapper
import android.widget.Toast
import com.atakmap.android.maps.MapView

class AppContext(context: Context) : ContextWrapper(context) {
  constructor(mapView: MapView) : this(context = mapView.context)

  fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, length).show()
  }
}
