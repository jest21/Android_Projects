package com.lmntrx.music;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {
        MediaPlayer myplayer=MediaPlayer.create(this,R.raw.music);
        if(!myplayer.isPlaying())
            myplayer.start();
        else
            myplayer.pause();


    }

}
