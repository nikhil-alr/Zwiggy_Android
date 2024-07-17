package com.example.zwiggy.dashbaord

import androidx.lifecycle.ViewModel
import com.example.zwiggy.usecases.FoodUseCaseImpl

class DashboardViewModel:ViewModel() {

    val useCase = FoodUseCaseImpl()

    fun getResturants()
    {
        useCase.getResturants()
    }

}