package dev.jonpoulton.alakazam.tak.compose.core

import android.content.res.Resources
import androidx.annotation.ArrayRes
import androidx.annotation.DrawableRes
import androidx.annotation.PluralsRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource

/**
 * Mostly copies of [androidx.compose.ui.res] methods, but with a [LocalTakComposeContext] instead of a regular
 * [LocalContext].
 */

@Composable
@ReadOnlyComposable
public fun takResources(): Resources {
//   LocalConfiguration.current // Removed: not relevant in ATAK plugins
  return LocalTakComposeContext.current.resources
}

@Composable
@ReadOnlyComposable
public fun takStringResource(@StringRes id: Int): String {
  val resources = takResources()
  return resources.getString(id)
}

@Composable
@ReadOnlyComposable
public fun takStringResource(@StringRes id: Int, vararg formatArgs: Any): String {
  val resources = takResources()
  return resources.getString(id, *formatArgs)
}

@Composable
@ReadOnlyComposable
public fun takStringArrayResource(@ArrayRes id: Int): Array<String> {
  val resources = takResources()
  return resources.getStringArray(id)
}

@Composable
@ReadOnlyComposable
public fun takPluralStringResource(@PluralsRes id: Int, count: Int): String {
  val resources = takResources()
  return resources.getQuantityString(id, count)
}

@Composable
@ReadOnlyComposable
public fun takPluralStringResource(@PluralsRes id: Int, count: Int, vararg formatArgs: Any): String {
  val resources = takResources()
  return resources.getQuantityString(id, count, *formatArgs)
}

@Composable
public fun takVectorResource(@DrawableRes id: Int): ImageVector {
  val context = LocalTakComposeContext.current
  val res = takResources()
  val theme = context.theme
  return remember(id, res, theme, res.configuration) { ImageVector.vectorResource(theme, res, id) }
}
