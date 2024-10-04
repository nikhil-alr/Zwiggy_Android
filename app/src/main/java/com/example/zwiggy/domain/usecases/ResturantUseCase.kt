package com.example.zwiggy.domain.usecases

import com.example.zwiggy.models.RestaurantEntity
import com.example.zwiggy.models.RestaurantModel
import kotlinx.coroutines.flow.Flow
import okhttp3.Response

interface ResturantUseCase {

    suspend fun getResturants(): RestaurantEntity

}