package com.example.zwiggy.dashbaord.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.commonui.shimmerEffect
import com.example.zwiggy.ui.theme.ZwiggyTheme

@Composable
fun RestaurantCardViewShimmer() {
    Row(modifier = Modifier.fillMaxWidth().height(120.dp).padding(10.dp)) {

        Box(modifier = Modifier.size(100.dp).background(Color.Gray).shimmerEffect()) {

        }

        Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {


            Box(modifier = Modifier.fillMaxWidth().height(20.dp).background(Color.Gray).shimmerEffect()) {

            }

            Box(modifier = Modifier.padding(vertical = 10.dp).fillMaxWidth(.5f).height(20.dp).background(Color.Gray).shimmerEffect()) {

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun RestaurantCardViewShimmerPreview()
{
    ZwiggyTheme {
        RestaurantCardViewShimmer()
    }
}