package com.jonapoul.common.di

import com.jonapoul.common.core.IBuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber

@InstallIn(SingletonComponent::class)
@Module
class ProvidesLoggingInterceptorModule {
    @Provides
    fun interceptor(
        buildConfig: IBuildConfig,
    ): HttpLoggingInterceptor? {
        return if (buildConfig.debug) {
            HttpLoggingInterceptor { message -> Timber.d(message) }
                .also { it.level = HttpLoggingInterceptor.Level.BODY }
        } else {
            null
        }
    }
}
