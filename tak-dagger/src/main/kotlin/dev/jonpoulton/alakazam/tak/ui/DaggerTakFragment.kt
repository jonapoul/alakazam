package dev.jonpoulton.alakazam.tak.ui

import androidx.lifecycle.ViewModel
import androidx.fragment.app.viewModels
import com.atakmap.android.dropdown.DropDownReceiver
import dev.jonpoulton.alakazam.tak.di.DaggerInjector

abstract class DaggerTakFragment(
  landscapeWidth: Double = DropDownReceiver.HALF_WIDTH,
  landscapeHeight: Double = DropDownReceiver.FULL_HEIGHT,
  portraitWidth: Double = DropDownReceiver.FULL_WIDTH,
  portraitHeight: Double = DropDownReceiver.HALF_HEIGHT,
) : TakFragment(landscapeWidth, landscapeHeight, portraitWidth, portraitHeight) {
  protected abstract val injector: DaggerInjector

  abstract override val navigationHandler: DaggerNavigationHandler

  protected inline fun <reified VM : ViewModel> viewModels(): Lazy<VM> {
    val factory = injector.vmFactory()
    return viewModels(factoryProducer = { factory })
  }
}
