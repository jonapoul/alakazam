package com.jonapoul.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

fun <T> LifecycleOwner.collectFlow(flow: Flow<T>, callback: (T) -> Unit): Job {
    return lifecycleScope.launch {
        flow.collect {
            callback.invoke(it)
        }
    }
}
