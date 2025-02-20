package alakazam.di.koin

import alakazam.kotlin.core.CoroutineContexts
import alakazam.kotlin.core.DefaultCoroutineContexts
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.core.module.Module
import org.koin.dsl.module

@Suppress("InjectDispatcher")
public val coroutineModule: Module = module {
  // Application scope
  single { CoroutineScope(SupervisorJob()) }

  // Contexts
  single<CoroutineContexts> { DefaultCoroutineContexts() }
}
