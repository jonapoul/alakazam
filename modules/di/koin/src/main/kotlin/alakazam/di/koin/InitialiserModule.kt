package alakazam.di.koin

import alakazam.android.init.AppInitializer
import alakazam.android.init.AppInitializers
import alakazam.android.init.LoggingInitializer
import org.koin.core.module.Module
import org.koin.dsl.module

public val initialiserModule: Module = module {
  single {
    AppInitializers(initializers = getAll<AppInitializer>().toSet())
  }

  factory<AppInitializer> { LoggingInitializer() }
}
