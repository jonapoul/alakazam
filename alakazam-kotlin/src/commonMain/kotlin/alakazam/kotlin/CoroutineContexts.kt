package alakazam.kotlin

import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

public interface CoroutineContexts {
  public val main: CoroutineContext
  public val io: CoroutineContext
  public val default: CoroutineContext
  public val unconfined: CoroutineContext
}

@Suppress("InjectDispatcher")
public class DefaultCoroutineContexts : CoroutineContexts {
  override val main: CoroutineContext = Dispatchers.Main
  override val io: CoroutineContext = Dispatchers.IO
  override val default: CoroutineContext = Dispatchers.Default
  override val unconfined: CoroutineContext = Dispatchers.Unconfined
}
