package dev.jonpoulton.alakazam.test.core

import dev.jonpoulton.alakazam.kotlin.core.LoopController

public open class FiniteLoopController(private val maxLoops: Int) : LoopController {
  private var numLoops: Int = 0

  override fun shouldLoop(): Boolean {
    val result = numLoops < maxLoops
    numLoops++
    return result
  }
}

public class SingleLoopController : FiniteLoopController(maxLoops = 1)
