package com.jonapoul.extensions.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import javax.inject.Inject

@DelicateCoroutinesApi
class ScopeProvider @Inject constructor(dispatcherProvider: DispatcherProvider) {
    val globalScope: CoroutineScope = GlobalScope
    val applicationScope: CoroutineScope = CoroutineScope(dispatcherProvider.main())
}
