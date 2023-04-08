package com.jonapoul.alakazam.di

import com.jonapoul.alakazam.http.OkHttpClientFactory
import org.koin.dsl.module

/**
 * Requires bindings to be set for [android.content.Context] and [com.jonapoul.alakazam.core.IBuildConfig]
 */
val httpModule = module {
  single { OkHttpClientFactory(get(), get()) }
}
