package com.example.feature.filter.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.feature.ui.theme.ZwiggyTheme


private val listModifier = Modifier
    .fillMaxSize()
@Composable
fun FilterCategoryList(onClick:(itemPos:Int)->Unit)
{

    val sampleData =
        remember {
            mutableStateListOf(true, false, false, false)
        }
        LazyColumn(modifier = Modifier.width(150.dp),verticalArrangement = Arrangement.spacedBy(10.dp)) {
            items(sampleData.size) { item ->
                FilterCategoryItem(sampleData[item]) {
                    onClick(item)
                    for (i in sampleData.indices) {
                        sampleData[i] = i == item
                    }
                    println(sampleData)
                }
            }




    }


}


@Composable
@Preview(showSystemUi = true)
fun FilterCategoryListPreview()
{
    ZwiggyTheme {
        FilterCategoryList {}
    }
}