package com.example.zwiggy.features.dashbaord.widgets


import RestaurantCardView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.features.filter.FilterScreen

import com.example.zwiggy.ui.theme.ZwiggyTheme

private val sampleData =
    mutableListOf("1", "2", "3", "4","6","7","8","9","10")
private val listModifier = Modifier
    .fillMaxSize()



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  RestaurantScreen()
{
    val sheetState = rememberModalBottomSheetState()
    var showSheet by remember {
        mutableStateOf(false)
    }

    Column {

        Button(onClick = {showSheet = true }) {

        }

        RestaurantListView({ RestaurantCardView() })
    }

    if (showSheet)
    {
        ModalBottomSheet(sheetState = sheetState,
            onDismissRequest = {showSheet = false}) {
            FilterScreen {

            }

        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun RestaurantScreenPreview()
{
    ZwiggyTheme {
        RestaurantScreen()
    }
}