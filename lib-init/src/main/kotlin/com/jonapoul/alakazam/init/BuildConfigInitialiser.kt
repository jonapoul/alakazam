package com.jonapoul.alakazam.init

import android.app.Application
import com.jonapoul.alakazam.core.IBuildConfig
import timber.log.Timber
import javax.inject.Inject

internal class BuildConfigInitialiser @Inject constructor(
    private val buildConfig: IBuildConfig,
) : IAppInitialiser {
    override fun init(app: Application) {
        Timber.i("Build config = $buildConfig")
    }
}
