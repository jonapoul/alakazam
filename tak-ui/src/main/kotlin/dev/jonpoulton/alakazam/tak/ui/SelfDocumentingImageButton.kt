package dev.jonpoulton.alakazam.tak.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageButton
import android.widget.Toast
import com.atakmap.android.maps.MapView

class SelfDocumentingImageButton @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
) : ImageButton(context, attrs) {
  init {
    setOnLongClickListener {
      val desc = contentDescription
      if (desc != null && desc.isNotBlank()) {
        val context = MapView.getMapView().context
        Toast.makeText(context, desc, Toast.LENGTH_LONG).show()
        true
      } else {
        false
      }
    }
  }
}
