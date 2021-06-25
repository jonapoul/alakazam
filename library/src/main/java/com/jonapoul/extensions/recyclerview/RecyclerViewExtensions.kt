package com.jonapoul.extensions.recyclerview

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jonapoul.extensions.view.onDestroyView

val RecyclerView.isEmpty: Boolean
    get() = adapter?.itemCount == 0

val RecyclerView.isNotEmpty: Boolean
    get() = !isEmpty

/**
 * Automatically clears the [RecyclerView.Adapter] instance from your [RecyclerView] when the host
 * view is destroyed. This means you can remove a bunch of [Fragment.onDestroyView] boilerplate,
 * just by using this instead of [RecyclerView.setAdapter].
 */
fun <VH : RecyclerView.ViewHolder> RecyclerView.setLifecycleAwareAdapter(
    lifecycleAdapter: RecyclerView.Adapter<VH>
) {
    this.adapter = lifecycleAdapter
    this.onDestroyView {
        adapter = null
    }
}

fun <VH : RecyclerView.ViewHolder> RecyclerView.initialise(
    adapter: RecyclerView.Adapter<VH>,
    otherConfig: RecyclerView.() -> Unit = {}
) {
    this.layoutManager = LinearLayoutManager(context)
    this.setLifecycleAwareAdapter(adapter)
    this.otherConfig()
}

fun RecyclerView.scrollListener(
    onScrollStateChanged: (recycler: RecyclerView, newState: Int) -> Unit = { _, _ -> },
    onScrolled: (recycler: RecyclerView, scrollbyX: Int, scrollbyY: Int) -> Unit = { _, _, _ -> }
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
