package com.jonapoul.common.ui.view

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Creates and manages a [ViewBinding] object from within an [AppCompatActivity]. The value will be
 * cleared when the [AppCompatActivity] reaches the "destroyed" lifecycle state.
 */
class ActivityViewBindingDelegate<VB : ViewBinding>(
    private val activity: AppCompatActivity,
    private val viewBindingFactory: (LayoutInflater) -> VB,
) : ReadOnlyProperty<AppCompatActivity, VB>, LifecycleEventObserver {

    private var binding: VB? = null

    init {
        activity.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            buildBindingIfNeeded()
            activity.setContentView(binding?.root)
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            binding.cleanUpRecyclerAdapters()
            binding = null
            activity.lifecycle.removeObserver(this)
        }
    }

    private fun buildBindingIfNeeded() {
        if (binding == null) {
            binding = viewBindingFactory.invoke(activity.layoutInflater)
        }
    }

    /**
     * Returns the [ViewBinding] object.
     */
    override fun getValue(thisRef: AppCompatActivity, property: KProperty<*>): VB {
        buildBindingIfNeeded()
        if (!activity.lifecycle.currentState.isAtLeast(Lifecycle.State.INITIALIZED)) {
            error("Activity is destroyed.")
        }
        return binding!!
    }
}
