package dev.jonpoulton.alakazam.android.ui.appcompat

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.annotation.MenuRes
import androidx.core.view.MenuProvider
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

public abstract class CommonFragment(
  @LayoutRes private val layout: Int,
  @MenuRes private val menu: Int?,
) : Fragment(layout), MenuProvider {

  private val recyclerViews = mutableListOf<RecyclerView>()

  @CallSuper
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    grabRecyclerViews(view)
    if (menu != null) {
      requireActivity().addMenuProvider(this, viewLifecycleOwner)
    }
  }

  @CallSuper
  override fun onDestroyView() {
    super.onDestroyView()
    recyclerViews.forEach { it.adapter = null }
    recyclerViews.clear()
  }

  @CallSuper
  override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
    this.menu?.let { menuInflater.inflate(it, menu) }
  }

  private fun grabRecyclerViews(view: View) {
    when (view) {
      is RecyclerView -> recyclerViews.add(view)
      is ViewGroup -> view.children.forEach(::grabRecyclerViews)
    }
  }

  override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
    /* No-op by default */
    return false
  }
}
