package com.jonapoul.alakazam.ui.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

typealias ScreenFactory = @Composable (NavController) -> Unit

interface NavScreen {
    val route: String
    val titleRes: Int
    val screen: ScreenFactory
}

fun navScreenImpl(
    route: String,
    titleRes: Int,
    screen: ScreenFactory,
): NavScreen = object : NavScreen {
    override val route: String = route
    override val titleRes: Int = titleRes
    override val screen: ScreenFactory = screen
}
