package dev.jonpoulton.alakazam.tak.compose.core

import androidx.compose.runtime.Composable

public interface TakScreen {
  @Composable
  public fun Compose()

  public interface Dimensions {
    public val lwFraction: Double
    public val lhFraction: Double
    public val pwFraction: Double
    public val phFraction: Double
  }
}

public object HalfScreen : TakScreen.Dimensions {
  override val lwFraction: Double = 0.5
  override val lhFraction: Double = 1.0
  override val pwFraction: Double = 1.0
  override val phFraction: Double = 0.5
}

public object FullScreen : TakScreen.Dimensions {
  override val lwFraction: Double = 1.0
  override val lhFraction: Double = 1.0
  override val pwFraction: Double = 1.0
  override val phFraction: Double = 1.0
}

public data class TakScreenDimensions(
  override val lwFraction: Double,
  override val lhFraction: Double,
  override val pwFraction: Double,
  override val phFraction: Double,
) : TakScreen.Dimensions
