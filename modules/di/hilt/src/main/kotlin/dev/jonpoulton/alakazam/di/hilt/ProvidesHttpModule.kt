package dev.jonpoulton.alakazam.di.hilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.jonpoulton.alakazam.android.core.IBuildConfig
import dev.jonpoulton.alakazam.android.http.OkHttpClientFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
public class ProvidesHttpModule {
  @Provides
  @Singleton
  public fun clientFactory(
    @ApplicationContext context: Context,
    buildConfig: IBuildConfig,
  ): OkHttpClientFactory = OkHttpClientFactory(
    context,
    buildConfig,
  )
}
