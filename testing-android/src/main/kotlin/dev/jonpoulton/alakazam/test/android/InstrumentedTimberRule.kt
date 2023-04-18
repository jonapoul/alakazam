package dev.jonpoulton.alakazam.test.android

import org.junit.rules.TestWatcher
import org.junit.runner.Description
import timber.log.Timber

class InstrumentedTimberRule : TestWatcher() {
  override fun starting(description: Description?) {
    super.starting(description)
    Timber.plant()
  }

  override fun finished(description: Description?) {
    super.finished(description)
    Timber.uproot(TREE)
  }

  private companion object {
    val TREE = object : Timber.DebugTree() {
      override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        println("$priority/$tag: $message")
        t?.printStackTrace()
      }
    }
  }
}
