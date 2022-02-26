package com.jonapoul.common.test

import io.mockk.MockKAnnotations
import io.mockk.unmockkAll
import org.junit.rules.TestRule
import org.junit.rules.TestWatcher
import org.junit.runner.Description

/**
 * Handles the initialisation and tearing down of mock objects using the @MockK or @RelaxedMockK
 * annotations. Each mock will be re-initialised and torn down at the beginning and end of each
 * test.
 */
class MockkRule(private val subject: Any) : TestWatcher(), TestRule {
    override fun starting(description: Description?) {
        super.starting(description)
        MockKAnnotations.init(subject)
    }

    override fun finished(description: Description?) {
        super.finished(description)
        unmockkAll()
    }
}
