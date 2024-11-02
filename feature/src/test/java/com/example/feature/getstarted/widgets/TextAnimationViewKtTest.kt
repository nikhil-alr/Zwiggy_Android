package com.example.feature.getstarted.widgets

import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class TextAnimationViewKtTest
{

    fun hasBoldStyle(textValue: String): SemanticsMatcher =
        SemanticsMatcher.expectValue(DayStatusKey, textValue)

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testIsFirstCategoryWithBoldStyle() {

        composeTestRule.setContent {
            TextAnimationView()
        }

        composeTestRule.onNode(hasBoldStyle("boldFood")).assertIsDisplayed()
        composeTestRule.onNodeWithText("Discounts on foods").assertIsDisplayed()

    }

    @Test
    fun testIsSecondCategoryWithBoldStyle() {
        composeTestRule.setContent {
            TextAnimationView()
        }
        composeTestRule.mainClock.advanceTimeBy(3000)

        composeTestRule.onNode(hasBoldStyle("boldDrinks")).assertIsDisplayed()
        composeTestRule.onNodeWithText("Discount on drinks").assertIsDisplayed()
    }

    @Test
    fun testIsThirdCategoryWithBoldStyle() {


        composeTestRule.setContent {
            TextAnimationView()
        }
        composeTestRule.mainClock.advanceTimeBy(6000)
        composeTestRule.onNode(hasBoldStyle("boldGrocery")).assertIsDisplayed()
        composeTestRule.onNodeWithText("Discount on grocery").assertIsDisplayed()
    }


}