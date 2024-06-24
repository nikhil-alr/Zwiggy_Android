package com.example.zwiggy.getstarted

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.getstarted.widgets.LogoView
import com.example.zwiggy.getstarted.widgets.PrimaryButtonView
import com.example.zwiggy.getstarted.widgets.TextAnimationView
import com.example.zwiggy.getstarted.widgets.VideoView
import com.example.zwiggy.ui.theme.ZwiggyTheme


@Composable
fun GetStarted() {
Box()
    {
        VideoView()
        Column(
            Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.verticalGradient(colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ), startY = 0f, endY = 800f)
                    )){
                Column(
                    Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                        )
                {
                    LogoView()
                    TextAnimationView()
                    PrimaryButtonView()
                }

            }


        }
    }


}


@Preview(showSystemUi = true)
@Composable
fun GetStartedPreview() {
    ZwiggyTheme {
        GetStarted()
    }
}