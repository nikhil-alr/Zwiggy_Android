package com.example.zwiggy.dashbaord

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.zwiggy.dashbaord.widgets.RestaurantListView
import com.example.zwiggy.ui.theme.ZwiggyTheme

@Composable
fun Dashboard() {
    RestaurantListView()
}

@Preview(showSystemUi = true)
@Composable
fun GetStartedPreview() {
    ZwiggyTheme {
        Dashboard()
    }
}