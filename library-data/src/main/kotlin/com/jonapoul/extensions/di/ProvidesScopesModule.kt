package com.jonapoul.extensions.di

import com.jonapoul.extensions.data.coroutines.ScopeProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Qualifier

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD
)
annotation class ApplicationScope

@InstallIn(SingletonComponent::class)
@Module
@OptIn(DelicateCoroutinesApi::class)
class ProvidesScopesModule {
    @Provides
    @ApplicationScope
    fun providesApplication(
        scopeProvider: ScopeProvider,
    ): CoroutineScope = scopeProvider.applicationScope
}
