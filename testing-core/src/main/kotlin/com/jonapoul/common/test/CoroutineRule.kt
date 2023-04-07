package com.jonapoul.common.test

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestResult
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.rules.TestWatcher
import org.junit.runner.Description

/**
 * This rule should be added to any test containing any coroutines/Flows, since it handles the
 * cleaning up of any loose Jobs and also sets the main dispatcher to run in a controlled test
 * CoroutineScope. Use as:
 *
 *      @get:Rule
 *      val coroutineRule = CoroutineRule()
 *
 *      @Test
 *      fun `My wicked test`() = runTest {
 *          launch {
 *              assertEquals(1+1, 2)
 *          }
 *      }
 */
class CoroutineRule : TestWatcher() {
    val scope = TestScope()
    val dispatcher = StandardTestDispatcher(scope.testScheduler)

    fun runTest(
        timeoutMs: Long = DEFAULT_TIMEOUT_MS,
        testBody: suspend TestScope.() -> Unit,
    ): TestResult = scope.runTest(timeoutMs, testBody)

    fun advanceUntilIdle() {
        scope.testScheduler.advanceUntilIdle()
    }

    override fun starting(description: Description?) {
        super.starting(description)
        Dispatchers.setMain(dispatcher)
    }

    override fun finished(description: Description?) {
        super.finished(description)
        Dispatchers.resetMain()
    }

    private companion object {
        const val DEFAULT_TIMEOUT_MS = 10_000L
    }
}
