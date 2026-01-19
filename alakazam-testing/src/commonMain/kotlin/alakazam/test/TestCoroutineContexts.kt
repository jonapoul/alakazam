package alakazam.test

import alakazam.kotlin.CoroutineContexts
import kotlin.coroutines.CoroutineContext

public class TestCoroutineContexts(context: CoroutineContext) : CoroutineContexts {
  override val main: CoroutineContext = context
  override val io: CoroutineContext = context
  override val default: CoroutineContext = context
  override val unconfined: CoroutineContext = context

  public constructor(mainDispatcherRule: MainDispatcherRule) : this(mainDispatcherRule.dispatcher)
}
