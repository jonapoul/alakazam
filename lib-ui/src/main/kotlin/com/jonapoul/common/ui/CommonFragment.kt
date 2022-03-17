package com.jonapoul.common.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.annotation.MenuRes
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class CommonFragment(
    @LayoutRes private val layout: Int,
    @MenuRes private val menu: Int?,
) : Fragment(layout) {

    protected abstract val binding: ViewBinding
    protected val navController by navControllers()
    private val recyclerViews = mutableListOf<RecyclerView>()

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(menu != null)
    }

    @CallSuper
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        this.menu?.let { inflater.inflate(it, menu) }
    }

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        grabRecyclerViews(view)
    }

    @CallSuper
    override fun onDestroyView() {
        super.onDestroyView()
        recyclerViews.forEach { it.adapter = null }
        recyclerViews.clear()
    }

    private fun grabRecyclerViews(view: View) {
        when (view) {
            is RecyclerView -> recyclerViews.add(view)
            is ViewGroup -> view.children.forEach(::grabRecyclerViews)
        }
    }
}
