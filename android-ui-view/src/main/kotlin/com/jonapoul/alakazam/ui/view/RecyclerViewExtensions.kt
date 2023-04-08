package com.jonapoul.alakazam.ui.view

import androidx.recyclerview.widget.RecyclerView

/**
 * Returns true if a [RecyclerView.Adapter] is attached and it contains any items, false otherwise.
 */
val RecyclerView.isEmpty: Boolean
    get() = adapter?.itemCount == 0

/**
 * Returns true if a [RecyclerView.Adapter] is attached and it contains no items, false otherwise.
 */
val RecyclerView.isNotEmpty: Boolean
    get() = adapter?.let { it.itemCount > 0 } ?: false

/**
 * Sets up one or two callbacks to be invoked when the [RecyclerView] scrolls.
 */
fun RecyclerView.scrollListener(
    onScrollStateChanged: (recycler: RecyclerView, newState: Int) -> Unit = { _, _ -> },
    onScrolled: (recycler: RecyclerView, dx: Int, dy: Int) -> Unit = { _, _, _ -> },
) {
    this.addOnScrollListener(
        object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                onScrollStateChanged.invoke(recyclerView, newState)
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                onScrolled.invoke(recyclerView, dx, dy)
            }
        }
    )
}
