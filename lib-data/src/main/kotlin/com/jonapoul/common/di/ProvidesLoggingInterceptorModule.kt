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
    fun provideHttpLoggingInterceptor(
        buildConfig: IBuildConfig,
    ): HttpLoggingInterceptor? {
        return if (buildConfig.debug) {
            val interceptor = HttpLoggingInterceptor { message -> Timber.d(message) }
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            interceptor
        } else null
    }
}
