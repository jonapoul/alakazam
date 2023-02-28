package com.jonapoul.common.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ProvidesScopesModule {
    @Provides
    @Singleton
    fun scope(): CoroutineScope = CoroutineScope(SupervisorJob())
}
