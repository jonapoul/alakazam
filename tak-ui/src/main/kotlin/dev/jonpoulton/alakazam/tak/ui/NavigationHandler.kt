package dev.jonpoulton.alakazam.tak.ui

import android.os.Bundle
import java.io.Closeable

interface NavigationHandler : Closeable {
  fun navForward(fragment: TakFragment, args: Bundle? = null)
  fun navForward(factory: TakFragmentFactory, args: Bundle? = null)
  fun navBack(forceNavBack: Boolean = false)
  fun navReplace(fragment: TakFragment, args: Bundle? = null)
  fun navReplace(factory: TakFragmentFactory, args: Bundle? = null)
  fun navHome()
}
