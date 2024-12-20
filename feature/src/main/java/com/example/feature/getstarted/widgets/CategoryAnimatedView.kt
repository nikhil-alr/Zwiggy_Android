package com.example.feature.getstarted.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.SemanticsPropertyReceiver
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.feature.ui.theme.Orange
import com.example.feature.ui.theme.ZwiggyTheme


@Composable
fun CategoryAnimatedView(textIndex: Int) {
    Row(verticalAlignment = Alignment.CenterVertically)


    {
        if (textIndex == 0) HighlightedText("Food") else NormalText(text = "Food")
        Surface(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .width(5.dp)
                .height(5.dp), color = Orange, shape = CircleShape
        ) {

        }
        if (textIndex == 1) HighlightedText("Drinks") else NormalText(text = "Drinks")
        Surface(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .width(5.dp)
                .height(5.dp), color = Orange, shape = CircleShape
        ) {

        }
        if (textIndex == 2) HighlightedText("Grocery") else NormalText(text = "Grocery")

    }
}

val DayStatusKey = SemanticsPropertyKey<String>("DayStatusKey")
var SemanticsPropertyReceiver.dayStatusProperty by DayStatusKey


@Composable
private fun HighlightedText(text: String) {
    Text(
        text = text,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        color = Color.White,
                modifier = Modifier.semantics {
            dayStatusProperty = "bold$text"
        }
    )
}





@Composable
private fun NormalText(text: String) {
    Text(
        text = text,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        color = Color.LightGray
    )
}


@Preview()
@Composable
fun CategoryAnimatedViewPreview() {
    ZwiggyTheme {
        CategoryAnimatedView(0)
    }
}