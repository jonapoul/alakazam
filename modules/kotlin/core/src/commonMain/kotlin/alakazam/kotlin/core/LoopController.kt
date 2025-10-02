/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.core

public interface LoopController {
  public fun shouldLoop(): Boolean
}

public object InfiniteLoopController : LoopController {
  override fun shouldLoop(): Boolean = true
}
