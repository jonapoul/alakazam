package com.jonapoul.extensions.data.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi
class ScopeProvider @Inject constructor(dispatcherProvider: DispatcherProvider) {
    val applicationScope: CoroutineScope = CoroutineScope(dispatcherProvider.main())
}
