package com.example.feature.commonui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.feature.R
import com.example.feature.ui.theme.ZwiggyTheme


@Composable
fun NoDataPlaceHolder()
{
Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center) {

    Image(
        painter = painterResource(R.drawable.serving_dish),
        contentDescription = "logo",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(150.dp)

    )
    Text(text = stringResource(id = R.string.no_data_present), fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp))
    PrimaryButtonView("Retry")
    {

    }


}
}


@Preview(showSystemUi = true)
@Composable
fun NoDataPlaceHolderPreview()
{
    ZwiggyTheme {
        NoDataPlaceHolder()
    }
}