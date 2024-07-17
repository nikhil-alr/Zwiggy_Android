package com.example.zwiggy.usecases

import com.example.zwiggy.repository.FoodRepoImpl

class FoodUseCaseImpl : FoodUseCase {

    val foodRepository = FoodRepoImpl()

    override fun getResturants() {
        foodRepository.getRestaurants()
    }
}