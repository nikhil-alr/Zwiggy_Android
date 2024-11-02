package com.example.feature.getstarted.widgets
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.SemanticsPropertyReceiver
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.feature.R
import com.example.feature.ui.theme.ZwiggyTheme

val DrawableId = SemanticsPropertyKey<Int>("DrawableResId")
var SemanticsPropertyReceiver.drawableId by DrawableId

@Composable
fun LogoView() {

    Column(Modifier
        .semantics {
            this.contentDescription = "logo_view"
        }) {

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "logo",
            contentScale = ContentScale.Crop,

            modifier = Modifier
                .size(140.dp)
                .padding(vertical = 10.dp)
                .semantics {
                       this.contentDescription = "logo_image"
                        drawableId = R.drawable.logo
                }
        )

        Text(text = stringResource(id = R.string.app_name),
            color = Color.White ,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.semantics {
            this.contentDescription = "logo_text"
        })


    }
}


@Preview()
@Composable
fun LogoViewPreview() {
    ZwiggyTheme {
        LogoView()
    }
}