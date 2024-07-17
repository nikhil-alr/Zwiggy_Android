package com.example.zwiggy.dashbaord.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.zwiggy.dashbaord.DashboardViewModel
import com.example.zwiggy.ui.theme.ZwiggyTheme
private val countryList =
    mutableListOf("India", "Pakistan", "China", "United States","United States","United States")

private val listModifier = Modifier
    .fillMaxSize()

@Composable

fun RestaurantListView() {



    LazyColumn(listModifier,verticalArrangement = Arrangement.spacedBy(10.dp),) {
        items(countryList.size) { country ->
            RestaurantCardView()
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun GetStartedPreview() {
    ZwiggyTheme {
        RestaurantListView()
    }
}