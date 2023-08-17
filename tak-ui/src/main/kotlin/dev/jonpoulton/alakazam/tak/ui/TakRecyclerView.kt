package dev.jonpoulton.alakazam.tak.ui

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView

class TakRecyclerView @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleRes: Int = 0,
) : RecyclerView(context, attrs, defStyleRes) {
  override fun scrollTo(x: Int, y: Int) {
    /* No-op */
  }
}
