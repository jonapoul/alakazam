package com.jonapoul.extensions

import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

fun <T> Fragment.collectFlow(flow: Flow<T>, callback: (T) -> Unit): Job {
    return viewLifecycleOwner.lifecycleScope.launch {
        flow.collect {
            callback.invoke(it)
        }
    }
}
