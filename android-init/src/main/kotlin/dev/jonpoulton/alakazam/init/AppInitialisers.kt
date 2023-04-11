package dev.jonpoulton.alakazam.init

import android.app.Application

class AppInitialisers(
  private val initialisers: Set<IAppInitialiser>,
) {
  fun init(app: Application) {
    initialisers
      .sortedByDescending { it.shouldGoFirst() }
      .forEach { it.init(app) }
  }
}
