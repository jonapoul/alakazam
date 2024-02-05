package alakazam.android.init

public class AppInitializers(
  private val initializers: Set<AppInitializer>,
) {
  public fun init() {
    initializers
      .sortedByDescending { it.shouldGoFirst() }
      .forEach { it.init() }
  }
}
