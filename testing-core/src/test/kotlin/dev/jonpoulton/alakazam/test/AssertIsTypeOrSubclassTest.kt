package dev.jonpoulton.alakazam.test

import org.junit.Test

class AssertIsTypeOrSubclassTest {
  @Test
  fun `assertSubclass valid 1`() = assertIsTypeOrSubclass<DataClass>(DATA1)

  @Test
  fun `assertSubclass valid 2`() = assertIsTypeOrSubclass<Int>(INT)

  @Test
  fun `assertSubclass valid 3`() = assertIsTypeOrSubclass<Double>(DOUBLE)

  @Test
  fun `assertSubclass valid 4`() = assertIsTypeOrSubclass<Boolean>(BOOL)

  @Test
  fun `assertSubclass valid 5`() = assertIsTypeOrSubclass<Float>(FLOAT)

  @Test
  fun `assertSubclass valid 6`() = assertIsTypeOrSubclass<Double>(DATA1.double)

  @Test
  fun `assertSubclass valid 7`() = assertIsTypeOrSubclass<AbstractClass>(FinalClass)

  @Test
  fun `assertSubclass valid 8`() = assertIsTypeOrSubclass<IInterface>(InterfaceImpl)

  @Test
  fun `assertSubclass invalid 1`() = checkFailed { assertIsTypeOrSubclass<Int>(LONG) }

  @Test
  fun `assertSubclass invalid 2`() = checkFailed { assertIsTypeOrSubclass<Int>(BOOL) }

  @Test
  fun `assertSubclass invalid 3`() = checkFailed { assertIsTypeOrSubclass<Boolean>(INT) }
}
