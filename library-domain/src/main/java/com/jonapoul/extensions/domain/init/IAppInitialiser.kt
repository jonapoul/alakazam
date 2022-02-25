package com.jonapoul.extensions.domain.init

import android.app.Application

interface IAppInitialiser {
    fun init(app: Application)
}
