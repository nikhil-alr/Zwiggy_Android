package com.example.zwiggy.getstarted.widgets

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.ui.theme.ZwiggyTheme
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun TextAnimationView() {

    val description = arrayOf("Discounts on foods", "Discount on drinks", "Discount on grocery")
    var textIndex by remember { mutableIntStateOf(0) }
    LaunchedEffect(Unit) {
        while (true) {
            delay(3.seconds)
            textIndex = (textIndex + 1) % 3

        }
    }


    Column(
        Modifier.padding(top = 10.dp, bottom = 20.dp)
            .semantics {
                this.contentDescription = "text_anim_view"
            }

            ) {

        CategoryAnimatedView(textIndex)
        Surface(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .fillMaxWidth()
                .height(1.dp), color = Color.Gray
        ) {

        }
        DescriptionAnimatedView(description[textIndex])

    }

}




@Preview()
@Composable
fun TextAnimationViewPreview() {
    ZwiggyTheme {
        TextAnimationView()
    }
}