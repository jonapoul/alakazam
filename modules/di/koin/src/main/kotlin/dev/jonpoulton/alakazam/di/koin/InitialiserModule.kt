package dev.jonpoulton.alakazam.di.koin

import dev.jonpoulton.alakazam.android.init.AppInitializer
import dev.jonpoulton.alakazam.android.init.AppInitializers
import dev.jonpoulton.alakazam.android.init.LoggingInitializer
import org.koin.dsl.module

val initialiserModule = module {
  single {
    AppInitializers(initializers = getAll<AppInitializer>().toSet())
  }

  factory<AppInitializer> { LoggingInitializer() }
}
