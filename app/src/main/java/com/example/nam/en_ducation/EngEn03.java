package com.example.nam.en_ducation;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class EngEn03 extends AppCompatActivity {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en03);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);

        imageView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes1);
                mp.start();
            }

        });

        imageView2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes2);
                mp.start();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes3);
                mp.start();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes4);
                mp.start();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes5);
                mp.start();
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes4);
                mp.start();
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes7);
                mp.start();
            }

        });

        imageView8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes8);
                mp.start();
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes9);
                mp.start();
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes10);
                mp.start();
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes11);
                mp.start();
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes12);
                mp.start();
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes13);
                mp.start();
            }

        });

        imageView14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(EngEn03.this, R.raw.shapes14);
                mp.start();
            }
        });

        imageView15.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            stopPlaying();
            mp = MediaPlayer.create(EngEn03.this, R.raw.shapes15);
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
        return (super.onCreateOptionsMenu(menu));
    }

    @Override
public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.back){
        startActivity(new Intent(this, EngEn3.class));
        return true;
    }
    if (id == R.id.home){
        startActivity(new Intent(this, MainActivity.class));
        return true;
    }

    return super.onOptionsItemSelected(item);
}
    public void onBackPressed() {
        startActivity(new Intent(this, EnglishActivity.class));
    }

}