/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.logging

import android.os.Build
import android.util.Log
import java.util.regex.Pattern
import kotlin.math.min

public open class DebugAndroidTree : AndroidBasicTree() {
  private val fqcnIgnore = listOf(
    Logger::class.java.name,
    Tree::class.java.name,
    BasicTree::class.java.name,
    AndroidBasicTree::class.java.name,
    DebugAndroidTree::class.java.name,
  )

  @Suppress("ThrowingExceptionsWithoutMessageOrCause")
  override val tag: String?
    get() = super.tag ?: Throwable()
      .stackTrace
      .first { it.className !in fqcnIgnore }
      .let(::createStackElementTag)

  protected open fun createStackElementTag(element: StackTraceElement): String? {
    var tag = element.className.substringAfterLast('.')
    val m = ANONYMOUS_CLASS.matcher(tag)
    if (m.find()) {
      tag = m.replaceAll("")
    }
    // Tag length limit was removed in API 26.
    return if (tag.length <= MAX_TAG_LENGTH || Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
      tag
    } else {
      tag.substring(0, MAX_TAG_LENGTH)
    }
  }

  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    if (message.length < MAX_LOG_LENGTH) {
      if (priority == Log.ASSERT) {
        Log.wtf(tag, message)
      } else {
        Log.println(priority, tag, message)
      }
      return
    }

    // Split by line, then ensure each line can fit into Log's maximum length.
    var i = 0
    val length = message.length
    while (i < length) {
      var newline = message.indexOf('\n', i)
      newline = if (newline != -1) newline else length
      do {
        val end = min(newline, i + MAX_LOG_LENGTH)
        val part = message.substring(i, end)
        if (priority == Log.ASSERT) {
          Log.wtf(tag, part)
        } else {
          Log.println(priority, tag, part)
        }
        i = end
      } while (i < newline)
      i++
    }
  }

  public companion object {
    private const val MAX_LOG_LENGTH = 4000
    private const val MAX_TAG_LENGTH = 23
    private val ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$")
  }
}
