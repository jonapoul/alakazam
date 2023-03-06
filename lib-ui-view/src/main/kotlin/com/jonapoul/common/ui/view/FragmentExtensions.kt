package com.jonapoul.common.ui.view

import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.jonapoul.common.core.throwsSpecific

/**
 * If the view (and therefore the [ViewBinding]) is inaccessible, meaning we have reached
 * [onDestroyView], then grabbing the lifecycle will throw an [IllegalStateException]. So this
 * can be used to check that state, e.g. with a ListAdapter's submitList callback.
 */
fun Fragment.viewIsAccessible(): Boolean =
    !throwsSpecific<IllegalStateException> { viewLifecycleOwner }
