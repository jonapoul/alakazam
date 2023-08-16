package dev.jonpoulton.alakazam.core

interface LoopController {
  fun shouldLoop(): Boolean
}

object InfiniteLoopController : LoopController {
  override fun shouldLoop(): Boolean = true
}
