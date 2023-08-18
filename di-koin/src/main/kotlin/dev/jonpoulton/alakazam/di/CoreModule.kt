package dev.jonpoulton.alakazam.di

import dev.jonpoulton.alakazam.core.Toaster
import dev.jonpoulton.alakazam.time.Clock
import dev.jonpoulton.alakazam.time.SystemClock
import org.koin.dsl.module

/**
 * Requires binding to be set for [android.content.Context]
 */
val coreModule = module {
  factory { Toaster(get(), get()) }
  factory<Clock> { SystemClock }
}
