package com.jonapoul.common.http

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.time.Duration

abstract class ApiBuilder<Api>(
    private val okHttpClientFactory: OkHttpClientFactory,
    private val apiClass: Class<Api>,
    private val baseUrl: String,
    private val timeout: Duration = DEFAULT_TIMEOUT,
    private val protocol: String = "https",
    private val json: Json = Json,
) {
    fun buildApi(): Api {
        val contentType = "application/json".toMediaType()
        return Retrofit.Builder()
            .addConverterFactory(json.asConverterFactory(contentType))
            .baseUrl("$protocol://$baseUrl")
            .client(buildOkHttpClient())
            .extraConfig()
            .build()
            .create(apiClass)
    }

    protected open fun Retrofit.Builder.extraConfig(): Retrofit.Builder =
        this

    open fun buildOkHttpClient(): OkHttpClient {
        return okHttpClientFactory.getClient(
            readWriteTimeout = timeout,
            connectTimeout = timeout,
        )
    }

    private companion object {
        val DEFAULT_TIMEOUT: Duration = Duration.ofSeconds(2)
    }
}
