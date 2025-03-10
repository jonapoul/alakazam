package alakazam.test.core

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
internal class AssertListEqualsValidTest(private val a: List<Any>, private val b: List<Any>) {
  @Test
  fun `assertListEquals valid`() = assertListEquals(a, b)

  companion object {
    @JvmStatic
    @Parameterized.Parameters
    fun data() = listOf(
      arrayOf(INTS, INTS),
      arrayOf(INTS, copyOf(INTS)),
      arrayOf(LONGS, LONGS),
      arrayOf(LONGS, copyOf(LONGS)),
      arrayOf(FLOATS, FLOATS),
      arrayOf(FLOATS, copyOf(FLOATS)),
      arrayOf(DOUBLES, DOUBLES),
      arrayOf(DOUBLES, copyOf(DOUBLES)),
      arrayOf(BOOLS, BOOLS),
      arrayOf(BOOLS, copyOf(BOOLS)),
    )

    private fun <T> copyOf(list: List<T>): List<T> = arrayListOf<T>().apply { addAll(list) }
  }
}
