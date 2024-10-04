package com.example.zwiggy.domain.repository

import android.util.Log
import com.example.zwiggy.models.RestaurantModel
import com.example.zwiggy.network.ApiInstance
import com.example.zwiggy.network.UserService
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okhttp3.Response

class RestaurantRepoImpl : RestaurantRepo {
    override suspend fun getRestaurants(): DataResponse {
        delay(15000)
        return DataResponse.Success(RestaurantModel(123,"","","",))
    }

}

