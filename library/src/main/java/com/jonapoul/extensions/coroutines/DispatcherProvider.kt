package com.jonapoul.extensions.coroutines

import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class DispatcherProvider @Inject constructor() {
    fun main() = Dispatchers.Main
    fun io() = Dispatchers.IO
}
