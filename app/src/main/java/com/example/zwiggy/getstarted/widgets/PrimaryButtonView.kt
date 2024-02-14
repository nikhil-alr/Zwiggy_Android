package com.example.zwiggy.getstarted.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.ui.theme.ZwiggyTheme

@Composable
fun PrimaryButtonView() {

    Box(
        Modifier
            .fillMaxWidth().height(50.dp).background(Color.Red),contentAlignment = Center
    ) {
        Text(
            text = "Herrllo", textAlign = TextAlign.Center,
        )

    }
}


@Preview()
@Composable
fun PrimaryButtonPreview() {
    ZwiggyTheme {
        PrimaryButtonView()
    }
}