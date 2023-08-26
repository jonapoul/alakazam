package dev.jonpoulton.alakazam.di.koin

import dev.jonpoulton.alakazam.android.init.AppInitialisers
import dev.jonpoulton.alakazam.android.init.IAppInitialiser
import dev.jonpoulton.alakazam.android.init.LoggingInitialiser
import org.koin.dsl.module

val initialiserModule = module {
  single {
    AppInitialisers(initialisers = getAll<IAppInitialiser>().toSet())
  }

  factory<IAppInitialiser> { LoggingInitialiser() }
}
