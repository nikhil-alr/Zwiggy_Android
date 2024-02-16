package com.example.zwiggy.getstarted.widgets
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.ui.theme.ZwiggyTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.zwiggy.R


@Composable
fun LogoView() {

    Column {

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(140.dp)
                .padding(vertical = 10.dp)
        )

        Text(text = stringResource(id = R.string.app_name), color = Color.White , fontSize = 30.sp, fontWeight = FontWeight.Bold )


    }
}


@Preview()
@Composable
fun LogoViewPreview() {
    ZwiggyTheme {
        LogoView()
    }
}