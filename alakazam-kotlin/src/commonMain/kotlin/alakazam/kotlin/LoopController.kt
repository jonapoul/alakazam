package alakazam.kotlin

public fun interface LoopController {
  public fun shouldLoop(): Boolean
}

public object InfiniteLoopController : LoopController {
  override fun shouldLoop(): Boolean = true
}
