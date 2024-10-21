package com.example.zwiggy.features.getstarted.widgets

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.zwiggy.ui.theme.ZwiggyTheme
import androidx.compose.ui.unit.sp

@Composable
fun DescriptionAnimatedView(description: String) {
    AnimatedContent(
        targetState = description,
        transitionSpec = {
            fadeIn(animationSpec = tween(500)) togetherWith
                    fadeOut(animationSpec = tween(1))
        }, label = ""
    ) { text ->
        Text(text = text, color = Color.Gray, fontSize = 22.sp)

    }
}


@Preview()
@Composable
fun DescriptionAnimatedViewPreview() {
    ZwiggyTheme {
        DescriptionAnimatedView("test")
    }
}