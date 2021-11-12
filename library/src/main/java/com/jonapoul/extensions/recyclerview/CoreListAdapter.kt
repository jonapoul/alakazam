package com.jonapoul.extensions.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

/**
 * Gives a base implementation of the [ListAdapter], which can be used in place of a
 * [RecyclerView.Adapter] class to reduce boilerplate and give smoother animations when submitting
 * new data to the view.
 */
abstract class CoreListAdapter<ItemType, ViewHolderType : CoreViewHolder<ItemType>, ItemIdType>(
    private val itemIdGetter: ItemType.() -> ItemIdType,
) : ListAdapter<ItemType, ViewHolderType>(
    DiffCallback<ItemType, ItemIdType> { itemIdGetter() }
) {
    protected abstract fun onBuildViewHolder(
        inflater: LayoutInflater,
        parent: ViewGroup,
    ): ViewHolderType

    final override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderType {
        val inflater = LayoutInflater.from(parent.context)
        return onBuildViewHolder(inflater, parent)
    }

    final override fun onBindViewHolder(holder: ViewHolderType, position: Int) {
        holder.bindTo(getItem(position))
    }
}
