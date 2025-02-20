package alakazam.di.koin

import alakazam.kotlin.core.CoroutineContexts
import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Requires a binding to be set for [android.content.SharedPreferences].
 */
public val preferencesModule: Module = module {
  factory { FlowSharedPreferences(get(), get<CoroutineContexts>().io) }
}
