package com.jonapoul.alakazam.di

import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import kotlinx.coroutines.CoroutineDispatcher
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * Requires a binding to be set for [android.content.SharedPreferences].
 */
val preferencesModule = module {
    factory { FlowSharedPreferences(get(), get<CoroutineDispatcher>(named(KoinDispatchers.IO))) }
}
