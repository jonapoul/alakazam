/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
@file:Suppress("TooManyFunctions")

package alakazam.kotlin.logging

public object Logger : Tree {
  override val explicitTag: ThreadLocal<String> = ThreadLocal<String>()

  override fun v(message: String, vararg args: Any?): Unit = treeArray.forEach { it.v(message, *args) }

  override fun v(t: Throwable?, message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.v(t, message, *args) }

  override fun v(t: Throwable?): Unit = treeArray.forEach { it.v(t) }

  override fun d(message: String, vararg args: Any?): Unit = treeArray.forEach { it.d(message, *args) }

  override fun d(t: Throwable?, message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.d(t, message, *args) }

  override fun d(t: Throwable?): Unit = treeArray.forEach { it.d(t) }

  override fun i(message: String, vararg args: Any?): Unit = treeArray.forEach { it.i(message, *args) }

  override fun i(t: Throwable?, message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.i(t, message, *args) }

  override fun i(t: Throwable?): Unit = treeArray.forEach { it.i(t) }

  override fun w(message: String, vararg args: Any?): Unit = treeArray.forEach { it.w(message, *args) }

  override fun w(t: Throwable?, message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.w(t, message, *args) }

  override fun w(t: Throwable?): Unit = treeArray.forEach { it.w(t) }

  override fun e(message: String, vararg args: Any?): Unit = treeArray.forEach { it.e(message, *args) }

  override fun e(t: Throwable?, message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.e(t, message, *args) }

  override fun e(t: Throwable?): Unit = treeArray.forEach { it.e(t) }

  override fun wtf(message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.wtf(message, *args) }

  override fun wtf(t: Throwable?, message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.wtf(t, message, *args) }

  override fun wtf(t: Throwable?): Unit = treeArray.forEach { it.wtf(t) }

  override fun log(level: LogLevel, t: Throwable?): Unit = treeArray.forEach { it.log(level, t) }

  override fun log(level: LogLevel, message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.log(level, message, *args) }

  override fun log(level: LogLevel, t: Throwable?, message: String, vararg args: Any?): Unit =
    treeArray.forEach { it.log(level, t, message, *args) }

  public fun tag(tag: String): Tree {
    for (branch in treeArray) branch.explicitTag.set(tag)
    return this
  }

  public fun plant(tree: Tree) {
    require(tree !== this) { "Cannot plant Logger into itself." }
    synchronized(branchList) {
      branchList.add(tree)
      treeArray = branchList.toTypedArray()
    }
  }

  public fun uproot(tree: Tree) {
    synchronized(branchList) {
      require(branchList.remove(tree)) { "Cannot uproot tree which is not planted: $tree" }
      treeArray = branchList.toTypedArray()
    }
  }

  public fun uprootAll() {
    synchronized(branchList) {
      branchList.clear()
      treeArray = emptyArray()
    }
  }

  @Volatile
  private var treeArray = emptyArray<Tree>()
  private val branchList = ArrayList<Tree>()
}
