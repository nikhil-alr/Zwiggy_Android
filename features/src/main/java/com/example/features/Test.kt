package com.example.features

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TestView()
{
Text("TEST")
}


@Composable
@Preview(showBackground = true)
fun TestViewPreview()
{
    TestView()

}