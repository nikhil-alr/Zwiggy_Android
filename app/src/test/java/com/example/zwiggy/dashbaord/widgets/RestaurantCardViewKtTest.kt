package com.example.zwiggy.dashbaord.widgets

import RestaurantCardView
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.text.font.FontWeight
import androidx.test.espresso.matcher.ViewMatchers.hasTextColor
import com.example.zwiggy.getstarted.widgets.DrawableId
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

//private fun hasDrawable(imageName: Int): SemanticsMatcher =
//    SemanticsMatcher.expectValue(SemanticsProperties.Text.co, imageName)
//
//fun hasFontWeight(expectedWeight: FontWeight) = SemanticsMatcher.expectValue(
//    key = SemanticsProperties.FontWeight,
//    value = expectedWeight
//)

@RunWith(RobolectricTestRunner::class)
class RestaurantCardViewKtTest
{
    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun `test resturantcardview should have title with black color`() {
        composeTestRule.setContent {
            RestaurantCardView()
        }
        //composeTestRule.onNodeWithText("Title").assert(hasTextColor(Color.Black)))

    }
}