package com.example.zwiggy.getstarted.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.ui.theme.ZwiggyTheme
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import com.example.zwiggy.R

@Composable
fun TextAnimationView() {



    Column(Modifier.padding(vertical = 10.dp)
    ) {

Row(verticalAlignment = Alignment.CenterVertically)
{
    Text(text = "Text",Modifier.padding(end = 5.dp), color = Color.Blue)
    Surface(modifier = Modifier.width(3.dp).height(3.dp), color = Color.Blue, shape = CircleShape) {

    }
    Text(text = "Text",Modifier.padding(horizontal = 5.dp), color = Color.Blue)
    Surface(modifier = Modifier.width(3.dp).height(3.dp), color = Color.Blue, shape = CircleShape) {

    }
    Text(text = "Text",Modifier.padding(horizontal = 5.dp), color = Color.Blue)
}

        Surface(modifier = Modifier.fillMaxWidth().height(1.dp), color = Color.Blue) {

        }
        Text(text = "Text", color = Color.Blue)

    }
}


@Preview()
@Composable
fun TextAnimationViewPreview() {
    ZwiggyTheme {
        TextAnimationView()
    }
}