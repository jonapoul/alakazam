/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.logging

public open class TaggedDebugTree(
  private val prefix: String?,
  private val includeLineNumber: Boolean = true,
  private val includeMethodName: Boolean = false,
) : DebugAndroidTree() {
  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    val taggedMessage = if (prefix == null) message else "$prefix: $message"
    super.log(priority, tag, taggedMessage, t)
  }

  override fun createStackElementTag(element: StackTraceElement): String? {
    val methodName = if (includeMethodName) "#${element.methodName}" else ""
    return if (includeLineNumber) {
      "(${element.fileName}:${element.lineNumber})$methodName"
    } else {
      "${element.fileName}#$methodName"
    }
  }
}
