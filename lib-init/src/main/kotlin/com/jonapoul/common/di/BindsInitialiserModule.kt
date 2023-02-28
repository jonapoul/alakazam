package com.jonapoul.common.di

import com.jonapoul.common.init.BuildConfigInitialiser
import com.jonapoul.common.init.IAppInitialiser
import com.jonapoul.common.init.LoggingInitialiser
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@InstallIn(SingletonComponent::class)
@Module
internal interface BindsInitialiserModule {
    @Binds
    @IntoSet
    fun initialiser(bind: LoggingInitialiser): IAppInitialiser

    @Binds
    @IntoSet
    fun initialiser(bind: BuildConfigInitialiser): IAppInitialiser
}
