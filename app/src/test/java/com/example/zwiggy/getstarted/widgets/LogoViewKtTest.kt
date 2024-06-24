package com.example.zwiggy.getstarted.widgets

import androidx.annotation.DrawableRes
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.captureToImage
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.zwiggy.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import java.util.regex.Matcher

@RunWith(RobolectricTestRunner::class)
class LogoViewKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    private fun hasDrawable(imageName: Int): SemanticsMatcher =
        SemanticsMatcher.expectValue(DrawableId, imageName)

    @Test
    fun testLogoImage() {
       
        composeTestRule.setContent {
            LogoView()
        }

        composeTestRule.onNodeWithContentDescription("logo_image").assertExists()
        composeTestRule.onNode(hasDrawable(R.drawable.logo)).assertExists()
    }

    @Test
    fun testLogoText() {
        composeTestRule.setContent {
            LogoView()
        }

        composeTestRule.onNodeWithText("Zwiggy").assertExists()
    }



}