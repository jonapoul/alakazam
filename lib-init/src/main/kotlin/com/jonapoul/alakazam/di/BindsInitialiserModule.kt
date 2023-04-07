package com.jonapoul.alakazam.di

import com.jonapoul.alakazam.init.BuildConfigInitialiser
import com.jonapoul.alakazam.init.IAppInitialiser
import com.jonapoul.alakazam.init.LoggingInitialiser
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
    fun logging(bind: LoggingInitialiser): IAppInitialiser

    @Binds
    @IntoSet
    fun buildConfig(bind: BuildConfigInitialiser): IAppInitialiser
}
