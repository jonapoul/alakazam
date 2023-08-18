package dev.jonpoulton.alakazam.tak.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.ipc.AtakBroadcast.DocumentedIntentFilter
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.PluginContext
import timber.log.Timber

abstract class CommonDropDownReceiver(
  mapView: MapView,
  protected val pluginContext: PluginContext,
  private val isSwitchable: Boolean = false,
) : DropDownReceiver(mapView), DropDown.OnStateListener, NavigationHandler {

  protected val navStack = arrayListOf<TakFragment>()

  abstract fun intentFilter(): DocumentedIntentFilter

  abstract override fun onReceive(context: Context, intent: Intent)

  protected fun show(fragment: TakFragment) {
    Timber.v("show $fragment")
    showDropDown(
      fragment,
      fragment.landscapeWidth,
      fragment.landscapeHeight,
      fragment.portraitWidth,
      fragment.portraitHeight,
      IgnoreBackButton,
      isSwitchable,
      this,
    )
  }

  override fun navHome() {
    val homeFragment = navStack.lastOrNull() ?: error("Can't nav home with an empty stack")
    navStack.clear()
    navForward(homeFragment)
  }

  override fun navBack(forceNavBack: Boolean) {
    val stackSize = navStack.size
    Timber.v("navBack $forceNavBack $stackSize")
    when (stackSize) {
      0, 1 -> closeDropDown()
      else -> {
        val currentFragment = navStack.last()
        if (forceNavBack || !currentFragment.onBackPressed()) {
          navStack.removeLast()
          show(navStack.last())
        }
      }
    }
  }

  override fun navForward(fragment: TakFragment, args: Bundle?) {
    fragment.arguments = args
    navStack.add(fragment)
    show(fragment)
  }

  override fun navForward(factory: TakFragmentFactory, args: Bundle?) {
    navForward(
      fragment = factory.create(pluginContext, mapView, navigationHandler = this),
      args = args,
    )
  }

  override fun navReplace(fragment: TakFragment, args: Bundle?) {
    fragment.arguments = args
    navStack.removeLast()
    navStack.add(fragment)
    show(fragment)
  }

  override fun navReplace(factory: TakFragmentFactory, args: Bundle?) {
    navReplace(
      fragment = factory.create(pluginContext, mapView, navigationHandler = this),
      args = args,
    )
  }

  override fun close() {
    closeDropDown()
  }

  override fun onDropDownClose() {
    navStack.clear()
  }

  override fun disposeImpl() {
    Timber.v("disposeImpl")
  }

  override fun onBackButtonPressed(): Boolean {
    Timber.v("onBackButtonPressed")
    navBack()
    return IgnoreBackButton
  }

  override fun onDropDownSelectionRemoved() {
    Timber.v("onDropDownSelectionRemoved")
  }

  override fun onDropDownSizeChanged(width: Double, height: Double) {
    Timber.v("onDropDownSizeChanged $width $height")
  }

  override fun onDropDownVisible(isVisible: Boolean) {
    Timber.v("onDropDownVisible $isVisible")
  }

  private companion object {
    const val IgnoreBackButton = true
  }
}
