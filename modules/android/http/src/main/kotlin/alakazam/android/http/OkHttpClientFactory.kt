package alakazam.android.http

import alakazam.kotlin.core.BuildConfig
import alakazam.kotlin.core.ifTrue
import android.content.Context
import okhttp3.Cache
import okhttp3.ConnectionPool
import okhttp3.Dispatcher
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import java.io.File
import java.util.concurrent.TimeUnit
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

public open class OkHttpClientFactory(
  private val context: Context,
  private val buildConfig: BuildConfig.Provider,
) {
  public open fun buildClient(
    readWriteTimeout: Duration = DEFAULT_TIMEOUT,
    connectTimeout: Duration = DEFAULT_TIMEOUT,
  ): OkHttpClient = OkHttpClient
    .Builder()
    .ifTrue(buildConfig.get().debug) { addInterceptor(buildInterceptor()) }
    .readTimeout(readWriteTimeout.inWholeSeconds, TimeUnit.SECONDS)
    .writeTimeout(readWriteTimeout.inWholeSeconds, TimeUnit.SECONDS)
    .connectTimeout(connectTimeout.inWholeSeconds, TimeUnit.SECONDS)
    .cache(buildCache())
    .connectionPool(CONNECTION_POOL)
    .dispatcher(buildDispatcher())
    .extraConfig()
    .build()

  protected open fun OkHttpClient.Builder.extraConfig(): OkHttpClient.Builder = this

  private fun buildCache(): Cache {
    val directory = File(context.cacheDir, "api_cache")
    return Cache(directory, CACHE_MAX_SIZE_BYTES)
  }

  private fun buildDispatcher(): Dispatcher = Dispatcher().apply {
    // Allow for high number of concurrent data fetches on same host.
    maxRequestsPerHost = MAX_REQUESTS_PER_HOST
  }

  private fun buildInterceptor(): Interceptor = HttpLoggingInterceptor { message -> Timber.v(message) }
    .also { it.level = HttpLoggingInterceptor.Level.BODY }

  private companion object {
    val DEFAULT_TIMEOUT = 5.seconds
    const val CACHE_MAX_SIZE_BYTES = 50L * 1024 * 1024 // 50MB
    const val MAX_IDLE_CONNECTIONS = 10
    const val KEEP_ALIVE_TIME_MINUTES = 2L
    const val MAX_REQUESTS_PER_HOST = 15

    /* Adjust the Connection pool to account for historical use of 3 separate clients but reduce
     * the keepAlive to 2 minutes to avoid keeping radio open. */
    val CONNECTION_POOL = ConnectionPool(
      MAX_IDLE_CONNECTIONS,
      KEEP_ALIVE_TIME_MINUTES,
      TimeUnit.MINUTES,
    )
  }
}
