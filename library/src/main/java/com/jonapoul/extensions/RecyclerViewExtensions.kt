package com.jonapoul.extensions

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

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
