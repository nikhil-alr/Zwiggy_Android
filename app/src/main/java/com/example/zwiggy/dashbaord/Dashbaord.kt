package com.example.zwiggy.dashbaord

import RestaurantCardView
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.zwiggy.dashbaord.widgets.RestaurantCardViewShimmer
import com.example.zwiggy.dashbaord.widgets.RestaurantListView
import com.example.zwiggy.dashbaord.widgets.RestaurantScreen
import com.example.zwiggy.ui.theme.ZwiggyTheme

@Composable
fun Dashboard()
{
    val viewModel: DashboardViewModel = viewModel()
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

