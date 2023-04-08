package com.jonapoul.alakazam.ui.view

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * Performs a similar function to [com.jonapoul.alakazam.ui.view.onDestroyView] but in a more
 * automated fashion, in that it recursively sets all attached [RecyclerView.Adapter] instances to
 * null when the [ViewBinding] is destroyed. This helps remove a source of memory leaks from the
 * app.
 */
fun ViewBinding?.cleanUpRecyclerAdapters() {
  val view = this?.root ?: return
  if (view is RecyclerView) {
    view.adapter = null
  } else if (view is ViewGroup) {
    view.cleanUpRecyclerAdapters()
  }
}

/**
 * Creates a lazy inflating delegate for a [ViewBinding] instance.
 */
inline fun <VB : ViewBinding> Activity.viewBinder(
  crossinline bindingInflater: (LayoutInflater) -> VB,
) = lazy(LazyThreadSafetyMode.NONE) {
  bindingInflater.invoke(layoutInflater)
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
