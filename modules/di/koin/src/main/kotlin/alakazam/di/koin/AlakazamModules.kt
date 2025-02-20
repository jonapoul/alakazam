package alakazam.di.koin

import org.koin.core.module.Module

public val alakazamModules: List<Module> = listOf(
  coroutineModule,
  coreModule,
  httpModule,
)
