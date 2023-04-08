package com.jonapoul.alakazam.di

import com.jonapoul.alakazam.init.AppInitialisers
import com.jonapoul.alakazam.init.IAppInitialiser
import com.jonapoul.alakazam.init.LoggingInitialiser
import org.koin.dsl.module

val initialiserModule = module {
  single {
    AppInitialisers(initialisers = getAll<IAppInitialiser>().toSet())
  }

  /**
   * Requires binding to be set for [com.jonapoul.alakazam.core.IBuildConfig]
   */
  factory<IAppInitialiser> { LoggingInitialiser(buildConfig = get()) }
}
