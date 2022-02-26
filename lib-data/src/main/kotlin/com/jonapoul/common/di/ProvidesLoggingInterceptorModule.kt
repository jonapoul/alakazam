package com.jonapoul.common.di

import com.jonapoul.common.data.IBuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.logging.HttpLoggingInterceptor

@InstallIn(SingletonComponent::class)
@Module
class ProvidesLoggingInterceptorModule {
    @Provides
    fun provideHttpLoggingInterceptor(
        buildConfig: IBuildConfig,
    ): HttpLoggingInterceptor? {
        return if (buildConfig.debug) {
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
        } else null
    }
}
