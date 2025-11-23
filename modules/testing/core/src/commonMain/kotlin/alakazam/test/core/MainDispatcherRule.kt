/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.core

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.rules.TestWatcher
import org.junit.runner.Description

/**
 * This rule should be added to any test containing any coroutines/Flows, since it sets the main dispatcher to run in
 * a controlled `TestDispatcher`. Use as:
 *
 *      @get:Rule
 *      val dispatcherRule = MainDispatcherRule()
 *
 *      @Test
 *      fun `My wicked test`() = runTest {
 *          launch(Dispatchers.Main) {
 *              assertEquals(1+1, 2)
 *          }
 *      }
 */
public class MainDispatcherRule(
  public val dispatcher: TestDispatcher = UnconfinedTestDispatcher(),
) : TestWatcher() {
  override fun starting(description: Description?) {
    super.starting(description)
    Dispatchers.setMain(dispatcher)
  }

  override fun finished(description: Description?) {
    super.finished(description)
    Dispatchers.resetMain()
  }
}
