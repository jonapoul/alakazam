package alakazam.android.ui.viewbinding

import alakazam.android.ui.core.cleanUpRecyclerAdapters
import alakazam.android.ui.core.hide
import alakazam.android.ui.core.hideIfTrue
import alakazam.android.ui.core.show
import alakazam.android.ui.core.showIfTrue
import alakazam.android.ui.core.viewScope
import alakazam.kotlin.core.collectFlow
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlin.properties.ReadOnlyProperty

public val ViewBinding.viewScope: CoroutineScope
  get() = root.viewScope

public fun ViewBinding.showIfTrue(condition: Boolean) {
  root.showIfTrue(condition)
}

public fun ViewBinding.hideIfTrue(condition: Boolean) {
  root.hideIfTrue(condition)
}

public fun <T> ViewBinding.collectFlow(flow: Flow<T>, call: suspend (T) -> Unit): Job {
  return viewScope.collectFlow(flow, call)
}

public fun ViewBinding.show() {
  root.show()
}

public fun ViewBinding.hide() {
  root.hide()
}

public fun ViewBinding.cleanUpRecyclerAdapters() {
  val view = this.root
  if (view is RecyclerView) {
    view.adapter = null
  } else if (view is ViewGroup) {
    view.cleanUpRecyclerAdapters()
  }
}

/**
 * Creates a [ViewBinding] delegate object, allowing us to declare it at the top of our
 * [AppCompatActivity] like so:
 *
 *      private val binding by viewBinding(MyActivityBinding::inflate)
 */
public fun <VB : ViewBinding> AppCompatActivity.viewBinding(
  bindingInflater: (LayoutInflater) -> VB,
): ReadOnlyProperty<AppCompatActivity, VB> = ActivityViewBindingDelegate(
  activity = this,
  bindingInflater,
)

/**
 * Creates a [ViewBinding] delegate object, allowing us to declare it at the top of our
 * [Fragment] like so:
 *
 *      private val binding by viewBinding(MyFragmentBinding::bind)
 */
public fun <VB : ViewBinding> Fragment.viewBinding(
  viewBindingFactory: (View) -> VB,
): ReadOnlyProperty<Fragment, VB> = FragmentViewBindingDelegate(
  fragment = this,
  viewBindingFactory,
)
