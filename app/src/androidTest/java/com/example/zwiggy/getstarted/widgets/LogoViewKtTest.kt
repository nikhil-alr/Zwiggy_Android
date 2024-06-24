package com.example.zwiggy.getstarted.widgets

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.ui.semantics.SemanticsPropertyKey

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.zwiggy.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Matcher
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule


@RunWith(AndroidJUnit4::class)
class LogoViewKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun logoView() {
        composeTestRule.mainClock.autoAdvance = true
        composeTestRule.setContent {

            LogoView()
        }

        composeTestRule.onNodeWithContentDescription("logo_image").assertExists()
        //composeTestRule.onNodeWithContentDescription("logo_text").assertTextEquals("ii")
        composeTestRule.mainClock.advanceTimeBy(50L)
        val a = composeTestRule.onRoot().captureToImage()
        Log.v("TAG","${a.width} ----  ${a.height}   ")
    }




}