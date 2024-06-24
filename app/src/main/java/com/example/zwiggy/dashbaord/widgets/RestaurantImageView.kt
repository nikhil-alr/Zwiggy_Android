package com.example.zwiggy.dashbaord.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.R
import com.example.zwiggy.ui.theme.ZwiggyTheme


@Composable
fun RestaurantImageView() {
    var isFavClicked by remember { mutableStateOf(false) }
    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxHeight()
        .width(130.dp), elevation = CardDefaults.cardElevation(
        defaultElevation = 4.dp
    )) {
       Box(contentAlignment = Alignment.TopEnd,modifier = Modifier.fillMaxSize()) {
           Image(
               painter = painterResource(R.drawable.food_placeholder),
               contentDescription = "logo",
               contentScale = ContentScale.Crop,
               modifier = Modifier.fillMaxSize()



           )

           Image(
               painter = painterResource(if (isFavClicked) R.drawable.heart_fill else R.drawable.heart),
               contentDescription = "logo",
               contentScale = ContentScale.Crop,
               modifier = Modifier
                   .size(50.dp)
                   .padding(10.dp)
                   .clickable { isFavClicked = !isFavClicked }

           )
       }


    }
}

@Preview(showSystemUi = true)
@Composable
fun RestaurantImageViewPreview() {
    ZwiggyTheme {
        Surface(modifier = Modifier.height(170.dp)) {
            RestaurantImageView()
        }

    }
}

