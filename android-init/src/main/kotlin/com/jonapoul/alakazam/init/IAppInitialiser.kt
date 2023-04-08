package com.jonapoul.alakazam.init

import android.app.Application

interface IAppInitialiser {
    fun shouldGoFirst(): Boolean
    fun init(app: Application)
}
