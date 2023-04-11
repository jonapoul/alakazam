package dev.jonpoulton.alakazam.test.unit

import io.mockk.mockk

inline fun <reified T> relaxedMockk(): T = mockk(relaxed = true)
