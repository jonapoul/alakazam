/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
@file:Suppress("FunctionName")

package alakazam.test.core

import kotlin.time.Clock
import kotlin.time.Instant

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
