package com.jonapoul.common.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.annotation.MenuRes
import androidx.core.view.MenuProvider
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class CommonFragment(
    @LayoutRes private val layout: Int,
    @MenuRes private val menu: Int?,
) : Fragment(layout), MenuProvider {

    protected abstract val binding: ViewBinding
    protected val navController by navControllers()
    private val recyclerViews = mutableListOf<RecyclerView>()

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        grabRecyclerViews(view)
        menu?.let {
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

    protected open fun onMenuItemSelected(@IdRes menuItemId: Int): Boolean =
        false

    final override fun onMenuItemSelected(menuItem: MenuItem): Boolean =
        onMenuItemSelected(menuItem.itemId)

    private fun grabRecyclerViews(view: View) {
        when (view) {
            is RecyclerView -> recyclerViews.add(view)
            is ViewGroup -> view.children.forEach(::grabRecyclerViews)
        }
    }
}
