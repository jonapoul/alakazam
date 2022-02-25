package com.jonapoul.extensions.data.api

import android.content.Context
import com.jonapoul.extensions.data.Seconds
import com.jonapoul.extensions.data.ifNotNull
import com.jonapoul.extensions.data.sec
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Cache
import okhttp3.ConnectionPool
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class OkHttpClientFactory @Inject constructor(
    @ApplicationContext private val context: Context,
    private val interceptor: HttpLoggingInterceptor?,
) {
    fun getClient(
        readWriteTimeout: Seconds = DEFAULT_TIMEOUT,
        connectTimeout: Seconds = DEFAULT_TIMEOUT,
        extraConfig: OkHttpClient.Builder.() -> OkHttpClient.Builder = { this },
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .ifNotNull(interceptor) { addInterceptor(it) }
            .readTimeout(readWriteTimeout.seconds, TimeUnit.SECONDS)
            .writeTimeout(readWriteTimeout.seconds, TimeUnit.SECONDS)
            .connectTimeout(connectTimeout.seconds, TimeUnit.SECONDS)
            .cache(buildCache())
            .connectionPool(CONNECTION_POOL)
            .dispatcher(buildDispatcher())
            .fastFallback(true)
            .extraConfig()
            .build()
    }

    private fun buildCache(): Cache {
        val directory = File(context.cacheDir, "api_cache")
        return Cache(directory, CACHE_MAX_SIZE_BYTES)
    }

    private fun buildDispatcher(): Dispatcher {
        return Dispatcher().apply {
            /* Allow for high number of concurrent image fetches on same host. */
            maxRequestsPerHost = MAX_REQUESTS_PER_HOST
        }
    }

    private companion object {
        val DEFAULT_TIMEOUT = 5.sec
        const val CACHE_MAX_SIZE_BYTES = 50L * 1024 * 1024 // 50MB
        const val MAX_IDLE_CONNECTIONS = 10
        const val KEEP_ALIVE_TIME_MINUTES = 2L
        const val MAX_REQUESTS_PER_HOST = 15

        /* Adjust the Connection pool to account for historical use of 3 separate clients but reduce
         * the keepAlive to 2 minutes to avoid keeping radio open. */
        val CONNECTION_POOL = ConnectionPool(
            MAX_IDLE_CONNECTIONS,
            KEEP_ALIVE_TIME_MINUTES,
            TimeUnit.MINUTES
        )
    }
}
