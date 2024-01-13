package dev.jonpoulton.alakazam.android.logging

import timber.log.Timber

public abstract class TaggedDebugTree(private val prefix: String?) : Timber.DebugTree() {
  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    val taggedMessage = if (prefix == null) message else "$prefix: $message"
    super.log(priority, tag, taggedMessage, t)
  }

  override fun createStackElementTag(element: StackTraceElement): String {
    return "(${element.fileName}:${element.lineNumber})#${element.methodName}"
  }
}
