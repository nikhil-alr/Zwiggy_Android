package com.example.core.models.network


import com.example.core.models.RestaurantModel
import com.example.core.models.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {

    @GET("users/2")
    suspend fun getUsers(): Response<User>

    @GET("restaurants")
    suspend fun getRestaurant(): Response<RestaurantModel>


}