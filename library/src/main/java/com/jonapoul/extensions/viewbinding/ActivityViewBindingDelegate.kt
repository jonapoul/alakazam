package com.jonapoul.extensions.viewbinding

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
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
) : ReadOnlyProperty<AppCompatActivity, VB>, LifecycleObserver {

    private var binding: VB? = null

    init {
        activity.lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun createBinding() {
        buildBindingIfNeeded()
        activity.setContentView(binding?.root)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroyBinding() {
        binding.cleanUpRecyclerAdapters()
        binding = null
        activity.lifecycle.removeObserver(this)
    }

    private fun buildBindingIfNeeded() {
        if (binding == null) {
            binding = viewBindingFactory.invoke(activity.layoutInflater)
        }
    }

    override fun getValue(thisRef: AppCompatActivity, property: KProperty<*>): VB {
        buildBindingIfNeeded()
        if (!activity.lifecycle.currentState.isAtLeast(Lifecycle.State.INITIALIZED)) {
            throw IllegalStateException("Activity is destroyed.")
        }
        return binding!!
    }


}
