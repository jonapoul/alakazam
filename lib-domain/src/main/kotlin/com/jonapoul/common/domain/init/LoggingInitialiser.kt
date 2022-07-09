package com.jonapoul.common.domain.init

import android.app.Application
import com.jonapoul.common.core.IBuildConfig
import com.jonapoul.common.core.logging.ConsoleLoggingTree
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
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

@InstallIn(SingletonComponent::class)
@Module
internal interface BindsLoggingInitialiserModule {
    @Binds
    @IntoSet
    fun initialiser(bind: LoggingInitialiser): IAppInitialiser
}
