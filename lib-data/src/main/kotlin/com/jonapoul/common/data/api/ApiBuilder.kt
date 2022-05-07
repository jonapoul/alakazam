package com.jonapoul.common.data.api

import okhttp3.OkHttpClient
import org.threeten.bp.Duration
import retrofit2.Retrofit

abstract class ApiBuilder<Api>(
    private val retrofitBuilder: Retrofit.Builder,
    private val okHttpClientFactory: OkHttpClientFactory,
    private val apiClass: Class<Api>,
    private val baseUrl: String,
    private val timeout: Duration = DEFAULT_TIMEOUT,
    private val protocol: String = "https"
) {
    fun buildApi(): Api {
        return retrofitBuilder
            .baseUrl("$protocol://$baseUrl")
            .client(buildOkHttpClient())
            .extraConfig()
            .build()
            .create(apiClass)
    }

    protected open fun Retrofit.Builder.extraConfig(): Retrofit.Builder =
        this

    protected open fun buildOkHttpClient(): OkHttpClient {
        return okHttpClientFactory.getClient(
            readWriteTimeout = timeout,
            connectTimeout = timeout,
        )
    }

    private companion object {
        val DEFAULT_TIMEOUT: Duration = Duration.ofSeconds(2)
    }
}
