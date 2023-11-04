package dev.jonpoulton.alakazam.di.koin

import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import dev.jonpoulton.alakazam.kotlin.core.IODispatcher
import org.koin.dsl.module

/**
 * Requires a binding to be set for [android.content.SharedPreferences].
 */
val preferencesModule = module {
  factory { FlowSharedPreferences(get(), get<IODispatcher>()) }
}