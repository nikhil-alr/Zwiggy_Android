package com.example.zwiggy.dashbaord

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zwiggy.domain.usecases.ResturantUseCaseImpl
import com.example.zwiggy.models.RestaurantEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DashboardViewModel:ViewModel() {

    private val resturantUseCase = ResturantUseCaseImpl()
private var _uiState = MutableStateFlow<DashboardUIState>(DashboardUIState.IDLE)
val uiState: StateFlow<DashboardUIState> = _uiState.asStateFlow()

    fun getRestauarants()
    {
        viewModelScope.launch {
            _uiState.value = DashboardUIState.LOADING
            val resturants = resturantUseCase.getResturants()
            _uiState.value = DashboardUIState.SUCCESS.Resaturant(resturants)
        }
    }

}