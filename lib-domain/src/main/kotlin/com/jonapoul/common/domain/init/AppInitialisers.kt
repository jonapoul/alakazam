package com.jonapoul.common.domain.init

import android.app.Application
import javax.inject.Inject

class AppInitialisers @Inject constructor(
    private val initialisers: Set<@JvmSuppressWildcards IAppInitialiser>,
) {
    fun init(app: Application) {
        initialisers.forEach { it.init(app) }
    }
}
