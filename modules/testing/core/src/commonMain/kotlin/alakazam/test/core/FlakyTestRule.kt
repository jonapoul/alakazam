/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.core

import alakazam.test.core.Flaky.Companion.DEFAULT_RETRY_COUNT
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

/**
 * Repeat a test multiple times and ignore errors until the retry count is reached.
 *
 * ```
 * @get:Rule
 * val rule = FlakyTestRule()
 *
 * @Test
 * @Flaky(retry = 10)
 * fun test() { ... }
 * ```
 *
 * Adapted from https://simonmarquis.github.io/TIL/junit/#flaky-testrule
 */
public class FlakyTestRule(private val applyToAll: Boolean = false) : TestRule {
  override fun apply(statement: Statement, description: Description): Statement {
    val iterations = description.iterations(applyToAll) ?: return statement
    return FlakyTestStatement(statement, description, iterations)
  }
}

/**
 * @property reason The reason explaining what is flaky in the test, and any corresponding JIRA ticket.
 * @property retry The number of retry allowed to make the test pass successfully.
 */
public annotation class Flaky(
  val reason: String,
  val retry: Int = DEFAULT_RETRY_COUNT,
) {
  public companion object {
    public const val DEFAULT_RETRY_COUNT: Int = 3
  }
}

private fun Description.iterations(applyToAll: Boolean): Int? {
  val flakyAnnotations = annotations.filterIsInstance<Flaky>().takeUnless { it.isEmpty() }
  val numRetries = flakyAnnotations?.sumOf { it.retry }
  if (numRetries != null) {
    require(numRetries > 0) { "Flaky retry count must be > 0" }
  }
  return numRetries?.inc() ?: DEFAULT_RETRY_COUNT.takeIf { applyToAll }
}

private class FlakyTestRuleException(
  iterations: Int,
  description: Description,
  cause: Throwable?,
) : IllegalStateException("Giving up on test [${description.displayName}] after $iterations iterations.", cause)

private class FlakyTestStatement(
  private val statement: Statement,
  private val description: Description,
  private val iterations: Int,
) : Statement() {
  override fun evaluate() {
    var cause: Throwable? = null
    repeat(iterations) { iteration ->
      runCatching { statement.evaluate() }.fold(
        onSuccess = {
          val iterationCount = iteration + 1
          println("FlakyTestRule: [${description.displayName}] ${"succeeded after $iterationCount iterations."}")
          return
        },
        onFailure = { throwable ->
          cause = throwable
          throwable.printStackTrace()
        },
      )
    }
    throw FlakyTestRuleException(iterations, description, cause)
  }
}
