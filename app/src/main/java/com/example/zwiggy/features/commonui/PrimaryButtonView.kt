package com.example.zwiggy.features.commonui

import android.view.MotionEvent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.zwiggy.ui.theme.Orange
import com.example.zwiggy.ui.theme.ZwiggyTheme

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun PrimaryButtonView(text:String,handler:()->Unit) {

    val selected = remember { mutableStateOf(false) }
    val scale = animateFloatAsState(if (selected.value) .97f else 1f)
    Box(
        Modifier
            .scale(scale.value)
            .width(100.dp)
            .height(50.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Orange)
            .semantics {
                this.contentDescription = "primary_button_view"
            }
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_DOWN -> {
                        handler()
                        selected.value = true }

                    MotionEvent.ACTION_UP  -> {
                        selected.value = false }
                }
                true
            }

        ,contentAlignment = Center
    ) {
        Text(text = text,Modifier.padding(horizontal = 5.dp),fontSize = 18.sp,fontWeight = FontWeight.Bold ,color = Color.White)
    }
}


@Preview()
@Composable
fun PrimaryButtonPreview() {
    ZwiggyTheme {
        PrimaryButtonView("test"){}
    }
}