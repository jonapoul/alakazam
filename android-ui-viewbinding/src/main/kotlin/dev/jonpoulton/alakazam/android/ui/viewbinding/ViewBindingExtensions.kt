package dev.jonpoulton.alakazam.android.ui.viewbinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import dev.jonpoulton.alakazam.android.ui.core.cleanUpRecyclerAdapters
import dev.jonpoulton.alakazam.android.ui.core.hide
import dev.jonpoulton.alakazam.android.ui.core.hideIfTrue
import dev.jonpoulton.alakazam.android.ui.core.show
import dev.jonpoulton.alakazam.android.ui.core.showIfTrue
import dev.jonpoulton.alakazam.android.ui.core.viewScope
import kotlinx.coroutines.CoroutineScope

val ViewBinding.viewScope: CoroutineScope
  get() = root.viewScope

fun ViewBinding.showIfTrue(condition: Boolean) {
  root.showIfTrue(condition)
}

fun ViewBinding.hideIfTrue(condition: Boolean) {
  root.hideIfTrue(condition)
}

fun ViewBinding.show() {
  root.show()
}

fun ViewBinding.hide() {
  root.hide()
}

fun ViewBinding.cleanUpRecyclerAdapters() {
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
fun <VB : ViewBinding> AppCompatActivity.viewBinding(
  bindingInflater: (LayoutInflater) -> VB,
) = ActivityViewBindingDelegate(
  activity = this,
  bindingInflater,
)

/**
 * Creates a [ViewBinding] delegate object, allowing us to declare it at the top of our
 * [Fragment] like so:
 *
 *      private val binding by viewBinding(MyFragmentBinding::bind)
 */
fun <VB : ViewBinding> Fragment.viewBinding(
  viewBindingFactory: (View) -> VB,
) = FragmentViewBindingDelegate(
  fragment = this,
  viewBindingFactory,
)
