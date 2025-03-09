package alakazam.kotlin.logging

import java.io.PrintStream

public open class PrintStreamTree(private val stream: PrintStream = System.out) : BasicTree() {
  override fun log(level: LogLevel, tag: String?, message: String, t: Throwable?) {
    stream.println("$level/$tag: $message")
    t?.printStackTrace(stream)
  }
}
