package com.jonapoul.extensions.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope

@DelicateCoroutinesApi
class ScopeProvider(dispatcherProvider: DispatcherProvider) {
    val globalScope = GlobalScope
    val applicationScope = CoroutineScope(dispatcherProvider.main())
}
