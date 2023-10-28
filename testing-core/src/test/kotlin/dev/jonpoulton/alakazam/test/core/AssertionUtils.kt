package dev.jonpoulton.alakazam.test.core

internal const val UNEXPECTED = "unexpected error!"

internal const val INT = 1
internal const val LONG = 1L
internal const val DOUBLE = 1.0
internal const val FLOAT = 1.0f
internal const val BOOL = true

internal data class DataClass(
  val int: Int,
  val boolean: Boolean,
  val double: Double,
)

internal val DATA1 = DataClass(INT, BOOL, DOUBLE)

internal abstract class AbstractClass

internal object FinalClass : AbstractClass()

internal interface IInterface

internal object InterfaceImpl : IInterface

internal val INTS = listOf(1, 2, 3)
internal val LONGS = listOf(1L, 2L, 3L)
internal val DOUBLES = listOf(1.0, 2.0, 3.0)
internal val FLOATS = listOf(1.0f, 2.0f, 3.0f)
internal val BOOLS = listOf(true, false, true)

internal fun checkFailed(call: () -> Unit) {
  try {
    call.invoke()
    throw AssertionError(UNEXPECTED)
  } catch (e: AssertionError) {
    if (e.message == UNEXPECTED) throw e
  }
}
