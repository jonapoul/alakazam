package com.jonapoul.common.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.annotation.MenuRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.jonapoul.common.domain.throwsSpecific

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onOptionsItemSelected(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    protected open fun onOptionsItemSelected(itemId: Int) {}

    /**
     * If the view (and therefore the [ViewBinding]) is inaccessible, meaning we have reached
     * [onDestroyView], then grabbing the lifecycle will throw an [IllegalStateException]. So this
     * can be used to check that state, e.g. with [com.jonapoul.nasa.core.domain.PicassoCallback].
     */
    protected fun viewIsAccessible(): Boolean =
        !throwsSpecific<IllegalStateException> { viewLifecycleOwner }
}
