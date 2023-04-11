package dev.jonpoulton.alakazam.di

import dev.jonpoulton.alakazam.init.AppInitialisers
import dev.jonpoulton.alakazam.init.IAppInitialiser
import dev.jonpoulton.alakazam.init.LoggingInitialiser
import org.koin.dsl.module

val initialiserModule = module {
  single {
    AppInitialisers(initialisers = getAll<IAppInitialiser>().toSet())
  }

  /**
   * Requires binding to be set for [dev.jonpoulton.alakazam.core.IBuildConfig]
   */
  factory<IAppInitialiser> { LoggingInitialiser(buildConfig = get()) }
}
