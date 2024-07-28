package alakazam.android.core

import timber.log.Timber

public open class TaggedDebugTree(
  private val prefix: String?,
  private val includeLineNumber: Boolean = true,
  private val includeMethodName: Boolean = false,
) : Timber.DebugTree() {
  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    val taggedMessage = if (prefix == null) message else "$prefix: $message"
    super.log(priority, tag, taggedMessage, t)
  }

  override fun createStackElementTag(element: StackTraceElement): String? {
    val methodName = if (includeMethodName) "#${element.methodName}" else ""
    return if (includeLineNumber) {
      "(${element.fileName}:${element.lineNumber})$methodName"
    } else {
      "${element.fileName}#${methodName}"
    }
  }
}
