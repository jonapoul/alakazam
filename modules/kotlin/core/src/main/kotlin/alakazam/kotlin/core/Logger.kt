@file:Suppress("TooManyFunctions")

package alakazam.kotlin.core

public interface Logger {
  public fun v(message: String?, vararg args: Any?)
  public fun v(t: Throwable?, message: String?, vararg args: Any?)
  public fun v(t: Throwable?)
  public fun d(message: String?, vararg args: Any?)
  public fun d(t: Throwable?, message: String?, vararg args: Any?)
  public fun d(t: Throwable?)
  public fun i(message: String?, vararg args: Any?)
  public fun i(t: Throwable?, message: String?, vararg args: Any?)
  public fun i(t: Throwable?)
  public fun w(message: String?, vararg args: Any?)
  public fun w(t: Throwable?, message: String?, vararg args: Any?)
  public fun w(t: Throwable?)
  public fun e(message: String?, vararg args: Any?)
  public fun e(t: Throwable?, message: String?, vararg args: Any?)
  public fun e(t: Throwable?)
  public fun wtf(message: String?, vararg args: Any?)
  public fun wtf(t: Throwable?, message: String?, vararg args: Any?)
  public fun wtf(t: Throwable?)
  public fun log(priority: Int, message: String?, vararg args: Any?)
  public fun log(priority: Int, t: Throwable?, message: String?, vararg args: Any?)
  public fun log(priority: Int, t: Throwable?)
  public fun tag(tag: String): Logger
}

public object EmptyLogger : Logger {
  override fun v(message: String?, vararg args: Any?): Unit = Unit
  override fun v(t: Throwable?, message: String?, vararg args: Any?): Unit = Unit
  override fun v(t: Throwable?): Unit = Unit
  override fun d(message: String?, vararg args: Any?): Unit = Unit
  override fun d(t: Throwable?, message: String?, vararg args: Any?): Unit = Unit
  override fun d(t: Throwable?): Unit = Unit
  override fun i(message: String?, vararg args: Any?): Unit = Unit
  override fun i(t: Throwable?, message: String?, vararg args: Any?): Unit = Unit
  override fun i(t: Throwable?): Unit = Unit
  override fun w(message: String?, vararg args: Any?): Unit = Unit
  override fun w(t: Throwable?, message: String?, vararg args: Any?): Unit = Unit
  override fun w(t: Throwable?): Unit = Unit
  override fun e(message: String?, vararg args: Any?): Unit = Unit
  override fun e(t: Throwable?, message: String?, vararg args: Any?): Unit = Unit
  override fun e(t: Throwable?): Unit = Unit
  override fun wtf(message: String?, vararg args: Any?): Unit = Unit
  override fun wtf(t: Throwable?, message: String?, vararg args: Any?): Unit = Unit
  override fun wtf(t: Throwable?): Unit = Unit
  override fun log(priority: Int, message: String?, vararg args: Any?): Unit = Unit
  override fun log(priority: Int, t: Throwable?, message: String?, vararg args: Any?): Unit = Unit
  override fun log(priority: Int, t: Throwable?): Unit = Unit
  override fun tag(tag: String): Logger = this
}
