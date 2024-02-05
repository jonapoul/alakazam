package alakazam.android.init

public interface AppInitializer {
  public fun shouldGoFirst(): Boolean = false
  public fun init()
}
