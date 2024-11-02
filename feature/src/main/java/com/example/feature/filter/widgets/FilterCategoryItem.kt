package com.example.feature.filter.widgets

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.feature.ui.theme.ZwiggyTheme


@Composable
fun FilterCategoryItem(filterData:Boolean,onClick:()->Unit)
{



    Row(modifier = Modifier
        .height(50.dp)
        .fillMaxWidth()
        .clickable { onClick() }, verticalAlignment = Alignment.CenterVertically,) {
        Canvas(modifier = Modifier.width(10.dp)) {
            // Draw a vertical rectangle
            if(filterData)
            {
                drawRect(
                    color = Color.Red,
                    topLeft = Offset(0f, -60f), // Top-left corner
                    size = Size(10f, 120f) // Width and Height
                )
            }

        }
        Text(text = "Sort",Modifier.padding(start = 5.dp),  color = Color.Red, fontWeight = FontWeight.Bold)
    }


}

@Composable
@Preview(showSystemUi = true)
fun FilterCategoryItemPreview()
{
    ZwiggyTheme {
        FilterCategoryItem(true) {}
    }


}