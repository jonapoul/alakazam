@file:Suppress("FunctionName")

package dev.jonpoulton.alakazam.tak.compose.core

import androidx.compose.material.Colors
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.ViewCompositionStrategy
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.core.TakContexts

public fun TakComposeView(
  contexts: TakContexts,
  colors: Colors = TakColors.colors,
  shapes: @Composable () -> Shapes = { TakShapes },
  typography: @Composable () -> Typography = { TakTypography },
  content: @Composable () -> Unit,
): ComposeView {
  val composeContext = TakComposeContext(contexts)
  return TakComposeView(composeContext, colors, shapes, typography, content)
}

public fun TakComposeView(
  pluginContext: PluginContext,
  appContext: AppContext,
  colors: Colors = TakColors.colors,
  shapes: @Composable () -> Shapes = { TakShapes },
  typography: @Composable () -> Typography = { TakTypography },
  content: @Composable () -> Unit,
): ComposeView {
  val composeContext = TakComposeContext(pluginContext, appContext)
  return TakComposeView(composeContext, colors, shapes, typography, content)
}

/**
 * Shortcut to create a context-aware [ComposeView] for an ATAK plugin.
 */
public fun TakComposeView(
  composeContext: TakComposeContext,
  colors: Colors = TakColors.colors,
  shapes: @Composable () -> Shapes = { TakShapes },
  typography: @Composable () -> Typography = { TakTypography },
  content: @Composable () -> Unit,
): ComposeView = ComposeView(composeContext).apply {
  setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow)
  setContent {
    TakTheme(colors, shapes(), typography()) {
      CompositionLocalProvider(
        LocalContext provides composeContext,
        LocalTakComposeContext provides composeContext,
      ) {
        content()
      }
    }
  }
}
