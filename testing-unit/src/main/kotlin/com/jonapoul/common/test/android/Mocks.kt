package com.jonapoul.common.test.android

import io.mockk.mockk

inline fun <reified T> relaxedMockk(): T = mockk(relaxed = true)
