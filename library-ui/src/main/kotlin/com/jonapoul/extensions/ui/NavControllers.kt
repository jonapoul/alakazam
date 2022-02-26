package com.jonapoul.extensions.ui

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

/**
 * An alternative method for getting a [NavController] from a [Fragment]. For extremely lazy people
 * who can't be bothered to type:
 *      private val navController by lazy { findNavController() }
 * but can type:
 *      private val navController by navControllers()
 *
 * Don't judge me, okay?
 */
fun Fragment.navControllers(): Lazy<NavController> = LazyNavController { findNavController() }

/**
 * As above, so below. This time for an [AppCompatActivity] instead of a [Fragment]. This requires
 * the ID of your NavHostFragment, which should be declared in your activity XML layout.
 */
fun AppCompatActivity.navControllers(@IdRes navHostFragmentId: Int): Lazy<NavController> =
    LazyNavController { findNavController(navHostFragmentId) }

internal class LazyNavController(
    private val navControllerFactory: () -> NavController,
) : Lazy<NavController> {
    private var cached: NavController? = null

    override val value: NavController
        get() = cached ?: navControllerFactory.invoke().also { cached = it }

    override fun isInitialized(): Boolean = cached != null
}
