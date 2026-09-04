package alakazam.test

import app.cash.turbine.test
import kotlin.test.assertEquals
import kotlinx.coroutines.flow.Flow

public suspend inline fun <Input, reified Expected : Input> Flow<Input>.assertEmission(
  expected: Expected
) {
  test {
    assertEquals(expected, awaitItem())
    awaitComplete()
    cancel()
  }
}
