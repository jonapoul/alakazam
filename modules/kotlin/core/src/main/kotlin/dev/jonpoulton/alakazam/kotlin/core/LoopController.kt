package dev.jonpoulton.alakazam.kotlin.core

public interface LoopController {
  public fun shouldLoop(): Boolean
}

public object InfiniteLoopController : LoopController {
  override fun shouldLoop(): Boolean = true
}
