package dev.jonpoulton.alakazam.init

interface IAppInitialiser {
  fun shouldGoFirst(): Boolean = false
  fun init()
}
