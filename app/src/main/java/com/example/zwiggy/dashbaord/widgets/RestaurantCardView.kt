import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.zwiggy.R
import com.example.zwiggy.dashbaord.widgets.RestaurantListView
import com.example.zwiggy.ui.theme.ZwiggyTheme

@Composable
fun RestaurantCardView() {

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(180.dp)) {

        RestaurantImageView()


        Column(verticalArrangement = Arrangement.Center, modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp)) {
            Text(text = "Title",fontWeight = FontWeight.Bold,fontSize = 22.sp)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.start),
                    contentDescription = "rating",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Text(text = "hello",fontWeight = FontWeight.Bold)
                Surface(
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .width(5.dp)
                        .height(5.dp), color = Color.Yellow, shape = CircleShape
                ) {

                }
                Text(text = "15-20 Mins",fontWeight = FontWeight.Bold)
            }
            Text(text = "Address")
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "hello")
                Surface(
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .width(5.dp)
                        .height(5.dp), color = Yellow, shape = CircleShape
                ) {

                }
                Text(text = "hello")
            }

        }
        }


}

@Preview(showSystemUi = true)
@Composable
fun RestaurantCardViewPreview() {
    ZwiggyTheme {
        RestaurantCardView()
    }
}