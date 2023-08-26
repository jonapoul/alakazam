package dev.jonpoulton.alakazam.di.koin

import dev.jonpoulton.alakazam.kotlin.core.DefaultDispatcher
import dev.jonpoulton.alakazam.kotlin.core.IODispatcher
import dev.jonpoulton.alakazam.kotlin.core.MainDispatcher
import dev.jonpoulton.alakazam.kotlin.core.UnconfinedDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.dsl.module

@Suppress("InjectDispatcher")
val coroutineModule = module {
  /* Application scope */
  single { CoroutineScope(SupervisorJob()) }

  /* Dispatchers */
  single { MainDispatcher(Dispatchers.Main) }
  single { IODispatcher(Dispatchers.IO) }
  single { DefaultDispatcher(Dispatchers.Default) }
  single { UnconfinedDispatcher(Dispatchers.Unconfined) }
}
