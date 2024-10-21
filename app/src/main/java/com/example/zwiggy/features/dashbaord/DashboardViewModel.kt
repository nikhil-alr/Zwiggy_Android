package com.example.zwiggy.features.dashbaord

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.resturants.ResturantUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(private val resturantUseCase: ResturantUseCase):ViewModel() {


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