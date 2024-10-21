package com.example.zwiggy.features.filter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.R
import com.example.zwiggy.features.filter.widgets.FilterCategoryList
import com.example.zwiggy.features.filter.widgets.FilterCostForTwo
import com.example.zwiggy.features.filter.widgets.FilterRating
import com.example.zwiggy.features.filter.widgets.FilterSort
import com.example.zwiggy.features.filter.widgets.FilterVegNonVeg

import com.example.zwiggy.ui.theme.ZwiggyTheme


@Composable
fun FilterScreen(close:()->Unit)
{

    var categoryPos  by remember {
        mutableIntStateOf(0)
    }

    Column {
Row(Modifier.padding(10.dp)) {
    Text(
        text = "Filter",
        modifier = Modifier.weight(1f), // Take up available space
            // Optional: Use a style
    )

    IconButton(
        onClick = { close() },
        modifier = Modifier.size(20.dp) // Set size as needed
    ) {
        Icon(
            painter = painterResource(id = R.drawable.logo), // Replace with your icon resource
            contentDescription = "Button Icon"
        )
    }
}

        Divider(color = Color.Gray, thickness = 1.dp)
        Row {
            FilterCategoryList{
                println(it)
                categoryPos = it
            }
            Box(
                modifier = Modifier
                    .width(1.dp) // Set width for the divider
                    .fillMaxHeight() // Fill the height of the parent
                    .background(Color.Gray) // Set color for the divider
            )
            when(categoryPos)
            {
                0-> FilterSort()
                1-> FilterVegNonVeg()
                2-> FilterRating()
                3-> FilterCostForTwo()
                4->Text(text = "hello")
            }

    }




    }
}

@Composable
@Preview(showSystemUi = true)
fun FilterScreenPreview()
{
ZwiggyTheme {
    FilterScreen{

    }
}
}