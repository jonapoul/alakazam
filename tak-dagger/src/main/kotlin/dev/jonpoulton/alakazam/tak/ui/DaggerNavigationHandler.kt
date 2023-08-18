package dev.jonpoulton.alakazam.tak.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelStoreOwner

interface DaggerNavigationHandler : NavigationHandler, ViewModelStoreOwner {
  fun navForward(factory: DaggerFragmentFactory, args: Bundle? = null)
  fun navReplace(factory: DaggerFragmentFactory, args: Bundle? = null)
}
