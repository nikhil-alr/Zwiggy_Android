package com.example.feature.getstarted.widgets

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.viewinterop.AndroidView
import com.example.feature.R
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util

@Composable
fun VideoView(){

    Box(Modifier.fillMaxSize()
        .semantics {
            this.contentDescription = "video_view"
        }) {

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
                id = R.id.videoViewId
                tag = "video"
                player = mExoPlayer
                this.player?.volume = 0f
                this.player?.playWhenReady = true
                useController = false
                this.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FILL
            }
        })

    }
}