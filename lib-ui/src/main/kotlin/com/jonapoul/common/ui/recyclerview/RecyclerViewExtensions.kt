package com.jonapoul.common.ui.recyclerview

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jonapoul.common.ui.view.onDestroyView

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
 * Automatically clears the [RecyclerView.Adapter] instance from your [RecyclerView] when the host
 * view is destroyed. This means you can remove a bunch of [Fragment.onDestroyView] boilerplate,
 * just by using this instead of [RecyclerView.setAdapter].
 */
@RequiresApi(Build.VERSION_CODES.HONEYCOMB_MR1)
fun <VH : RecyclerView.ViewHolder> RecyclerView.setLifecycleAwareAdapter(
    lifecycleAdapter: RecyclerView.Adapter<VH>,
) {
    this.adapter = lifecycleAdapter
    this.onDestroyView {
        adapter = null
    }
}

/**
 * Sets up the [RecyclerView] with a standard [LinearLayoutManager] and the supplied
 * [RecyclerView.Adapter], along with any extra configuration supplied as a lambda block.
 */
@RequiresApi(Build.VERSION_CODES.HONEYCOMB_MR1)
fun <VH : RecyclerView.ViewHolder> RecyclerView.initialise(
    adapter: RecyclerView.Adapter<VH>,
    otherConfig: RecyclerView.() -> Unit = {},
) {
    this.layoutManager = LinearLayoutManager(context)
    this.setLifecycleAwareAdapter(adapter)
    this.otherConfig()
}

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
