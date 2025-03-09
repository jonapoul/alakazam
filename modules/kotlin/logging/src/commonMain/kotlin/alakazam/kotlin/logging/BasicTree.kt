package alakazam.kotlin.logging

import alakazam.kotlin.logging.LogLevel.Assert
import alakazam.kotlin.logging.LogLevel.Debug
import alakazam.kotlin.logging.LogLevel.Error
import alakazam.kotlin.logging.LogLevel.Info
import alakazam.kotlin.logging.LogLevel.Verbose
import alakazam.kotlin.logging.LogLevel.Warn
import java.io.PrintWriter
import java.io.StringWriter

@Suppress("TooManyFunctions")
public abstract class BasicTree : Tree {
  final override val explicitTag: ThreadLocal<String> = ThreadLocal<String>()

  public open val tag: String?
    get() {
      val tag = explicitTag.get()
      if (tag != null) {
        explicitTag.remove()
      }
      return tag
    }

  final override fun v(message: String, vararg args: Any?): Unit =
    prepareLog(Verbose, null, message, *args)

  final override fun v(t: Throwable?, message: String, vararg args: Any?): Unit =
    prepareLog(Verbose, t, message, *args)

  final override fun v(t: Throwable?): Unit =
    prepareLog(Verbose, t, null)

  final override fun d(message: String, vararg args: Any?): Unit =
    prepareLog(Debug, null, message, *args)

  final override fun d(t: Throwable?, message: String, vararg args: Any?): Unit =
    prepareLog(Debug, t, message, *args)

  final override fun d(t: Throwable?): Unit =
    prepareLog(Debug, t, null)

  final override fun i(message: String, vararg args: Any?): Unit =
    prepareLog(Info, null, message, *args)

  final override fun i(t: Throwable?, message: String, vararg args: Any?): Unit =
    prepareLog(Info, t, message, *args)

  final override fun i(t: Throwable?): Unit =
    prepareLog(Info, t, null)

  final override fun w(message: String, vararg args: Any?): Unit =
    prepareLog(Warn, null, message, *args)

  final override fun w(t: Throwable?, message: String, vararg args: Any?): Unit =
    prepareLog(Warn, t, message, *args)

  final override fun w(t: Throwable?): Unit =
    prepareLog(Warn, t, null)

  final override fun e(message: String, vararg args: Any?): Unit =
    prepareLog(Error, null, message, *args)

  final override fun e(t: Throwable?, message: String, vararg args: Any?): Unit =
    prepareLog(Error, t, message, *args)

  final override fun e(t: Throwable?): Unit =
    prepareLog(Error, t, null)

  final override fun wtf(message: String, vararg args: Any?): Unit =
    prepareLog(Assert, null, message, *args)

  final override fun wtf(t: Throwable?): Unit =
    prepareLog(Assert, t, null)

  final override fun wtf(t: Throwable?, message: String, vararg args: Any?): Unit =
    prepareLog(Assert, t, message, *args)

  final override fun log(level: LogLevel, message: String, vararg args: Any?): Unit =
    prepareLog(level, null, message, *args)

  final override fun log(level: LogLevel, t: Throwable?): Unit =
    prepareLog(level, t, null)

  final override fun log(level: LogLevel, t: Throwable?, message: String, vararg args: Any?): Unit =
    prepareLog(level, t, message, *args)

  private fun prepareLog(level: LogLevel, t: Throwable?, message: String?, vararg args: Any?) {
    // Consume tag even when message is not loggable so that next message is correctly tagged.
    val tag = tag
    var msg = message
    if (msg.isNullOrEmpty()) {
      // Swallow message if it's null and there's no throwable.
      if (t == null) return
      msg = getStackTraceString(t)
    } else {
      if (args.isNotEmpty()) msg = formatMessage(msg, args)
      if (t != null) msg += "\n" + getStackTraceString(t)
    }

    log(level, tag, msg, t)
  }

  @Suppress("SpreadOperator")
  protected open fun formatMessage(message: String, args: Array<out Any?>): String = message.format(*args)

  private fun getStackTraceString(t: Throwable): String {
    // Don't replace this with Log.getStackTraceString() - it hides UnknownHostException, which is not what we want.
    val sw = StringWriter(TAG_SIZE)
    val pw = PrintWriter(sw, false)
    t.printStackTrace(pw)
    pw.flush()
    return sw.toString()
  }

  protected abstract fun log(level: LogLevel, tag: String?, message: String, t: Throwable?)

  private companion object {
    const val TAG_SIZE = 256
  }
}
