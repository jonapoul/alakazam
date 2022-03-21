package com.jonapoul.common.test.android

import io.mockk.MockKAnnotations
import io.mockk.unmockkAll
import org.junit.rules.TestWatcher
import org.junit.runner.Description

class MockkAndroidRule(private val subject: Any) : TestWatcher() {
    override fun starting(description: Description?) {
        super.starting(description)
        MockKAnnotations.init(subject)
    }

    override fun finished(description: Description?) {
        super.finished(description)
        unmockkAll()
    }
}