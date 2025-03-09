package alakazam.test.logging

import alakazam.kotlin.logging.BasicTree
import alakazam.kotlin.logging.LogLevel
import alakazam.kotlin.logging.Logger
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement
import java.io.PrintStream
import java.io.PrintWriter
import java.io.StringWriter
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Locale

public class LoggingRule(private val config: Config) : TestRule {
  public override fun apply(base: Statement?, description: Description?): Statement =
    LoggingStatement(base, config)

  public data class Config(
    val minPriority: LogLevel = LogLevel.Verbose,
    val showThread: Boolean = false,
    val showTimestamp: Boolean = true,
    val onlyLogWhenTestFails: Boolean = true,
  )

  public companion object {
    public fun logAllAlways(): LoggingRule = LoggingRule(Config(onlyLogWhenTestFails = true))

    public fun logAllWhenTestFails(): LoggingRule = LoggingRule(Config())

    public fun logErrorsAlways(): LoggingRule =
      LoggingRule(Config(minPriority = LogLevel.Error, onlyLogWhenTestFails = false))

    public fun logErrorsWhenTestFails(): LoggingRule =
      LoggingRule(Config(minPriority = LogLevel.Error))
  }

  private class LoggingStatement(
    private val next: Statement?,
    config: Config,
  ) : Statement() {
    private val tree = BufferedTree(config, output = System.out)

    override fun evaluate() {
      Logger.plant(tree)
      try {
        next?.evaluate()
      } catch (t: Throwable) {
        tree.flushLogs()
        throw t
      } finally {
        Logger.uproot(tree)
      }
    }
  }

  private class BufferedTree(
    private val config: Config,
    private val output: PrintStream,
  ) : BasicTree() {
    private val messageBuffer = mutableListOf<String>()
    private val bufferLock = Any()

    override fun log(level: LogLevel, tag: String?, message: String, t: Throwable?) {
      val logMessage = createLogMessage(config, level, tag, message, t) ?: return

      if (config.onlyLogWhenTestFails) {
        synchronized(bufferLock) { messageBuffer.add(logMessage) }
      } else {
        output.println(logMessage)
      }
    }

    fun flushLogs() {
      synchronized(bufferLock) {
        messageBuffer.forEach(output::println)
        messageBuffer.clear()
      }
    }

    private companion object {
      private fun createLogMessage(
        config: Config,
        level: LogLevel,
        tag: String?,
        message: String,
        throwable: Throwable?,
      ): String? {
        if (level < config.minPriority) return null

        val type = when (level) {
          LogLevel.Verbose -> 'V'
          LogLevel.Debug -> 'D'
          LogLevel.Info -> 'I'
          LogLevel.Warn -> 'W'
          LogLevel.Error -> 'E'
          LogLevel.Assert -> 'A'
        }

        return buildString {
          if (config.showTimestamp) {
            append(THREAD_LOCAL_FORMAT.get()!!.format(System.currentTimeMillis()))
            append(" ")
          }
          if (config.showThread) {
            val thread = Thread.currentThread()
            append(thread.getThreadId())
            append("/")
            append(thread.name)
            append(" ")
          }
          append(type)
          append("/")
          append(tag.orEmpty())
          append(": ")
          append(message)

          if (throwable != null) {
            append('\n')
            val sw = StringWriter()
            val pw = PrintWriter(sw)
            throwable.printStackTrace(pw)
            append(sw.toString())
          }
        }
      }

      private val THREAD_LOCAL_FORMAT = object : ThreadLocal<DateFormat?>() {
        override fun initialValue() = SimpleDateFormat("HH:mm:ss:SSSSSSS", Locale.ENGLISH)
      }
    }
  }
}
