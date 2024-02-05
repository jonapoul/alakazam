package alakazam.kotlin.core

import kotlinx.coroutines.CoroutineDispatcher
import kotlin.coroutines.CoroutineContext

public class MainDispatcher(private val delegate: CoroutineDispatcher) : CoroutineContext by delegate

public class IODispatcher(private val delegate: CoroutineDispatcher) : CoroutineContext by delegate

public class DefaultDispatcher(private val delegate: CoroutineDispatcher) : CoroutineContext by delegate

public class UnconfinedDispatcher(private val delegate: CoroutineDispatcher) : CoroutineContext by delegate
