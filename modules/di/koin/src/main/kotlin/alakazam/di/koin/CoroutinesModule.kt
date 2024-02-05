package alakazam.di.koin

import alakazam.kotlin.core.DefaultDispatcher
import alakazam.kotlin.core.IODispatcher
import alakazam.kotlin.core.MainDispatcher
import alakazam.kotlin.core.UnconfinedDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.core.module.Module
import org.koin.dsl.module

@Suppress("InjectDispatcher")
public val coroutineModule: Module = module {
  // Application scope
  single { CoroutineScope(SupervisorJob()) }

  // Dispatchers
  single { MainDispatcher(Dispatchers.Main) }
  single { IODispatcher(Dispatchers.IO) }
  single { DefaultDispatcher(Dispatchers.Default) }
  single { UnconfinedDispatcher(Dispatchers.Unconfined) }
}
