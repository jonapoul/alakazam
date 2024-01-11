package dev.jonpoulton.alakazam.kotlin.core

interface LoopController {
  fun shouldLoop(): Boolean
}

object InfiniteLoopController : LoopController {
  override fun shouldLoop(): Boolean = true
}
