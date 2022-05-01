package com.ys_production.youtubeplayer;

import static androidx.core.app.ActivityOptionsCompat.makeSceneTransitionAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.b1){
            Pair<View,String> pair = Pair.create(v,"t1");
            ActivityOptionsCompat aoc = makeSceneTransitionAnimation(this,v,"t1");
            startActivity(new Intent(this, yT_player.class),aoc.toBundle());

        }
        if (id == R.id.b2){
            Pair pair = Pair.create(v,"t2");
            ActivityOptionsCompat aoc;
            aoc = ActivityOptionsCompat.makeSceneTransitionAnimation(this, androidx.core.util.Pair.create(v,"t2"));
            startActivity(new Intent(this, sub_Yt_player.class),aoc.toBundle());
        }
    }
}