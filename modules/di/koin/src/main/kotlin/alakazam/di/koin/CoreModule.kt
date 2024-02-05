package alakazam.di.koin

import alakazam.android.core.Toaster
import kotlinx.datetime.Clock
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Requires binding to be set for [android.content.Context]
 */
public val coreModule: Module = module {
  factory { Toaster(get(), get()) }
  factory<Clock> { Clock.System }
}
