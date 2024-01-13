package dev.jonpoulton.alakazam.di.koin

import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import dev.jonpoulton.alakazam.kotlin.core.IODispatcher
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Requires a binding to be set for [android.content.SharedPreferences].
 */
public val preferencesModule: Module = module {
  factory { FlowSharedPreferences(get(), get<IODispatcher>()) }
}
