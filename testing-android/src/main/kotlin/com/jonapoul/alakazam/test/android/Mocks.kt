package com.jonapoul.alakazam.test.android

import io.mockk.mockk

inline fun <reified T> relaxedMockk(): T = mockk(relaxed = true)
