/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.di.hilt

import alakazam.android.http.OkHttpClientFactory
import alakazam.kotlin.core.BuildConfig
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
public class ProvidesHttpModule {
  @Provides
  @Singleton
  public fun clientFactory(
    @ApplicationContext context: Context,
    provider: BuildConfig.Provider,
  ): OkHttpClientFactory = OkHttpClientFactory(context, provider)
}
