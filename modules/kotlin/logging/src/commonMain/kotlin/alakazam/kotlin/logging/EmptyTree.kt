/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.logging

@Suppress("TooManyFunctions")
public object EmptyTree : Tree {
  override val explicitTag: ThreadLocal<String> = ThreadLocal<String>()

  override fun v(message: String, vararg args: Any?): Unit = Unit
  override fun v(t: Throwable?): Unit = Unit
  override fun v(t: Throwable?, message: String, vararg args: Any?): Unit = Unit

  override fun d(message: String, vararg args: Any?): Unit = Unit
  override fun d(t: Throwable?): Unit = Unit
  override fun d(t: Throwable?, message: String, vararg args: Any?): Unit = Unit

  override fun i(message: String, vararg args: Any?): Unit = Unit
  override fun i(t: Throwable?): Unit = Unit
  override fun i(t: Throwable?, message: String, vararg args: Any?): Unit = Unit

  override fun w(message: String, vararg args: Any?): Unit = Unit
  override fun w(t: Throwable?): Unit = Unit
  override fun w(t: Throwable?, message: String, vararg args: Any?): Unit = Unit

  override fun e(message: String, vararg args: Any?): Unit = Unit
  override fun e(t: Throwable?): Unit = Unit
  override fun e(t: Throwable?, message: String, vararg args: Any?): Unit = Unit

  override fun wtf(message: String, vararg args: Any?): Unit = Unit
  override fun wtf(t: Throwable?): Unit = Unit
  override fun wtf(t: Throwable?, message: String, vararg args: Any?): Unit = Unit

  override fun log(level: LogLevel, message: String, vararg args: Any?): Unit = Unit
  override fun log(level: LogLevel, t: Throwable?): Unit = Unit
  override fun log(level: LogLevel, t: Throwable?, message: String, vararg args: Any?): Unit = Unit
}
