package alakazam.test.core

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

/**
 * Repeat a test multiple times and throw any occurring error.
 * Inspiration taken from [ShampooRule](https://gist.github.com/JakeWharton/7fe7deb1f7f4a795c120) by Jake Wharton.
 *
 * ```
 * @get:Rule
 * val rule = RepeatTestRule()
 *
 * @Test
 * @Repeat(iterations = 10)
 * fun test() { ... }
 * ```
 *
 * Adapted from https://simonmarquis.github.io/TIL/junit/#repeat-testrule
 */
public class RepeatTestRule : TestRule {
  override fun apply(statement: Statement, description: Description): Statement {
    val iterations = description.iterations() ?: return statement
    return RepeatTestStatement(statement, description, iterations)
  }
}

/**
 * @property iterations The number to repeated iterations required to let a [org.junit.Test] pass successfully.
 */
public annotation class Repeat(val iterations: Int)

private fun Description.iterations(): Int? {
  val repeatAnnotations = annotations.filterIsInstance<Repeat>().takeUnless { it.isEmpty() }
  val numIterations = repeatAnnotations?.sumOf { it.iterations }
  if (numIterations != null) {
    require(numIterations > 0) { "Repeat count must be > 0" }
  }
  return numIterations?.inc()
}

private class RepeatTestRuleException(
  iterations: Int,
  description: Description,
  cause: Throwable?,
) : IllegalStateException("[${description.displayName}] failed after $iterations iterations.", cause)

private class RepeatTestStatement(
  private val statement: Statement,
  private val description: Description,
  private val iterations: Int,
) : Statement() {
  override fun evaluate() = repeat(iterations) { iteration ->
    runCatching { statement.evaluate() }
      .onFailure { throwable -> throw RepeatTestRuleException(iteration.inc(), description, cause = throwable) }
  }
}
