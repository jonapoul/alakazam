package dev.jonpoulton.alakazam.tak.compose.core

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

@Stable
public object TakColors {
  @Stable
  public val colors: Colors
    get() = darkColors(
      // TBC
    )

  /**
   * The primary color leveraged throughout UI elements.
   */
  @Stable
  public val Sand: Color = Color(color = 0xFFDAD4BC)

  @Stable
  public val Cyber: Color = Color(color = 0xFFFFE35E)

  /**
   * Used for background fills and font color
   */
  @Stable
  public val Ink: Color = Color(color = 0xFF000000)

  /**
   * Used to express the pressed state of an element
   */
  @Stable
  public val Charcoal: Color = Color(color = 0xFF131415)

  /**
   * Used for divider lines for UI elements
   */
  @Stable
  public val Ash: Color = Color(color = 0xFF38362F)

  /**
   * Used for font color and icon default states
   */
  @Stable
  public val Stone: Color = Color(color = 0xFF979797)

  /**
   * Used for font color and icon default states
   */
  @Stable
  public val Cloud: Color = Color(color = 0xFFFFFFFF)

  @Stable
  public val Bronze: Color = Color(color = 0xFFBBAE79)

  @Stable
  public val Alert: Color = Color(color = 0xFFF52D2D)

  @Stable
  public val Success: Color = Color(color = 0xFF0EA900)

  @Stable
  public val Rho: Color = Color(color = 0xFFFF9D9D)

  @Stable
  public val Gamma: Color = Color(color = 0xFF9DFFAF)
}
