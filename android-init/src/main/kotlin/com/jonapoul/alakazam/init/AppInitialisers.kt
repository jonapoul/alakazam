package com.jonapoul.alakazam.init

import android.app.Application
import javax.inject.Inject

class AppInitialisers @Inject constructor(
    private val initialisers: Set<@JvmSuppressWildcards IAppInitialiser>,
) {
    fun init(app: Application) {
        initialisers
            .sortedByDescending { it.shouldGoFirst() }
            .forEach { it.init(app) }
    }
}
