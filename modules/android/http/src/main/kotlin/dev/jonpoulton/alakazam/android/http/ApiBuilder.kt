package dev.jonpoulton.alakazam.android.http

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

@ExperimentalSerializationApi
abstract class ApiBuilder<Api>(
  private val okHttpClientFactory: OkHttpClientFactory,
  private val apiClass: Class<Api>,
  private val baseUrl: String,
  private val timeout: Duration = DEFAULT_TIMEOUT,
  private val protocol: String = DEFAULT_PROTOCOL,
) {
  protected open val converterFactories: Set<Converter.Factory> = setOf(
    Json.asConverterFactory("application/json".toMediaType()),
  )

  open fun buildApi(
    baseUrl: String = this.baseUrl,
    timeout: Duration = this.timeout,
    protocol: String = this.protocol,
  ): Api {
    return Retrofit.Builder()
      .apply { converterFactories.forEach(::addConverterFactory) }
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
    val DEFAULT_TIMEOUT = 2.seconds
    const val DEFAULT_PROTOCOL = "https"
  }
}
