package dev.jonpoulton.alakazam.android.init

interface AppInitializer {
  fun shouldGoFirst(): Boolean = false
  fun init()
}
