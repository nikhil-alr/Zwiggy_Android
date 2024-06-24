package com.example.zwiggy.getstarted


import android.util.Log
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withTagValue
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.zwiggy.MainActivity
import com.example.zwiggy.R
import com.google.android.exoplayer2.ui.StyledPlayerView
import org.hamcrest.core.Is.`is`
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class GetStartedKtTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()


    @Test
    fun testGetStarted() {
//        composeTestRule.setContent {
//            GetStarted()
//        }

        composeTestRule.onNodeWithContentDescription("video_view").assertExists()
        composeTestRule.onNodeWithContentDescription("logo_view").assertExists()
        composeTestRule.onNodeWithContentDescription("text_anim_view").assertExists()
        composeTestRule.onNodeWithContentDescription("primary_button_view").assertExists()

       //composeTestRule.onNodeWithTag("video").assertExists()
//        val tagValue = "videio"
//        val viewWithTagVI = onView(withTagValue(`is`(tagValue as Any)))
//        viewWithTagVI.check(matches(isDisplayed()));
        composeTestRule.activity.findViewById<StyledPlayerView>(R.id.videoViewId).player?.let {
        }
    }




}