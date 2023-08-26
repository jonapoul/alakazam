package dev.jonpoulton.alakazam.android.init

class AppInitialisers(
  private val initialisers: Set<IAppInitialiser>,
) {
  fun init() {
    initialisers
      .sortedByDescending { it.shouldGoFirst() }
      .forEach { it.init() }
  }
}
