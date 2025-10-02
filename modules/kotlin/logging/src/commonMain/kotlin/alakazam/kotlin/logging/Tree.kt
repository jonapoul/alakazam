/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.logging

@Suppress("TooManyFunctions")
public interface Tree {
  public val explicitTag: ThreadLocal<String>

  public fun v(message: String, vararg args: Any?)
  public fun v(t: Throwable?, message: String, vararg args: Any?)
  public fun v(t: Throwable?)

  public fun d(message: String, vararg args: Any?)
  public fun d(t: Throwable?, message: String, vararg args: Any?)
  public fun d(t: Throwable?)

  public fun i(message: String, vararg args: Any?)
  public fun i(t: Throwable?, message: String, vararg args: Any?)
  public fun i(t: Throwable?)

  public fun w(message: String, vararg args: Any?)
  public fun w(t: Throwable?, message: String, vararg args: Any?)
  public fun w(t: Throwable?)

  public fun e(message: String, vararg args: Any?)
  public fun e(t: Throwable?, message: String, vararg args: Any?)
  public fun e(t: Throwable?)

  public fun wtf(message: String, vararg args: Any?)
  public fun wtf(t: Throwable?, message: String, vararg args: Any?)
  public fun wtf(t: Throwable?)

  public fun log(level: LogLevel, message: String, vararg args: Any?)
  public fun log(level: LogLevel, t: Throwable?, message: String, vararg args: Any?)
  public fun log(level: LogLevel, t: Throwable?)
}
