package dev.jonpoulton.alakazam.di.koin

import dev.jonpoulton.alakazam.android.core.Toaster
import kotlinx.datetime.Clock
import org.koin.dsl.module

/**
 * Requires binding to be set for [android.content.Context]
 */
val coreModule = module {
  factory { Toaster(get(), get()) }
  factory<Clock> { Clock.System }
}
