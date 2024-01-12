package dev.jonpoulton.alakazam.android.ui.compose

import androidx.compose.material.Colors
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

@Stable val Colors.OnSurfaceSecondary: Color get() = if (isLight) Color(0x99000000) else Color(0x99FFFFFF)

@Stable val Colors.OnSurfaceGreen: Color get() = if (isLight) Color(0xFF00B000) else Color(0xFF55FF55)
@Stable val Colors.OnSurfaceYellow: Color get() = if (isLight) Color(0xFFB0B000) else Color(0xFFFFFF55)
@Stable val Colors.OnSurfaceOrange: Color get() = if (isLight) Color(0xFFB06300) else Color(0xFFFF9955)
@Stable val Colors.OnSurfaceRed: Color get() = if (isLight) Color(0xFFB00000) else Color(0xFFFF5555)
@Stable val Colors.OnSurfaceBlue: Color get() = if (isLight) Color(0xFF0063B0) else Color(0xFF5599FF)

@Stable val Colors.SnackbarBackground: Color get() = if (isLight) Color(0xFF575757) else Color(0xFF474747)
@Stable val Colors.OnSnackbarGreen: Color get() = Color(0xFF55FF55)
@Stable val Colors.OnSnackbarBlue: Color get() = Color(0xFF5599FF)
@Stable val Colors.OnSnackbarYellow: Color get() = Color(0xFFFFFF55)
@Stable val Colors.OnSnackbarRed: Color get() = Color(0xFFFF5555)

@Stable val Colors.DialogBackground: Color get() = if (isLight) surface else Color(0xFF343434)
