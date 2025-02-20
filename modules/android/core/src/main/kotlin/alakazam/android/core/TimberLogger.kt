package alakazam.android.core

import alakazam.kotlin.core.Logger
import timber.log.Timber

@Suppress("TooManyFunctions")
public object TimberLogger : Logger {
  override fun v(message: String?, vararg args: Any?): Unit = Timber.v(message, *args)
  override fun v(t: Throwable?, message: String?, vararg args: Any?): Unit = Timber.v(t, message, *args)
  override fun v(t: Throwable?): Unit = Timber.v(t)

  override fun d(message: String?, vararg args: Any?): Unit = Timber.d(message, *args)
  override fun d(t: Throwable?, message: String?, vararg args: Any?): Unit = Timber.d(t, message, *args)
  override fun d(t: Throwable?): Unit = Timber.d(t)

  override fun i(message: String?, vararg args: Any?): Unit = Timber.i(message, *args)
  override fun i(t: Throwable?, message: String?, vararg args: Any?): Unit = Timber.i(t, message, *args)
  override fun i(t: Throwable?): Unit = Timber.i(t)

  override fun w(message: String?, vararg args: Any?): Unit = Timber.w(message, *args)
  override fun w(t: Throwable?, message: String?, vararg args: Any?): Unit = Timber.w(t, message, *args)
  override fun w(t: Throwable?): Unit = Timber.w(t)

  override fun e(message: String?, vararg args: Any?): Unit = Timber.e(message, *args)
  override fun e(t: Throwable?, message: String?, vararg args: Any?): Unit = Timber.e(t, message, *args)
  override fun e(t: Throwable?): Unit = Timber.e(t)

  override fun wtf(message: String?, vararg args: Any?): Unit = Timber.wtf(message, *args)
  override fun wtf(t: Throwable?, message: String?, vararg args: Any?): Unit = Timber.wtf(t, message, *args)
  override fun wtf(t: Throwable?): Unit = Timber.wtf(t)

  override fun log(priority: Int, message: String?, vararg args: Any?): Unit =
    Timber.log(priority, message, *args)

  override fun log(priority: Int, t: Throwable?, message: String?, vararg args: Any?): Unit =
    Timber.log(priority, t, message, *args)

  override fun log(priority: Int, t: Throwable?): Unit =
    Timber.log(priority, t)

  override fun tag(tag: String): Logger {
    Timber.tag(tag)
    return this
  }
}
