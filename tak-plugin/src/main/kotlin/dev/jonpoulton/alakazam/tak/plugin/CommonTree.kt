package dev.jonpoulton.alakazam.tak.plugin

import timber.log.Timber

class CommonTree(private val prefix: String) : Timber.DebugTree() {
  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    super.log(priority, tag, message = "$prefix: $message", t)
  }

  override fun createStackElementTag(element: StackTraceElement): String {
    return "(${element.fileName}:${element.lineNumber})#${element.methodName}"
  }
}
