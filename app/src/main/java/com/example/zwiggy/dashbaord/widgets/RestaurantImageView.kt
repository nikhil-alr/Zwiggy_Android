import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zwiggy.R
import com.example.zwiggy.ui.theme.ZwiggyTheme

@Composable
fun RestaurantImageView()
{
    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxHeight()
        .width(130.dp), elevation = CardDefaults.cardElevation(
        defaultElevation = 4.dp
    )) {
        Image(
            painter = painterResource(R.drawable.food_placeholder),
            contentDescription = "logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantImageViewPreview() {
    ZwiggyTheme {
        Surface(modifier = Modifier.height(170.dp)) {
            RestaurantImageView()
        }

    }
}
