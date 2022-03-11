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
) {

    fun buildApi(): Api {
        return retrofitBuilder
            .baseUrl("https://$baseUrl")
            .client(buildOkHttpClient())
            .build()
            .create(apiClass)
    }

    private fun buildOkHttpClient(): OkHttpClient {
        return okHttpClientFactory.getClient(
            readWriteTimeout = timeout,
            connectTimeout = timeout,
        )
    }

    private companion object {
        val DEFAULT_TIMEOUT: Duration = Duration.ofSeconds(2)
    }
}
