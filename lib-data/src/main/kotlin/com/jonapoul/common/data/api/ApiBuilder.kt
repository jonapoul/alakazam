package com.jonapoul.common.data.api

import com.jonapoul.common.data.Seconds
import com.jonapoul.common.data.sec
import okhttp3.OkHttpClient
import retrofit2.Retrofit

abstract class ApiBuilder<Api>(
    private val retrofitBuilder: Retrofit.Builder,
    private val okHttpClientFactory: OkHttpClientFactory,
    private val apiClass: Class<Api>,
    private val baseUrl: String,
    private val timeout: Seconds = DEFAULT_TIMEOUT,
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
        val DEFAULT_TIMEOUT = 2.sec
    }
}
