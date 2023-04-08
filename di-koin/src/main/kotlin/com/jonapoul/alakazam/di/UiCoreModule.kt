package com.jonapoul.alakazam.di

import com.jonapoul.alakazam.ui.core.Toaster
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * Requires binding to be set for [android.content.Context]
 */
val coreUiModule = module {
    factory { Toaster(get(), get(named(KoinDispatchers.MAIN))) }
}
