package alakazam.android.core

import timber.log.Timber

public open class TaggedDebugTree(private val prefix: String?) : Timber.DebugTree() {
  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    val taggedMessage = if (prefix == null) message else "$prefix: $message"
    super.log(priority, tag, taggedMessage, t)
  }

  override fun createStackElementTag(element: StackTraceElement): String =
    "(${element.fileName}:${element.lineNumber})#${element.methodName}"
}
