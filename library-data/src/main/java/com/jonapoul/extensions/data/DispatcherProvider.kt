package com.jonapoul.extensions.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class DispatcherProvider @Inject constructor() {
    fun main(): CoroutineDispatcher = Dispatchers.Main
    fun io(): CoroutineDispatcher = Dispatchers.IO
    fun default(): CoroutineDispatcher = Dispatchers.Default
}
