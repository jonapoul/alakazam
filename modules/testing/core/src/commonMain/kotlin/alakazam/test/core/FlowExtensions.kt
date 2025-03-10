package alakazam.test.core

import app.cash.turbine.test
import kotlinx.coroutines.flow.Flow
import org.junit.Assert.assertEquals

public suspend inline fun <Input, reified Expected : Input> Flow<Input>.assertEmission(expected: Expected) {
  test {
    assertEquals(expected, awaitItem())
    awaitComplete()
    cancel()
  }
}
