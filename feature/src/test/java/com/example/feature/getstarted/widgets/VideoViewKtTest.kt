package com.example.feature.getstarted.widgets

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.feature.MainActivity

import com.google.android.exoplayer2.ui.StyledPlayerView
import org.hamcrest.core.Is
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import com.google.android.exoplayer2.ExoPlayer


@RunWith(RobolectricTestRunner::class)
class VideoViewKtTest
{

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    @Test
    fun testVideoViewIsDisplaying()
    {
        val tagValue = "video"
        val viewWithTagVI = Espresso.onView(ViewMatchers.withTagValue(Is.`is`(tagValue as Any)))
        viewWithTagVI.check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testVideoIsPlaying()
    {
        composeTestRule.activity.findViewById<StyledPlayerView>(R.id.videoViewId).player?.let {
            assert(
                it.isPlaying)
        }

    }

    @Test
    fun testVideoIsPlayingWithNoSound() {
        composeTestRule.activity.findViewById<StyledPlayerView>(R.id.videoViewId).player?.let {
            assert(
                it.volume == 0f
            )

        }
    }

    @Test
    fun testVideoIsPlayingInLoop() {
        composeTestRule.activity.findViewById<StyledPlayerView>(R.id.videoViewId).player?.let {
            assert(
                it.repeatMode == ExoPlayer.REPEAT_MODE_ALL
            )

        }
    }


}