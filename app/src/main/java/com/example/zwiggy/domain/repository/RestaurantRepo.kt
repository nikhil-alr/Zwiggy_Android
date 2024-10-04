package com.example.zwiggy.domain.repository

import com.example.zwiggy.models.RestaurantModel
import kotlinx.coroutines.flow.Flow


interface RestaurantRepo {

    suspend fun getRestaurants(): DataResponse
}

sealed class DataResponse {
    data class Success(val data: RestaurantModel) : DataResponse()
    data class Error(val message: String) : DataResponse()

}