package com.jonapoul.common.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.annotation.MenuRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class CoreFragment(
    @LayoutRes private val layout: Int,
    @MenuRes private val menu: Int?,
) : Fragment(layout) {

    protected abstract val binding: ViewBinding
    protected val navController by navControllers()

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
}
