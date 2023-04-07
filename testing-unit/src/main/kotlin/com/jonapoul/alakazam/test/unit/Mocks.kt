package com.jonapoul.alakazam.test.unit

import io.mockk.mockk

inline fun <reified T> relaxedMockk(): T = mockk(relaxed = true)
