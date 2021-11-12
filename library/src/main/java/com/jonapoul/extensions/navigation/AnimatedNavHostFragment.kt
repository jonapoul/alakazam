package com.jonapoul.extensions.navigation

import android.content.Context
import android.os.Bundle
import androidx.annotation.AnimRes
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.navOptions
import com.jonapoul.extensions.R

/*
* Adapted from https://stackoverflow.com/a/65755470/15634757
*/
private val defaultNavOptions = navOptions {
    anim {
        enter = R.animator.nav_default_enter_anim
        exit = R.animator.nav_default_exit_anim
        popEnter = R.animator.nav_default_pop_enter_anim
        popExit = R.animator.nav_default_pop_exit_anim
    }
}

private val emptyNavOptions = navOptions {}

class AnimatedNavHostFragment : NavHostFragment() {
    override fun onCreateNavController(navController: NavController) {
        super.onCreateNavController(navController)
        navController.navigatorProvider.addNavigator(
            FragmentNavigatorWithDefaultAnimations(requireContext(), childFragmentManager, id)
        )
    }
}

@Navigator.Name("fragment")
internal class FragmentNavigatorWithDefaultAnimations(
    context: Context,
    manager: FragmentManager,
    containerId: Int,
) : FragmentNavigator(context, manager, containerId) {

    override fun navigate(
        destination: Destination,
        args: Bundle?,
        navOptions: NavOptions?,
        navigatorExtras: Navigator.Extras?,
    ): NavDestination? {
        val shouldUseTransitionsInstead = navigatorExtras != null
        val options = if (shouldUseTransitionsInstead) {
            navOptions
        } else {
            navOptions.fillEmptyAnimationsWithDefaults()
        }
        return super.navigate(destination, args, options, navigatorExtras)
    }

    private fun NavOptions?.fillEmptyAnimationsWithDefaults(): NavOptions {
        return this?.copyNavOptionsWithDefaultAnimations() ?: defaultNavOptions
    }

    private fun NavOptions.copyNavOptionsWithDefaultAnimations(): NavOptions {
        val original = this
        return navOptions {
            launchSingleTop = original.shouldLaunchSingleTop()
            popUpTo(original.popUpTo) {
                inclusive = original.isPopUpToInclusive
            }
            anim {
                enter = getAnim(original) { enterAnim }
                exit = getAnim(original) { exitAnim }
                popEnter = getAnim(original) { popEnterAnim }
                popExit = getAnim(original) { popExitAnim }
            }
        }
    }

    @AnimRes
    private fun getAnim(original: NavOptions, attr: NavOptions.() -> Int): Int {
        return if (original.attr() == emptyNavOptions.attr()) {
            defaultNavOptions.attr()
        } else {
            original.attr()
        }
    }
}
