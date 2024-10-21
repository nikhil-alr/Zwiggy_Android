package com.example.domain.resturants


import com.example.core.models.RestaurantEntity
import com.example.data.repository.RestaurantRepo
import javax.inject.Inject


class ResturantUseCaseImpl @Inject constructor(private val restaurantRepository: RestaurantRepo)  : ResturantUseCase {


    override suspend fun getResturants(): RestaurantEntity {
        val response =  restaurantRepository.getRestaurants()
        return RestaurantEntity("", "")
    }


}

