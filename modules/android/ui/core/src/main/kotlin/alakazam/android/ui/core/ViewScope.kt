package alakazam.android.ui.core

import android.view.View
import androidx.core.view.ViewCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import timber.log.Timber

private val KEY_VIEW_SCOPE = R.id.view_scope

@Suppress("InjectDispatcher")
public val View.viewScope: CoroutineScope
  get() {
    getTag(KEY_VIEW_SCOPE)?.let {
      if (it is CoroutineScope) {
        return it
      } else {
        Timber.e("Why is the value of KEY_VIEW_SCOPE an instance of ${it.javaClass.name}?")
      }
    }

    val scope = CoroutineScope(context = SupervisorJob() + Dispatchers.Main.immediate)
    setTag(KEY_VIEW_SCOPE, scope)

    if (!ViewCompat.isAttachedToWindow(this)) {
      Timber.w("Creating scope before ${javaClass.name} attaches to the window!")
    }

    addOnAttachStateChangeListener(
      object : View.OnAttachStateChangeListener {
        override fun onViewAttachedToWindow(v: View) {
          // No-op
        }

        override fun onViewDetachedFromWindow(v: View) {
          removeOnAttachStateChangeListener(this)
          setTag(KEY_VIEW_SCOPE, null)
          scope.cancel()
        }
      },
    )
    return scope
  }
