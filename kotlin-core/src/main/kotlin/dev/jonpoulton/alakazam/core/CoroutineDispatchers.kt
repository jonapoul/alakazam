package dev.jonpoulton.alakazam.core

import kotlinx.coroutines.CoroutineDispatcher
import kotlin.coroutines.CoroutineContext

class MainDispatcher(private val delegate: CoroutineDispatcher) : CoroutineContext by delegate

class IODispatcher(private val delegate: CoroutineDispatcher) : CoroutineContext by delegate

class DefaultDispatcher(private val delegate: CoroutineDispatcher) : CoroutineContext by delegate

class UnconfinedDispatcher(private val delegate: CoroutineDispatcher) : CoroutineContext by delegate
