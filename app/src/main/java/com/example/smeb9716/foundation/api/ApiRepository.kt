package com.example.smeb9716.foundation.api

import com.example.smeb9716.model.User
import com.example.smeb9716.model.request.LoginRequest
import com.example.smeb9716.model.response.LoginResponse
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

    suspend fun login(loginRequest: LoginRequest): LoginResponse {
        val response = try {
            withTimeout(API_TIMEOUT){
                service.loginUser(loginRequest)
            }
        } catch (e: TimeoutCancellationException) {
            throw Exception("Network request timed out")
        }
        if(!response.isSuccessful) {
            throw HttpException(response)
        }
        return response.body()!!
    }

}