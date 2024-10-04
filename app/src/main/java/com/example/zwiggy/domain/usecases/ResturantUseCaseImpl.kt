package com.example.zwiggy.domain.usecases

import android.util.Log
import com.example.zwiggy.models.RestaurantEntity
import com.example.zwiggy.domain.repository.RestaurantRepoImpl
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ResturantUseCaseImpl : ResturantUseCase {

    val restaurantRepository = RestaurantRepoImpl()
    override suspend fun getResturants(): RestaurantEntity {
        val response =  restaurantRepository.getRestaurants()
        return RestaurantEntity("", "")
    }


}

