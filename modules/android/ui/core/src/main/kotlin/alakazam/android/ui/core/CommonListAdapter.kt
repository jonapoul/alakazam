package alakazam.android.ui.core

import alakazam.android.core.inflater
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

/**
 * Gives a base implementation of the [ListAdapter], which can be used in place of a
 * [RecyclerView.Adapter] class to reduce boilerplate and give smoother animations when submitting
 * new data to the view.
 */
public abstract class CommonListAdapter<T : Any, VH : CommonViewHolder<T>>(
  diffCallback: DiffUtil.ItemCallback<T>,
) : ListAdapter<T, VH>(diffCallback) {
  protected abstract fun buildViewHolder(inflater: LayoutInflater, parent: ViewGroup): VH

  final override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
    return buildViewHolder(parent.context.inflater, parent)
  }

  final override fun onBindViewHolder(holder: VH, position: Int) {
    holder.bindTo(getItem(position))
  }

  override fun onViewRecycled(holder: VH) {
    holder.onRecycled()
  }
}
