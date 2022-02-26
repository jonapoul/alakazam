package com.jonapoul.common.test

import app.cash.turbine.test
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filterIsInstance

suspend inline fun <Input, reified Expected> Flow<Input>.assertEmission(
    expected: Expected,
) = filterIsInstance<Expected>().test {
    assertEquals(expected, awaitItem())
    cancel()
}
