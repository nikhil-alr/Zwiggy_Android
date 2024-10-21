package com.example.data

import com.example.core.models.RestaurantModel
import com.example.data.repository.DataResponse
import com.example.data.repository.RestaurantRepo
import kotlinx.coroutines.delay
import javax.inject.Inject

class ResturantNetwrokDataRepo @Inject constructor() : RestaurantRepo {
    override suspend fun getRestaurants(): DataResponse {
        delay(15000)
        return DataResponse.Success(RestaurantModel(123, "", "", "",))
    }
}