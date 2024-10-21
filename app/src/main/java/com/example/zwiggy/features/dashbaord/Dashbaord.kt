package com.example.zwiggy.features.dashbaord

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.zwiggy.features.dashbaord.widgets.RestaurantCardViewShimmer
import com.example.zwiggy.features.dashbaord.widgets.RestaurantListView
import com.example.zwiggy.features.dashbaord.widgets.RestaurantScreen

import com.example.zwiggy.ui.theme.ZwiggyTheme

@Composable
fun Dashboard(viewModel: DashboardViewModel = hiltViewModel())
{

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    when (uiState) {
        is DashboardUIState.ERROR -> Log.v("TAG","Error")
        is DashboardUIState.IDLE -> Log.v("TAG","IDle")
        is DashboardUIState.LOADING -> RestaurantListView({ RestaurantCardViewShimmer() })
        is DashboardUIState.SUCCESS.Resaturant -> RestaurantScreen()
    }



    LaunchedEffect(Unit) {
        // get resturant data in
        viewModel.getRestauarants()
    }
}

@Preview(showSystemUi = true)
@Composable
fun DashboardPreview()
{
    ZwiggyTheme {
        Dashboard()
    }
}

