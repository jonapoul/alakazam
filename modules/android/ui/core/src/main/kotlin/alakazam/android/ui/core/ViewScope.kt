/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.core

import android.util.Log
import android.view.View
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel

private val KEY_VIEW_SCOPE = R.id.view_scope

@Suppress("InjectDispatcher")
public val View.viewScope: CoroutineScope
  get() {
    getTag(KEY_VIEW_SCOPE)?.let {
      if (it is CoroutineScope) {
        return it
      } else {
        Log.e("ViewScope", "Why is the value of KEY_VIEW_SCOPE an instance of ${it.javaClass.name}?")
      }
    }

    val scope = CoroutineScope(context = SupervisorJob() + Dispatchers.Main.immediate)
    setTag(KEY_VIEW_SCOPE, scope)

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
