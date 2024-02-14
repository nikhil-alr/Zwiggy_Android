package com.example.zwiggy.getstarted.widgets

import android.net.Uri
import android.widget.VideoView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util

@Composable
fun VideoView(){

    Box(Modifier.fillMaxSize(),) {

        // Fetching the Local Context
        val mContext = LocalContext.current

        // Declaring a string value
        // that stores raw video url
        val mVideoUrl = "asset:///video.mp4"

        // Declaring ExoPlayer
        val mExoPlayer = remember(mContext) {
            ExoPlayer.Builder(mContext).build().apply {

                val dataSourceFactory = DefaultDataSourceFactory(mContext, Util.getUserAgent(mContext, mContext.packageName))
                val source = ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse(mVideoUrl))
                prepare(source)
                repeatMode = ExoPlayer.REPEAT_MODE_ALL
                playWhenReady = playWhenReady
                prepare()
                play()
                //setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);
            }
        }



        // Implementing ExoPlayer
        AndroidView(factory = { context ->
            StyledPlayerView(context).apply {
                //this.useController = false
                //this.hideController()
                player = mExoPlayer
                this.player?.volume = 0f
                this.player?.playWhenReady = true
                useController = false
                this.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FILL
            }
        })

    }
}