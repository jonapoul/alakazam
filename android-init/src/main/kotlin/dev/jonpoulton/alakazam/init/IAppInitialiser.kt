package dev.jonpoulton.alakazam.init

import android.app.Application

interface IAppInitialiser {
  fun shouldGoFirst(): Boolean = false
  fun init(app: Application)
}
