package com.jonapoul.common.domain.init

import android.app.Application
import javax.inject.Inject

class AppInitialisers @Inject constructor(
    private val initialisers: Set<@JvmSuppressWildcards IAppInitialiser>,
) {
    fun init(app: Application) {
        /* Begin logging first, before the others */
        initialisers
            .filterIsInstance<LoggingInitialiser>()
            .forEach { it.init(app) }

        /* Then run all other initialisers */
        initialisers
            .filterNot { it is LoggingInitialiser }
            .forEach { it.init(app) }
    }
}
