/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.core

import alakazam.kotlin.core.LoopController

public open class FiniteLoopController(private val maxLoops: Int) : LoopController {
  private var numLoops: Int = 0

  override fun shouldLoop(): Boolean {
    val result = numLoops < maxLoops
    numLoops++
    return result
  }
}

public class SingleLoopController : FiniteLoopController(maxLoops = 1)
