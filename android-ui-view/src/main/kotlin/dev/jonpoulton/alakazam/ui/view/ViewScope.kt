package dev.jonpoulton.alakazam.ui.view

import android.view.View
import androidx.core.view.ViewCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import timber.log.Timber
import java.io.Closeable
import kotlin.coroutines.CoroutineContext

private val KEY_VIEW_SCOPE = R.id.view_scope

val View.viewScope: CoroutineScope
  get() {
    getTag(KEY_VIEW_SCOPE)?.let {
      Timber.v("Got scope tag: $it")
      if (it is CoroutineScope) {
        return it
      } else {
        Timber.e("Why is the value of KEY_VIEW_SCOPE an instance of ${it.javaClass.name}?")
      }
    }

    val scope = CloseableCoroutineScope(coroutineContext = SupervisorJob() + Dispatchers.Main.immediate)
    setTag(KEY_VIEW_SCOPE, scope)

    if (!ViewCompat.isAttachedToWindow(this)) {
      Timber.w("Creating scope before ${javaClass.name} attaches to the window!")
    }

    addOnAttachStateChangeListener(
      object : View.OnAttachStateChangeListener {
        override fun onViewAttachedToWindow(v: View) {
          Timber.v("$v attached")
        }

        override fun onViewDetachedFromWindow(v: View) {
          Timber.v("$v detached, cancelling scope")
          removeOnAttachStateChangeListener(this)
          setTag(KEY_VIEW_SCOPE, null)
          scope.close()
        }
      },
    )
    return scope
  }

private class CloseableCoroutineScope(
  override val coroutineContext: CoroutineContext,
) : Closeable, CoroutineScope {
  override fun close() = coroutineContext.cancel()
}
