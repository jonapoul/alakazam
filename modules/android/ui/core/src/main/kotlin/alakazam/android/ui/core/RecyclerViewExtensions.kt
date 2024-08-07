package alakazam.android.ui.core

import androidx.recyclerview.widget.RecyclerView

/**
 * Returns true if a [RecyclerView.Adapter] is attached and it contains any items, false otherwise.
 */
public val RecyclerView.isEmpty: Boolean
  get() = adapter?.itemCount == 0

/**
 * Returns true if a [RecyclerView.Adapter] is attached and it contains no items, false otherwise.
 */
public val RecyclerView.isNotEmpty: Boolean
  get() = adapter?.let { it.itemCount > 0 } ?: false

/**
 * Sets up one or two callbacks to be invoked when the [RecyclerView] scrolls.
 */
public fun RecyclerView.scrollListener(
  onScrollStateChanged: (recycler: RecyclerView, newState: Int) -> Unit = { _, _ -> },
  onScrolled: (recycler: RecyclerView, dx: Int, dy: Int) -> Unit = { _, _, _ -> },
) {
  this.addOnScrollListener(
    object : RecyclerView.OnScrollListener() {
      override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        onScrollStateChanged(recyclerView, newState)
      }

      override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        onScrolled(recyclerView, dx, dy)
      }
    },
  )
}
