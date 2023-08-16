package dev.jonpoulton.alakazam.di

import dev.jonpoulton.alakazam.core.DefaultDispatcher
import dev.jonpoulton.alakazam.core.IODispatcher
import dev.jonpoulton.alakazam.core.MainDispatcher
import dev.jonpoulton.alakazam.core.UnconfinedDispatcher
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
