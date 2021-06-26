package com.jonapoul.extensions.viewbinding

import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.*
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Creates and manages a [ViewBinding] object from within a [Fragment]. The value will be cleared
 * when the [Fragment]'s view lifecycle reaches the "destroyed" state.
 */
class FragmentViewBindingDelegate<VB : ViewBinding>(
    private val fragment: Fragment,
    private val viewBindingFactory: (View) -> VB,
) : ReadOnlyProperty<Fragment, VB>, LifecycleObserver {

    private var binding: VB? = null

    init {
        fragment.lifecycle.addObserver(
            object : DefaultLifecycleObserver {
                val liveDataObserver = Observer<LifecycleOwner> {
                    val viewLifecycleOwner = it ?: return@Observer
                    viewLifecycleOwner.lifecycle.addObserver(
                        object : DefaultLifecycleObserver {
                            override fun onDestroy(owner: LifecycleOwner) {
                                binding.cleanUpRecyclerAdapters()
                                binding = null
                            }
                        }
                    )
                }

                override fun onCreate(owner: LifecycleOwner) {
                    fragment.viewLifecycleOwnerLiveData.observeForever(liveDataObserver)
                }

                override fun onDestroy(owner: LifecycleOwner) {
                    fragment.viewLifecycleOwnerLiveData.removeObserver(liveDataObserver)
                }
            }
        )
    }

    private fun buildBindingIfNeeded() {
        if (binding == null) {
            binding = viewBindingFactory.invoke(fragment.requireView())
        }
    }

    /**
     * Returns the [ViewBinding] object.
     */
    override fun getValue(thisRef: Fragment, property: KProperty<*>): VB {
        val lifecycle = fragment.viewLifecycleOwner.lifecycle
        if (!lifecycle.currentState.isAtLeast(Lifecycle.State.INITIALIZED)) {
            throw IllegalStateException("Fragment views are destroyed.")
        }
        buildBindingIfNeeded()
        return binding!!
    }
}
