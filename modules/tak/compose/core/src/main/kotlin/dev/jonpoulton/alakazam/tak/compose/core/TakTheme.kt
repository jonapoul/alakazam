package dev.jonpoulton.alakazam.tak.compose.core

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable

/**
 * Yes I know ATAK uses Holo instead of Material, but this'll do for now.
 */
@Composable
public fun TakTheme(
  colors: Colors = TakColors.colors,
  shapes: Shapes = TakShapes,
  typography: Typography = TakTypography,
  content: @Composable () -> Unit,
) {
  MaterialTheme(
    colors = colors,
    shapes = shapes,
    typography = typography,
    content = content,
  )
}
