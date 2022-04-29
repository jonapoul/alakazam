package com.jonapoul.common.ui.recyclerview

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

/**
 * Allows for easier declaration of [DiffUtil.ItemCallback]s for use in
 * [androidx.recyclerview.widget.ListAdapter] class instances. Just pass in a lambda function to
 * tell us what class attribute we want to treat as the "uniqueness" identifier.
 */
internal class DiffCallback<ItemType : Any, ItemIdType>(
    private val itemIdGetter: ItemType.() -> ItemIdType,
) : DiffUtil.ItemCallback<ItemType>() {
    override fun areItemsTheSame(oldItem: ItemType, newItem: ItemType): Boolean {
        return oldItem.itemIdGetter() == newItem.itemIdGetter()
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: ItemType, newItem: ItemType): Boolean {
        return oldItem == newItem
    }
}
