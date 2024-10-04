package com.example.zwiggy.network

import com.example.zwiggy.models.RestaurantModel
import com.example.zwiggy.models.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {

    @GET("users/2")
    suspend fun getUsers(): Response<User>

    @GET("restaurants")
    suspend fun getRestaurant(): Response<RestaurantModel>


}