package com.ys_production.youtubeplayer;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class yT_player extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, YouTubePlayer.PlaybackEventListener, YouTubePlayer.PlayerStateChangeListener {
    private static final String TAG = "yT_player";
    Button bp;
    private String API_KEY = "AIzaSyBs_-W2LAgu1O75AgRrBVg-YsuEgxZq1pk";
    private static String VIDEO_ID = "lgiGoq0j2m8";
    private String PLAY_LIST = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ConstraintLayout layout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_yt_player, null);
        setContentView(layout);
//        bp = findViewById(R.id.button_p);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.yt_player_view);

//        bl.setOnClickListener(v -> setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE));
//        bp.setOnClickListener(v -> setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT));
       youTubePlayerView.initialize(API_KEY, this);
//        bp.setOnClickListener(v -> {
////            youTubePlayerView2.initialize(API_KEY, this);
//            super.onBackPressed();
//        });



    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Toast.makeText(this, "initialization success", Toast.LENGTH_SHORT).show();
        youTubePlayer.loadVideo("lgiGoq0j2m8");
        youTubePlayer.setPlaybackEventListener(this);
        youTubePlayer.setPlayerStateChangeListener(this);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Log.e(TAG, "onInitializationFailure: " + youTubeInitializationResult.toString());
    }

    @Override
    public void onPlaying() {
        Log.i(TAG, "onPlaying: ");
    }

    @Override
    public void onPaused() {
        Log.i(TAG, "onPaused: ");
    }

    @Override
    public void onStopped() {
        Log.i(TAG, "onStopped: ");
    }

    @Override
    public void onBuffering(boolean b) {
        Log.i(TAG, "onBuffering: ");
    }

    @Override
    public void onSeekTo(int i) {
        Log.i(TAG, "onSeekTo: ");
    }

    @Override
    public void onLoading() {
        Log.i(TAG, "onLoading: ");
    }

    @Override
    public void onLoaded(String s) {
        Log.i(TAG, "onLoaded: ");
    }

    @Override
    public void onAdStarted() {
        Log.i(TAG, "onAdStarted: ");
    }

    @Override
    public void onVideoStarted() {
        Log.i(TAG, "onVideoStarted: ");
    }

    @Override
    public void onVideoEnded() {
        Log.i(TAG, "onVideoEnded: ");
    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {
        Log.e(TAG, "onError: " + errorReason.toString());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}