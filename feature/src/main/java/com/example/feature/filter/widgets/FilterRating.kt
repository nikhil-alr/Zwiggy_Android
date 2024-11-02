package com.example.feature.filter.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.feature.ui.theme.ZwiggyTheme


@Composable
fun FilterRating()
{
    Text(text = "Filter Rating")
}

@Composable
@Preview(showSystemUi = true)
fun FilterRatingPreview()
{
    ZwiggyTheme {
        FilterRating()
    }
}