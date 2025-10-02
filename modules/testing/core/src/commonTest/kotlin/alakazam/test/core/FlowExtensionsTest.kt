/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.core

import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertIs

internal class FlowExtensionsTest {
  @Test
  fun `Assert first emission then cancel`() = runTest {
    val flow = flowOf(1)
    flow.assertEmission(1)
  }

  @Test
  fun `Throw if asserting with extra emissions after`() = runTest {
    val flow = flowOf(1, 2, 3)
    runCatching { flow.assertEmission(1) }
      .onSuccess { result -> throw IllegalStateException("Expected failure, got $result") }
      .onFailure { throwable -> assertIs<AssertionError>(throwable) }
  }
}
