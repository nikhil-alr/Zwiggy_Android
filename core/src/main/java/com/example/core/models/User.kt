package com.example.core.models

data class User(
    val `data`: Data,
    val support: Support
)


data class Support(
    val text: String,
    val url: String
)

data class Data(
    val avatar: String,
    val email: String,
    val first_name: String,
    val id: Int,
    val last_name: String
)