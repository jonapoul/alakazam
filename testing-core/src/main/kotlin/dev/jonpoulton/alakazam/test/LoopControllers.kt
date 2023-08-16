package dev.jonpoulton.alakazam.test

import dev.jonpoulton.alakazam.core.LoopController

open class FiniteLoopController(private val maxLoops: Int) : LoopController {
  private var numLoops: Int = 0

  override fun shouldLoop(): Boolean {
    val result = numLoops < maxLoops
    numLoops++
    return result
  }
}

class SingleLoopController : FiniteLoopController(maxLoops = 1)
