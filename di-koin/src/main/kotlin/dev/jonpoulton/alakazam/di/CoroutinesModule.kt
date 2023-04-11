package dev.jonpoulton.alakazam.di

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named
import org.koin.dsl.module

@Suppress("InjectDispatcher")
val coroutineModule = module {
  /* Application scope */
  single { CoroutineScope(SupervisorJob()) }

  /* Dispatchers */
  single<CoroutineDispatcher>(named(KoinDispatchers.MAIN)) { Dispatchers.Main }
  single(named(KoinDispatchers.IO)) { Dispatchers.IO }
  single(named(KoinDispatchers.DEFAULT)) { Dispatchers.Default }
}

object KoinDispatchers {
  const val MAIN = "KoinDispatchers.MAIN"
  const val IO = "KoinDispatchers.IO"
  const val DEFAULT = "KoinDispatchers.DEFAULT"
}

fun KoinComponent.injectMainDispatcher(): Lazy<CoroutineDispatcher> =
  inject(named(KoinDispatchers.MAIN))

fun KoinComponent.injectIoDispatcher(): Lazy<CoroutineDispatcher> =
  inject(named(KoinDispatchers.IO))

fun KoinComponent.injectDefaultDispatcher(): Lazy<CoroutineDispatcher> =
  inject(named(KoinDispatchers.DEFAULT))

fun KoinComponent.injectCoroutineScope(): Lazy<CoroutineScope> =
  inject()
