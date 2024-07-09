package com.example.learningfrenchlang;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);
        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        /*redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.red);
                mediaPlayer.start();
            }
        });
        blackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.black);
                mediaPlayer.start();
            }
        });
        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.green);
                mediaPlayer.start();
            }
        });
        purpleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.purple);
                mediaPlayer.start();
            }
        });
        yellowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yellow);
                mediaPlayer.start();
            }
        });*/

    }

    @Override
    public void onClick(View v) {
        int clickedButtonId = v.getId();
        if (clickedButtonId == R.id.blackBtn){
            playSound(R.raw.black);
        }
        else if (clickedButtonId == R.id.greenBtn){
            playSound(R.raw.green);
        }
       else if (clickedButtonId == R.id.purpleBtn){
            playSound(R.raw.purple);
        }
       else if (clickedButtonId == R.id.redBtn){
            playSound(R.raw.red);
        }
        else if (clickedButtonId == R.id.yellowBtn){
            playSound(R.raw.yellow);
        }

    }
    public void playSound(int resourceId){
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, resourceId);
        mediaPlayer.start();
    }
}