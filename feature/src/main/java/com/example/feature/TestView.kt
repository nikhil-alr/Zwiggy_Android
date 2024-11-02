package com.example.feature

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TestView()
{
Text("HELLO")
}


@Composable
@Preview(showSystemUi = true)
fun TestViewPreview()
{
    TestView()
}