package dev.jonpoulton.alakazam.ui.compose

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Colors.onSurfaceSecondary: Color get() = if (isLight) Color(0x99000000) else Color(0x99FFFFFF)

val Colors.onSurfaceGreen: Color get() = if (isLight) Color(0xFF00B000) else Color(0xFF55FF55)
val Colors.onSurfaceYellow: Color get() = if (isLight) Color(0xFFB0B000) else Color(0xFFFFFF55)
val Colors.onSurfaceOrange: Color get() = if (isLight) Color(0xFFB06300) else Color(0xFFFF9955)
val Colors.onSurfaceRed: Color get() = if (isLight) Color(0xFFB00000) else Color(0xFFFF5555)
val Colors.onSurfaceBlue: Color get() = if (isLight) Color(0xFF0063B0) else Color(0xFF5599FF)

val Colors.snackbarBackground: Color get() = if (isLight) Color(0xFF575757) else Color(0xFF474747)
val Colors.onSnackbarGreen: Color get() = Color(0xFF55FF55)
val Colors.onSnackbarBlue: Color get() = Color(0xFF5599FF)
val Colors.onSnackbarYellow: Color get() = Color(0xFFFFFF55)
val Colors.onSnackbarRed: Color get() = Color(0xFFFF5555)

val Colors.dialogBackground: Color get() = if (isLight) surface else Color(0xFF343434)
