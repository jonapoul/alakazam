package dev.jonpoulton.alakazam.tak.ui

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.ToggleButton
import androidx.annotation.DrawableRes
import androidx.core.content.withStyledAttributes
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.core.toast

@SuppressLint("AppCompatCustomView")
public class LongPressableImageToggleButton @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
) : ToggleButton(context, attrs) {
  init {
    /* Show toast on long press */
    setOnLongClickListener {
      val desc = contentDescription?.toString()
      if (!desc.isNullOrBlank()) {
        MapView.getMapView().toast(desc)
        true
      } else {
        false
      }
    }

    // Hide text
    textSize = 0f
    textOff = ""
    textOn = ""

    /* Show icon */
    context.withStyledAttributes(attrs, R.styleable.LongPressableImageToggleButton) {
      val icon = getDrawable(R.styleable.LongPressableImageToggleButton_lpitb_src)
        ?: error("lpitb_src attribute is required!")
      setCompoundDrawablesWithIntrinsicBounds(null, icon, null, null)
    }
  }

  public fun setImageResource(pluginContext: PluginContext, @DrawableRes drawableRes: Int) {
    val drawable = pluginContext.getDrawable(drawableRes)
    setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null)
  }
}
