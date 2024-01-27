package dev.jonpoulton.alakazam.tak.core

import android.widget.Toast
import com.atakmap.android.maps.MapView

public fun MapView.toast(message: String, length: Int = Toast.LENGTH_LONG) {
  Toast.makeText(context, message, length).show()
}
