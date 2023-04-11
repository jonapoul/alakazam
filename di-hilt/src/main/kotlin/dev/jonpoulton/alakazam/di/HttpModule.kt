package dev.jonpoulton.alakazam.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.jonpoulton.alakazam.core.IBuildConfig
import dev.jonpoulton.alakazam.http.OkHttpClientFactory
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
