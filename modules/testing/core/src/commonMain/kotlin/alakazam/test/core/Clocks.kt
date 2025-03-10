@file:Suppress("FunctionName")

package alakazam.test.core

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

public fun TestClock(time: Instant): Clock = object : Clock {
  override fun now(): Instant = time
}

public fun TestClock(time: () -> Instant): Clock = object : Clock {
  override fun now(): Instant = time()
}

public fun TestClock(vararg times: Instant): Clock = TestClock(times.toList())

public fun TestClock(times: List<Instant>): Clock {
  var index = 0
  return TestClock {
    if (index >= times.size) {
      throw ArrayIndexOutOfBoundsException(index)
    }
    times[index++]
  }
}
