package com.jonapoul.alakazam.http

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.StringFormat
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.time.Duration

abstract class ApiBuilder<Api>(
    private val okHttpClientFactory: OkHttpClientFactory,
    private val apiClass: Class<Api>,
) {
    fun buildApi(
        baseUrl: String,
        timeout: Duration = DEFAULT_TIMEOUT,
        protocol: String = DEFAULT_PROTOCOL,
        stringFormat: StringFormat = Json,
        mediaType: MediaType = "application/json".toMediaType(),
    ): Api {
        return Retrofit.Builder()
            .addConverterFactory(stringFormat.asConverterFactory(mediaType))
            .baseUrl("$protocol://$baseUrl")
            .client(buildOkHttpClient(timeout))
            .extraConfig()
            .build()
            .create(apiClass)
    }

    protected open fun Retrofit.Builder.extraConfig(): Retrofit.Builder = this

    open fun buildOkHttpClient(timeout: Duration = DEFAULT_TIMEOUT): OkHttpClient {
        return okHttpClientFactory.buildClient(
            readWriteTimeout = timeout,
            connectTimeout = timeout,
        )
    }

    private companion object {
        val DEFAULT_TIMEOUT: Duration = Duration.ofSeconds(2)
        const val DEFAULT_PROTOCOL = "https"
    }
}
