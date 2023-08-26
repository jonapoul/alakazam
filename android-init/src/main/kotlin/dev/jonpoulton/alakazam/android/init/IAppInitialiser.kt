package dev.jonpoulton.alakazam.android.init

interface IAppInitialiser {
  fun shouldGoFirst(): Boolean = false
  fun init()
}
