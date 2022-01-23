package com.jonapoul.extensions.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope

@DelicateCoroutinesApi
class ScopeProvider(dispatcherProvider: DispatcherProvider) {
    val globalScope: CoroutineScope = GlobalScope
    val applicationScope: CoroutineScope = CoroutineScope(dispatcherProvider.main())
}
