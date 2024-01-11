package dev.jonpoulton.alakazam.di.koin

import dev.jonpoulton.alakazam.android.http.OkHttpClientFactory
import org.koin.dsl.module

/**
 * Requires bindings to be set for [android.content.Context] and [dev.jonpoulton.alakazam.core.IBuildConfig]
 */
val httpModule = module {
  single { OkHttpClientFactory(get(), get()) }
}
