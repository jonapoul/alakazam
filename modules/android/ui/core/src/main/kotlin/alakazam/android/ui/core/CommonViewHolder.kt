/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.core

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * A base implementation of the [RecyclerView.ViewHolder] class, exposing a single method to be
 * called when the view is being bound to an item of type [T].
 */
public abstract class CommonViewHolder<T>(root: View) : RecyclerView.ViewHolder(root) {
  protected val context: Context
    get() = itemView.context

  public abstract fun bindTo(item: T)

  public open fun onRecycled() {
    // No-op by default
  }
}
