package com.ys_production.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class sub_Yt_player extends AppCompatActivity {
Button video,playlist;
EditText playlist_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_yt_player);
        playlist_input = findViewById(R.id.list_input);
        video = findViewById(R.id.play_video);
        playlist = findViewById(R.id.play_playlist);
        video.setOnClickListener(v -> startActivity(YouTubeStandalonePlayer.createVideoIntent(sub_Yt_player.this,"lgiGoq0j2m8","lgiGoq0j2m8")));
        playlist.setOnClickListener(v -> startActivity(YouTubeStandalonePlayer.createPlaylistIntent(sub_Yt_player.this,playlist_input.getText().toString(),playlist_input.getText().toString())));
    }
}