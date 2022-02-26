package com.jonapoul.extensions.data.api

import com.jonapoul.extensions.data.requireMessage
import retrofit2.HttpException
import java.io.IOException

sealed class ApiResult<out T> {
    data class Success<out T>(val data: T) : ApiResult<T>()
    abstract class Failure(val message: String) : ApiResult<Nothing>()
    class HttpFailure(code: Int, message: String) : Failure("$code : $message")
    class NetworkFailure(message: String) : Failure(message)
    class OtherFailure(message: String) : Failure(message)

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
