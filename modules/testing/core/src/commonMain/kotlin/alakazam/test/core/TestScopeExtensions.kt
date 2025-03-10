package alakazam.test.core

import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.UnconfinedTestDispatcher

public val TestScope.standardDispatcher: TestDispatcher
  get() = StandardTestDispatcher(testScheduler)

public val TestScope.unconfinedDispatcher: TestDispatcher
  get() = UnconfinedTestDispatcher(testScheduler)
