package com.jonapoul.extensions.ui.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * A base implementation of the [RecyclerView.ViewHolder] class, exposing a single method to be
 * called when the view is being bound to an item of type [ItemType].
 */
abstract class CoreViewHolder<ItemType>(root: View) : RecyclerView.ViewHolder(root) {
    abstract fun bindTo(item: ItemType)
}
