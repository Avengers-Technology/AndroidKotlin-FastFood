package com.example.smeb9716.foundation.api

import com.example.smeb9716.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getUsers(): Response<List<User>>

}