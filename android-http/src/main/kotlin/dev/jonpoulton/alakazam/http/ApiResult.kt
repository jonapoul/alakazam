package dev.jonpoulton.alakazam.http

import dev.jonpoulton.alakazam.core.requireMessage
import retrofit2.HttpException
import java.io.IOException

sealed interface ApiResult<out T> {
  data class Success<out T>(val data: T) : ApiResult<T>

  interface Failure : ApiResult<Nothing> {
    val message: String
  }

  data class HttpFailure(
    val code: Int,
    val httpMessage: String,
  ) : Failure {
    override val message = "$code : $httpMessage"
  }

  data class NetworkFailure(
    override val message: String,
  ) : Failure

  data class OtherFailure(
    override val message: String,
  ) : Failure


  companion object {
    suspend fun <T> from(apiCall: suspend () -> T): ApiResult<T> {
      return try {
        Success(apiCall.invoke())
      } catch (e: Exception) {
        when (e) {
          is IOException -> NetworkFailure(e.requireMessage())
          is HttpException -> HttpFailure(e.code(), e.message())
          else -> OtherFailure(e.requireMessage())
        }
      }
    }
  }
}
