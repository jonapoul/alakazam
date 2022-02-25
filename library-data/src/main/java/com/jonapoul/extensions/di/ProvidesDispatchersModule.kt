package com.jonapoul.extensions.di

import com.jonapoul.extensions.data.coroutines.DispatcherProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Qualifier

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD
)
annotation class IODispatcher

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD
)
annotation class MainDispatcher

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD
)
annotation class DefaultDispatcher

@InstallIn(SingletonComponent::class)
@Module
class ProvidesDispatchersModule {
    @Provides
    @IODispatcher
    fun providesIO(
        dispatcherProvider: DispatcherProvider,
    ): CoroutineDispatcher = dispatcherProvider.io()

    @Provides
    @MainDispatcher
    fun providesMain(
        dispatcherProvider: DispatcherProvider,
    ): CoroutineDispatcher = dispatcherProvider.main()

    @Provides
    @DefaultDispatcher
    fun providesDefault(
        dispatcherProvider: DispatcherProvider,
    ): CoroutineDispatcher = dispatcherProvider.default()
}
