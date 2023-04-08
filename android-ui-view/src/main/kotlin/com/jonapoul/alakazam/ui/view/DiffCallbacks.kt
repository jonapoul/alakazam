package com.jonapoul.alakazam.ui.view

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

/**
 * Allows for easier declaration of [DiffUtil.ItemCallback]s for use in [androidx.recyclerview.widget.ListAdapter]
 * class instances.
 *
 * [DiffCallbacks.basic] lets us use the contents of a data class to check equality of two list items, refreshing the
 * view holder if the two are not exactly equal.
 *
 * [DiffCallbacks.withItemId] lets us use a lambda method to fetch some uniqueness identifier from the list type.
 * View holders will only be refreshed if this ID is different.
 */
@SuppressLint("DiffUtilEquals")
object DiffCallbacks {
  fun <T : Any> basic(): DiffUtil.ItemCallback<T> = object : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem
    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem
  }

  fun <T : Any, ID> withItemId(
    itemId: T.() -> ID,
  ): DiffUtil.ItemCallback<T> = object : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = oldItem.itemId() == newItem.itemId()
    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem
  }
}
