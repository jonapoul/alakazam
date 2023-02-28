package com.jonapoul.common.init

import android.app.Application
import com.jonapoul.common.core.IBuildConfig
import timber.log.Timber
import javax.inject.Inject

internal class BuildConfigInitialiser @Inject constructor(
    private val buildConfig: IBuildConfig,
) : IAppInitialiser {
    override fun init(app: Application) {
        Timber.i("Build config = $buildConfig")
    }
}
