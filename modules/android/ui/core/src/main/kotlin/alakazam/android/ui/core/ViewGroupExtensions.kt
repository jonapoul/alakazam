package alakazam.android.ui.core

import alakazam.android.core.inflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.annotation.UiThread
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView

@UiThread
private fun ViewGroup.setChildrenEnabled(enable: Boolean) {
  children.forEach {
    when (it) {
      is ViewGroup -> it.setChildrenEnabled(enable)
      else -> enableIf(enable)
    }
  }
}

/**
 * Recursively sets every [View] under this [ViewGroup] to a disabled state.
 */
@UiThread
public fun ViewGroup.disableChildren() {
  setChildrenEnabled(false)
}

/**
 * Recursively sets every [View] under this [ViewGroup] to an enabled state.
 */
@UiThread
public fun ViewGroup.enableChildren() {
  setChildrenEnabled(true)
}

/**
 * Inflates the given view. Mostly useful for the purposes of calling onCreateViewHolder in a
 * RecyclerView adapter.
 */
@UiThread
public fun ViewGroup.inflate(
  @LayoutRes layoutRes: Int,
): View {
  return context.inflater.inflate(layoutRes, this, false)
}

public fun ViewGroup.cleanUpRecyclerAdapters() {
  children.forEach {
    if (it is RecyclerView) {
      // Remove the adapter class to allow garbage collection
      it.adapter = null
    } else if (it is ViewGroup) {
      // Recursively go through child layouts to find RecyclerViews
      it.cleanUpRecyclerAdapters()
    }
  }
}
