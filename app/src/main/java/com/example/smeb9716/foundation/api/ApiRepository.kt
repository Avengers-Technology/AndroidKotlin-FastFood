package com.example.smeb9716.foundation.api

import com.example.smeb9716.model.User
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.withTimeout
import retrofit2.HttpException

class ApiRepository {
    private val API_TIMEOUT = 15000L
    private val service = ApiClient.getApiService()

    suspend fun getUsers(): List<User>? {
        val response = try {
            withTimeout(API_TIMEOUT){
                service.getUsers()
            }
        } catch (e: TimeoutCancellationException) {
            throw Exception("Network request timed out")
        }
        if(!response.isSuccessful) {
            throw HttpException(response)
        }
        return response.body()
    }

}