package dev.jonpoulton.alakazam.di

import dev.jonpoulton.alakazam.core.Toaster
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * Requires binding to be set for [android.content.Context]
 */
val coreModule = module {
  factory { Toaster(get(), get(named(KoinDispatchers.MAIN))) }
}
