package alakazam.kotlin.logging

import android.util.Log

public abstract class AndroidBasicTree : BasicTree() {
  protected abstract fun log(priority: Int, tag: String?, message: String, t: Throwable?)

  final override fun log(level: LogLevel, tag: String?, message: String, t: Throwable?) {
    val priority = when (level) {
      LogLevel.Verbose -> Log.VERBOSE
      LogLevel.Debug -> Log.DEBUG
      LogLevel.Info -> Log.INFO
      LogLevel.Warn -> Log.WARN
      LogLevel.Error -> Log.ERROR
      LogLevel.Assert -> Log.ASSERT
    }
    log(priority, tag, message, t)
  }
}
