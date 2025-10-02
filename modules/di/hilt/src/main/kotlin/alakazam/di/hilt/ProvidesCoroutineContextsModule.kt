/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.di.hilt

import alakazam.kotlin.core.CoroutineContexts
import alakazam.kotlin.core.DefaultCoroutineContexts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
public class ProvidesCoroutineContextsModule {
  @Provides
  @Singleton
  public fun contexts(): CoroutineContexts = DefaultCoroutineContexts()
}
