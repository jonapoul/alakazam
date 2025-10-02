/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.core

import alakazam.kotlin.core.CoroutineContexts
import kotlin.coroutines.CoroutineContext

public class TestCoroutineContexts(context: CoroutineContext) : CoroutineContexts {
  override val main: CoroutineContext = context
  override val io: CoroutineContext = context
  override val default: CoroutineContext = context
  override val unconfined: CoroutineContext = context

  public constructor(mainDispatcherRule: MainDispatcherRule) : this(mainDispatcherRule.dispatcher)
}
