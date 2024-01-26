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

public fun TakComposeView(contexts: TakContexts): ComposeView {
  val composeContext = TakComposeContext(contexts)
  return TakComposeView(composeContext)
}

public fun TakComposeView(
  contexts: TakContexts,
  content: @Composable () -> Unit,
): ComposeView = TakComposeView(
  composeContext = TakComposeContext(contexts),
  content = content,
)

public fun TakComposeView(pluginContext: PluginContext, appContext: AppContext): ComposeView {
  val composeContext = TakComposeContext(pluginContext, appContext)
  return TakComposeView(composeContext)
}

public fun TakComposeView(
  pluginContext: PluginContext,
  appContext: AppContext,
  content: @Composable () -> Unit,
): ComposeView = TakComposeView(
  composeContext = TakComposeContext(pluginContext, appContext),
  content = content,
)

public fun TakComposeView(composeContext: TakComposeContext): ComposeView {
  val view = ComposeView(composeContext)

  // TODO: Use ViewCompositionStrategy.DisposeOnLifecycleDestroyed instead?
  view.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow)
  return view
}

public fun TakComposeView(composeContext: TakComposeContext, content: @Composable () -> Unit): ComposeView {
  val view = TakComposeView(composeContext)
  view.setTakContent(composeContext, content = content)
  return view
}

public fun ComposeView.setTakContent(
  composeContext: TakComposeContext,
  colors: Colors = TakColors.colors,
  shapes: @Composable () -> Shapes = { TakShapes },
  typography: @Composable () -> Typography = { TakTypography },
  content: @Composable () -> Unit,
) {
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

public fun ComposeView.setTakContent(
  composeContext: TakComposeContext,
  colors: Colors = TakColors.colors,
  shapes: @Composable () -> Shapes = { TakShapes },
  typography: @Composable () -> Typography = { TakTypography },
  screen: TakScreen,
) {
  setTakContent(composeContext, colors, shapes, typography) {
    screen.Compose()
  }
}
