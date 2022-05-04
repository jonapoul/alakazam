package com.jonapoul.common.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

@InstallIn(SingletonComponent::class)
@Module
class ProvidesScopesModule {
    @Provides
    fun providesScope(): CoroutineScope = CoroutineScope(SupervisorJob())
}
