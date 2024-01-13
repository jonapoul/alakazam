package dev.jonpoulton.alakazam.tak.core

import android.content.Context
import android.content.ContextWrapper
import android.widget.Toast
import com.atakmap.android.maps.MapView

public class AppContext(context: Context) : ContextWrapper(context) {
  public constructor(mapView: MapView) : this(context = mapView.context)

  public fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, length).show()
  }
}
