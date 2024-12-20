package com.example.feature.getstarted.widgets

import android.view.MotionEvent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.semantics.textSubstitution
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.feature.ui.theme.Orange
import com.example.feature.ui.theme.ZwiggyTheme

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun PrimaryButtonView() {

    val selected = remember { mutableStateOf(false) }
    val scale = animateFloatAsState(if (selected.value) .97f else 1f)
    Box(
        Modifier
            .scale(scale.value)
            .fillMaxWidth()
            .height(50.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Orange)
            .semantics {
                this.contentDescription = "primary_button_view"

            }
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_DOWN -> {
                        selected.value = true }

                    MotionEvent.ACTION_UP  -> {
                        selected.value = false }
                }
                true
            }

        ,contentAlignment = Center
    ) {
        Text(text = "Get started",Modifier.padding(horizontal = 5.dp),fontSize = 18.sp,fontWeight = FontWeight.Bold ,color = Color.White)
    }
}


@Preview()
@Composable
fun PrimaryButtonPreview() {
    ZwiggyTheme {
        PrimaryButtonView()
    }
}