package dev.jonpoulton.alakazam.tak.compose.core

import androidx.compose.runtime.Stable

@Stable
public interface TakScreenNavigator {
  public fun navigateForward(screen: TakScreen)
  public fun navigateReplace(screen: TakScreen)
  public fun navigateBack(forceNavBack: Boolean = false)
  public fun close()
}
