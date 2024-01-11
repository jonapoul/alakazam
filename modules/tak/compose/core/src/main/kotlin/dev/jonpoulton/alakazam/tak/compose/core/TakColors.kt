package dev.jonpoulton.alakazam.tak.compose.core

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

@Stable
object TakColors {
  @Stable
  val colors: Colors
    get() = darkColors(
      // TBC
    )

  /**
   * The primary color leveraged throughout UI elements.
   */
  @Stable
  val Sand: Color = Color(color = 0xFFDAD4BC)

  @Stable
  val Cyber: Color = Color(color = 0xFFFFE35E)

  /**
   * Used for background fills and font color
   */
  @Stable
  val Ink: Color = Color(color = 0xFF000000)

  /**
   * Used to express the pressed state of an element
   */
  @Stable
  val Charcoal: Color = Color(color = 0xFF131415)

  /**
   * Used for divider lines for UI elements
   */
  @Stable
  val Ash: Color = Color(color = 0xFF38362F)

  /**
   * Used for font color and icon default states
   */
  @Stable
  val Stone: Color = Color(color = 0xFF979797)

  /**
   * Used for font color and icon default states
   */
  @Stable
  val Cloud: Color = Color(color = 0xFFFFFFFF)

  @Stable
  val Bronze: Color = Color(color = 0xFFBBAE79)

  @Stable
  val Alert: Color = Color(color = 0xFFF52D2D)

  @Stable
  val Success: Color = Color(color = 0xFF0EA900)

  @Stable
  val Rho: Color = Color(color = 0xFFFF9D9D)

  @Stable
  val Gamma: Color = Color(color = 0xFF9DFFAF)
}
