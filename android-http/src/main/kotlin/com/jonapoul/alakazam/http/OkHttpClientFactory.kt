package com.jonapoul.alakazam.http

import android.content.Context
import com.jonapoul.alakazam.core.IBuildConfig
import com.jonapoul.alakazam.core.ifTrue
import okhttp3.Cache
import okhttp3.ConnectionPool
import okhttp3.Dispatcher
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import java.io.File
import java.time.Duration
import java.util.concurrent.TimeUnit

open class OkHttpClientFactory(
  private val context: Context,
  private val buildConfig: IBuildConfig,
) {
  open fun buildClient(
    readWriteTimeout: Duration = DEFAULT_TIMEOUT,
    connectTimeout: Duration = DEFAULT_TIMEOUT,
  ): OkHttpClient {
    return OkHttpClient.Builder()
      .ifTrue(buildConfig.debug) { addInterceptor(buildInterceptor()) }
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

  protected open fun OkHttpClient.Builder.extraConfig(): OkHttpClient.Builder = this

  private fun buildCache(): Cache {
    val directory = File(context.cacheDir, "api_cache")
    return Cache(directory, CACHE_MAX_SIZE_BYTES)
  }

  private fun buildDispatcher(): Dispatcher {
    return Dispatcher().apply {
      /* Allow for high number of concurrent data fetches on same host. */
      maxRequestsPerHost = MAX_REQUESTS_PER_HOST
    }
  }

  private fun buildInterceptor(): Interceptor {
    return HttpLoggingInterceptor { message -> Timber.v(message) }
      .also { it.level = HttpLoggingInterceptor.Level.BODY }
  }

  private companion object {
    val DEFAULT_TIMEOUT: Duration = Duration.ofSeconds(5)
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
