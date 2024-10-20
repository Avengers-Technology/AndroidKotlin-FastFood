package com.example.smeb9716.foundation.api

import com.example.smeb9716.model.User
import com.example.smeb9716.model.request.LoginRequest
import com.example.smeb9716.model.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("posts")
    suspend fun getUsers(): Response<List<User>>

    @POST("api/user/login")
    suspend fun loginUser(loginRequest: LoginRequest): Response<LoginResponse>

}