@file:Suppress("UnusedReceiverParameter")

package alakazam.kotlin.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

@get:[Composable ReadOnlyComposable Stable]
public val ColorScheme.OnSurfaceSecondary: Color
  get() = if (isSystemInDarkTheme()) Color(0x99000000) else Color(0x99FFFFFF)

@get:[Composable ReadOnlyComposable Stable]
public val ColorScheme.OnSurfaceGreen: Color
  get() = if (isSystemInDarkTheme()) Color(0xFF00B000) else Color(0xFF55FF55)

@get:[Composable ReadOnlyComposable Stable]
public val ColorScheme.OnSurfaceYellow: Color
  get() = if (isSystemInDarkTheme()) Color(0xFFB0B000) else Color(0xFFFFFF55)

@get:[Composable ReadOnlyComposable Stable]
public val ColorScheme.OnSurfaceOrange: Color
  get() = if (isSystemInDarkTheme()) Color(0xFFB06300) else Color(0xFFFF9955)

@get:[Composable ReadOnlyComposable Stable]
public val ColorScheme.OnSurfaceRed: Color
  get() = if (isSystemInDarkTheme()) Color(0xFFB00000) else Color(0xFFFF5555)

@get:[Composable ReadOnlyComposable Stable]
public val ColorScheme.OnSurfaceBlue: Color
  get() = if (isSystemInDarkTheme()) Color(0xFF0063B0) else Color(0xFF5599FF)

@get:[Composable ReadOnlyComposable Stable]
public val ColorScheme.SnackbarBackground: Color
  get() = if (isSystemInDarkTheme()) Color(0xFF575757) else Color(0xFF474747)

@get:Stable
public val ColorScheme.OnSnackbarGreen: Color get() = Color(0xFF55FF55)

@get:Stable
public val ColorScheme.OnSnackbarBlue: Color get() = Color(0xFF5599FF)

@get:Stable
public val ColorScheme.OnSnackbarYellow: Color get() = Color(0xFFFFFF55)

@get:Stable
public val ColorScheme.OnSnackbarRed: Color get() = Color(0xFFFF5555)

@get:[Composable ReadOnlyComposable Stable]
public val ColorScheme.DialogBackground: Color
  get() = if (isSystemInDarkTheme()) surface else Color(0xFF343434)
