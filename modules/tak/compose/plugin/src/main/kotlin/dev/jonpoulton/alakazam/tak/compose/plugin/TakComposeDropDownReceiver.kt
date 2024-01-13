package dev.jonpoulton.alakazam.tak.compose.plugin

import androidx.annotation.CallSuper
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.compose.core.LocalTakComposeContext
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakComposeContext
import dev.jonpoulton.alakazam.tak.compose.core.TakComposeView
import dev.jonpoulton.alakazam.tak.compose.viewmodel.LocalViewModelFactory
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.plugin.TakDropDownReceiver

abstract class TakComposeDropDownReceiver(
  pluginContext: PluginContext,
  mapView: MapView,
  protected val viewModelFactory: ViewModelProvider.Factory,
) : TakDropDownReceiver(mapView), ViewModelStoreOwner {
  override val viewModelStore: ViewModelStore = ViewModelStore()

  private val composeContext = TakComposeContext(pluginContext, mapView)

  @CallSuper
  override fun disposeImpl() {
    viewModelStore.clear()
  }

  open fun showDropDown(
    dimensions: Dimensions = HalfScreen,
    ignoreBackButton: Boolean = false,
    switchable: Boolean = false,
    stateListener: DropDown.OnStateListener? = null,
    colors: Colors = TakColors.colors,
    content: @Composable () -> Unit,
  ) {
    val composeView = TakComposeView(composeContext, colors) {
      CompositionLocalProvider(
        LocalViewModelStoreOwner provides this,
        LocalViewModelFactory provides viewModelFactory,
        LocalTakComposeContext provides composeContext,
      ) {
        content()
      }
    }
    showDropDown(
      composeView,
      dimensions.lwFraction,
      dimensions.lhFraction,
      dimensions.pwFraction,
      dimensions.phFraction,
      ignoreBackButton,
      switchable,
      stateListener,
    )
  }
}
