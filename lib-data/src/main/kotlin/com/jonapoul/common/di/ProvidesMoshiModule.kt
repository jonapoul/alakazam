package com.jonapoul.common.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class ProvidesMoshiModule {
    @Provides
    fun moshi(builder: Moshi.Builder): Moshi =
        builder.build()

    @Provides
    fun builder(): Moshi.Builder = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
}
