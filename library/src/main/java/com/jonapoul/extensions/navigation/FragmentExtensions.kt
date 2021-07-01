package com.jonapoul.extensions.navigation

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
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

internal class LazyNavController(
    private val navControllerFactory: () -> NavController
) : Lazy<NavController> {
    private var cached: NavController? = null

    override val value: NavController
        get() = cached ?: navControllerFactory.invoke().also { cached = it }

    override fun isInitialized(): Boolean = cached != null
}
