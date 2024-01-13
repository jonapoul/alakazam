package dev.jonpoulton.alakazam.test.core

import app.cash.turbine.test
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filterIsInstance
import org.junit.Assert.assertEquals

public suspend inline fun <Input, reified Expected> Flow<Input>.assertEmission(
  expected: Expected,
): Unit = filterIsInstance<Expected>().test {
  assertEquals(expected, awaitItem())
  awaitComplete()
  cancel()
}
