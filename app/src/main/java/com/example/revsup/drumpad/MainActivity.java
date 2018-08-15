package com.example.revsup.drumpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int sound1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound1 = sp.load(getApplicationContext(), R.raw.sound1, 1);
    }


    public void playSound(View 1){

    }





}
