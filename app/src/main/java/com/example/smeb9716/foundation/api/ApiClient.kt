package com.example.smeb9716.foundation.api

import android.util.Log
import com.example.smeb9716.utils.DataManager
import com.moczul.ok2curl.CurlInterceptor
import com.moczul.ok2curl.logger.Logger
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private const val KEY_AUTHORIZATION = "Authorization"
    private const val TOKEN_PREFIX = "Bearer "
    private var retrofit: Retrofit? = null

    private fun getOkHttpClient(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        return OkHttpClient.Builder()
            .addInterceptor { chain ->
                val newRequest = chain.request().newBuilder()
                    .addHeader(KEY_AUTHORIZATION, TOKEN_PREFIX + DataManager.getInstance().bearerToken)
                    .build()
                chain.proceed(newRequest)
            }
            .addInterceptor(CurlInterceptor(object : Logger {
                override fun log(message: String) {
                    Log.v("cURL", message)
                }
            }))
            .addInterceptor(loggingInterceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    private fun getClient(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }

    fun getApiService(): ApiService {
        return getClient().create(ApiService::class.java)
    }
}