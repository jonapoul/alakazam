package dev.jonpoulton.alakazam.android.init

class AppInitializers(
  private val initializers: Set<AppInitializer>,
) {
  fun init() {
    initializers
      .sortedByDescending { it.shouldGoFirst() }
      .forEach { it.init() }
  }
}
