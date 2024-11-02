package com.example.feature.filter.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.feature.ui.theme.ZwiggyTheme


@Composable
fun FilterSort()
{
Text(text = "Filter Sort")
}

@Composable
@Preview(showSystemUi = true)
fun FilterSortPreview()
{
    ZwiggyTheme {
        FilterSort()
    }
}