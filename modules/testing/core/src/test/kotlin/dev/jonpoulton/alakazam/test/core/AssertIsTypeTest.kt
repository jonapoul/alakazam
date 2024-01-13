package dev.jonpoulton.alakazam.test.core

import org.junit.Test

internal class AssertIsTypeTest {
  @Test
  fun `assertIsType valid 1`() = assertIsType<DataClass>(DATA1)

  @Test
  fun `assertIsType valid 2`() = assertIsType<Int>(INT)

  @Test
  fun `assertIsType valid 3`() = assertIsType<Double>(DOUBLE)

  @Test
  fun `assertIsType valid 4`() = assertIsType<Boolean>(BOOL)

  @Test
  fun `assertIsType valid 5`() = assertIsType<Float>(FLOAT)

  @Test
  fun `assertIsType valid 6`() = assertIsType<Double>(DATA1.double)

  @Test
  fun `assertIsType invalid 1`() = checkFailed { assertIsType<AbstractClass>(FinalClass) }

  @Test
  fun `assertIsType invalid 2`() = checkFailed { assertIsType<IInterface>(InterfaceImpl) }

  @Test
  fun `assertIsType invalid 3`() = checkFailed { assertIsType<Int>(LONG) }

  @Test
  fun `assertIsType invalid 4`() = checkFailed { assertIsType<Int>(BOOL) }

  @Test
  fun `assertIsType invalid 5`() = checkFailed { assertIsType<Boolean>(INT) }
}
