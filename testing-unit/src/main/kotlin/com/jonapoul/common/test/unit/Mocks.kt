package com.jonapoul.common.test.unit

import io.mockk.mockk

inline fun <reified T> relaxedMockk(): T = mockk(relaxed = true)
