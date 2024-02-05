package alakazam.android.init

import alakazam.android.logging.ConsoleLoggingTree
import timber.log.Timber
import javax.inject.Inject

public class LoggingInitializer @Inject constructor() : AppInitializer {
  override fun shouldGoFirst(): Boolean = true

  override fun init() {
    Timber.plant(ConsoleLoggingTree())
    Timber.d("Started console logging")
  }
}
