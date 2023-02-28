package com.jonapoul.common.init

import android.app.Application
import com.jonapoul.common.core.IBuildConfig
import com.jonapoul.common.logging.ConsoleLoggingTree
import timber.log.Timber
import javax.inject.Inject

internal class LoggingInitialiser @Inject constructor(
    private val buildConfig: IBuildConfig,
) : IAppInitialiser {
    override fun init(app: Application) {
        if (buildConfig.debug) {
            /* Only log to console in debug builds */
            Timber.plant(ConsoleLoggingTree())
            Timber.d("Started console logging")
        }
    }
}
