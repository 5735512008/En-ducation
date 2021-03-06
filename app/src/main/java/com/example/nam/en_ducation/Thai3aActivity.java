package com.example.nam.en_ducation;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Thai3aActivity extends AppCompatActivity {

    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai3a);
        ImageView b2 = (ImageView) findViewById(R.id.a);
        ImageView b3 = (ImageView) findViewById(R.id.b);
        ImageView b4 = (ImageView) findViewById(R.id.c);
        ImageView b5 = (ImageView) findViewById(R.id.d);
        ImageView b6 = (ImageView) findViewById(R.id.ka);
        ImageView b7 = (ImageView) findViewById(R.id.de);
        ImageView b8 = (ImageView) findViewById(R.id.au);
        ImageView b9 = (ImageView) findViewById(R.id.ka1);
        ImageView b10 = (ImageView) findViewById(R.id.de1);
        ImageView b11 = (ImageView) findViewById(R.id.au1);
        ImageView b12 = (ImageView) findViewById(R.id.ka2);
        ImageView b13 = (ImageView) findViewById(R.id.de2);
        ImageView b14 = (ImageView) findViewById(R.id.au2);
        ImageView b15 = (ImageView) findViewById(R.id.ka3);
        ImageView b16 = (ImageView) findViewById(R.id.de3);
        ImageView b17 = (ImageView) findViewById(R.id.au3);
        ImageView b18 = (ImageView) findViewById(R.id.ka4);
        ImageView b19 = (ImageView) findViewById(R.id.de4);
        ImageView b20 = (ImageView) findViewById(R.id.au4);

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.sound3a);
                mp.start();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.sound3b);
                mp.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.sound3c);
                mp.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.sound3d);
                mp.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.ka);
                mp.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.de);
                mp.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.au);
                mp.start();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.ka1);
                mp.start();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.de1);
                mp.start();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.au1);
                mp.start();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.ka3);
                mp.start();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.de3);
                mp.start();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.au3);
                mp.start();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.ka4);
                mp.start();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.de4);
                mp.start();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.au4);
                mp.start();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.ka5);
                mp.start();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.de5);
                mp.start();
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai3aActivity.this, R.raw.au5);
                mp.start();
            }
        });
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chap1a, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.back){
            startActivity(new Intent(this, Thai3Activity.class));
            return true;
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.home){
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
