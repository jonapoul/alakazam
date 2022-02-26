package com.jonapoul.common.di

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ProvidesRetrofitModule {
    @Provides
    @Singleton
    fun provideRetrofitBuilder(
        moshi: Moshi,
    ): Retrofit.Builder = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
}
