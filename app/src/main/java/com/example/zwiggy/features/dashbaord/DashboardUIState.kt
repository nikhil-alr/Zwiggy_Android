package com.example.zwiggy.features.dashbaord

import com.example.core.models.RestaurantEntity

sealed class DashboardUIState
{
    data object  IDLE:DashboardUIState()
    data object LOADING:DashboardUIState()
    data class ERROR(val message:String):DashboardUIState()
    sealed class SUCCESS():DashboardUIState()
    {
        data class Resaturant(val data: RestaurantEntity):SUCCESS()
    }

}