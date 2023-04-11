package dev.jonpoulton.alakazam.di

import dev.jonpoulton.alakazam.http.OkHttpClientFactory
import org.koin.dsl.module

/**
 * Requires bindings to be set for [android.content.Context] and [dev.jonpoulton.alakazam.core.IBuildConfig]
 */
val httpModule = module {
  single { OkHttpClientFactory(get(), get()) }
}
