package com.jonapoul.alakazam.di

import android.content.Context
import com.jonapoul.alakazam.core.IBuildConfig
import com.jonapoul.alakazam.http.OkHttpClientFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class HttpModule {
  @Provides
  @Singleton
  fun clientFactory(
    @ApplicationContext context: Context,
    buildConfig: IBuildConfig,
  ): OkHttpClientFactory = OkHttpClientFactory(
    context,
    buildConfig,
  )
}
