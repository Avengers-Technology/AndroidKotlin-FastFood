package com.example.smeb9716.model

import com.google.gson.annotations.SerializedName

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String
)
