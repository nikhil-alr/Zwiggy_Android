package com.example.zwiggy.getstarted

import android.util.Log
import android.widget.VideoView
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.zwiggy.MainActivity
import com.example.zwiggy.getstarted.widgets.LogoView
import net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver.Simple
import org.hamcrest.core.Is
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import com.example.zwiggy.R
import com.example.zwiggy.getstarted.widgets.DayStatusKey
import com.google.android.exoplayer2.ui.StyledPlayerView


@RunWith(RobolectricTestRunner::class)
class GetStartedKtTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()


    @Test
    fun testGetStarted() {

        composeTestRule.onNodeWithContentDescription("video_view").assertExists()
        composeTestRule.onNodeWithContentDescription("logo_view").assertExists()
        composeTestRule.onNodeWithContentDescription("text_anim_view").assertExists()
        composeTestRule.onNodeWithContentDescription("primary_button_view").assertExists()

    }
}