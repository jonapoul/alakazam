package com.jonapoul.alakazam.init

import android.app.Application
import com.jonapoul.alakazam.core.IBuildConfig
import com.jonapoul.alakazam.logging.ConsoleLoggingTree
import timber.log.Timber
import javax.inject.Inject

class LoggingInitialiser @Inject constructor(
    private val buildConfig: IBuildConfig,
) : IAppInitialiser {
    override fun shouldGoFirst(): Boolean = true

    override fun init(app: Application) {
        if (buildConfig.debug) {
            /* Only log to console in debug builds */
            Timber.plant(ConsoleLoggingTree())
            Timber.d("Started console logging")
        }
    }
}
