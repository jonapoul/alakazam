package com.jonapoul.extensions.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface IDispatcherProvider {
    fun main(): CoroutineDispatcher
    fun io(): CoroutineDispatcher
}

class DispatcherProvider : IDispatcherProvider {
    override fun main() = Dispatchers.Main
    override fun io() = Dispatchers.IO
}
