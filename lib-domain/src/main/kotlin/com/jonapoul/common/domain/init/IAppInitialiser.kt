package com.jonapoul.common.domain.init

import android.app.Application

interface IAppInitialiser {
    fun init(app: Application)
}
