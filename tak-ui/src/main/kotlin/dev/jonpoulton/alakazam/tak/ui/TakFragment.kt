package dev.jonpoulton.alakazam.tak.ui

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.PluginContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel

abstract class TakFragment(
  val landscapeWidth: Double = DropDownReceiver.HALF_WIDTH,
  val landscapeHeight: Double = DropDownReceiver.FULL_HEIGHT,
  val portraitWidth: Double = DropDownReceiver.FULL_WIDTH,
  val portraitHeight: Double = DropDownReceiver.HALF_HEIGHT,
) : Fragment() {

  protected abstract val pluginContext: PluginContext
  protected abstract val mapView: MapView
  protected abstract val navigationHandler: NavigationHandler
  protected abstract val viewModel: TakViewModel

  private var nullableFragmentScope: CoroutineScope? = null
  protected val fragmentScope: CoroutineScope
    get() = nullableFragmentScope ?: error("Fragment is not in scope: ${javaClass.canonicalName}")

  private val recyclerViews = mutableListOf<RecyclerView>()

  open fun onBackPressed(): Boolean = false

  @CallSuper
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    nullableFragmentScope = CoroutineScope(Dispatchers.Main)
    viewModel.init()
  }

  @CallSuper
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    grabRecyclerViewsRecursively(view)
  }

  @CallSuper
  override fun onDestroyView() {
    super.onDestroyView()
    recyclerViews.onEach { it.adapter = null }.clear()
  }

  override fun onDestroy() {
    super.onDestroy()
    fragmentScope.cancel()
    nullableFragmentScope = null
  }

  private fun grabRecyclerViewsRecursively(view: View) {
    when (view) {
      is RecyclerView -> recyclerViews.add(view)
      is ViewGroup -> view.children.forEach(::grabRecyclerViewsRecursively)
    }
  }
}
