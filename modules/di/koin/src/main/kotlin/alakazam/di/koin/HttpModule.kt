package alakazam.di.koin

import alakazam.android.http.OkHttpClientFactory
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Requires bindings to be set for [android.content.Context] and [alakazam.kotlin.core.BuildConfig.Provider]
 */
public val httpModule: Module = module {
  single { OkHttpClientFactory(get(), get()) }
}
