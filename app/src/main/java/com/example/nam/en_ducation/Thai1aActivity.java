package com.example.nam.en_ducation;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Thai1aActivity extends AppCompatActivity {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai1a);
        ImageView imageView139 = (ImageView) findViewById(R.id.imageView139);
        ImageView imageView145 = (ImageView) findViewById(R.id.imageView145);
        ImageView imageView150 = (ImageView) findViewById(R.id.imageView150);
        ImageView imageView151 = (ImageView) findViewById(R.id.imageView151);
        ImageView imageView152 = (ImageView) findViewById(R.id.imageView152);
        ImageView imageView153 = (ImageView) findViewById(R.id.imageView153);
        ImageView imageView154 = (ImageView) findViewById(R.id.imageView154);
        ImageView imageView155 = (ImageView) findViewById(R.id.imageView155);
        ImageView imageView156 = (ImageView) findViewById(R.id.imageView156);
        ImageView imageView157 = (ImageView) findViewById(R.id.imageView157);
        ImageView imageView158 = (ImageView) findViewById(R.id.imageView158);
        ImageView imageView159 = (ImageView) findViewById(R.id.imageView159);
        ImageView imageView160 = (ImageView) findViewById(R.id.imageView160);
        ImageView imageView161 = (ImageView) findViewById(R.id.imageView161);
        ImageView imageView162 = (ImageView) findViewById(R.id.imageView162);
        ImageView imageView163 = (ImageView) findViewById(R.id.imageView163);
        ImageView imageView164 = (ImageView) findViewById(R.id.imageView164);
        ImageView imageView165 = (ImageView) findViewById(R.id.imageView165);
        ImageView imageView166 = (ImageView) findViewById(R.id.imageView166);
        ImageView imageView167 = (ImageView) findViewById(R.id.imageView167);
        ImageView imageView168 = (ImageView) findViewById(R.id.imageView168);
        ImageView imageView169 = (ImageView) findViewById(R.id.imageView169);
        ImageView imageView170 = (ImageView) findViewById(R.id.imageView170);
        ImageView imageView171 = (ImageView) findViewById(R.id.imageView171);
        ImageView imageView172 = (ImageView) findViewById(R.id.imageView172);
        ImageView imageView173 = (ImageView) findViewById(R.id.imageView173);
        ImageView imageView174 = (ImageView) findViewById(R.id.imageView174);
        ImageView imageView175 = (ImageView) findViewById(R.id.imageView175);
        ImageView imageView176 = (ImageView) findViewById(R.id.imageView176);
        ImageView imageView177 = (ImageView) findViewById(R.id.imageView177);
        ImageView imageView178 = (ImageView) findViewById(R.id.imageView178);
        ImageView imageView179 = (ImageView) findViewById(R.id.imageView179);
        ImageView imageView180 = (ImageView) findViewById(R.id.imageView180);
        ImageView imageView181 = (ImageView) findViewById(R.id.imageView181);
        ImageView imageView182 = (ImageView) findViewById(R.id.imageView182);
        ImageView imageView183 = (ImageView) findViewById(R.id.imageView183);
        ImageView imageView184 = (ImageView) findViewById(R.id.imageView184);
        ImageView imageView185 = (ImageView) findViewById(R.id.imageView185);
        ImageView imageView186 = (ImageView) findViewById(R.id.imageView186);
        ImageView imageView187 = (ImageView) findViewById(R.id.imageView187);
        ImageView imageView188 = (ImageView) findViewById(R.id.imageView188);
        ImageView imageView189 = (ImageView) findViewById(R.id.imageView189);
        ImageView imageView190 = (ImageView) findViewById(R.id.imageView190);
        ImageView imageView191 = (ImageView) findViewById(R.id.imageView191);


        imageView139.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a1);
                mp.start();
            }

        });

        imageView145.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a2);
                mp.start();
            }
        });
        imageView150.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a3);
                mp.start();
            }
        });
        imageView151.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a4);
                mp.start();
            }
        });
        imageView152.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a6);
                mp.start();
            }
        });
        imageView153.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a5);
                mp.start();
            }
        });
        imageView154.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a7);
                mp.start();
            }

        });

        imageView155.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a8);
                mp.start();
            }
        });
        imageView156.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a9);
                mp.start();
            }
        });
        imageView157.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a10);
                mp.start();
            }
        });
        imageView158.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a11);
                mp.start();
            }
        });
        imageView159.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a12);
                mp.start();
            }
        });
        imageView160.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a13);
                mp.start();
            }

        });

        imageView161.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a14);
                mp.start();
            }
        });
        imageView162.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a15);
                mp.start();
            }
        });
        imageView163.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a16);
                mp.start();
            }
        });
        imageView164.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a17);
                mp.start();
            }
        });
        imageView165.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a18);
                mp.start();
            }
        });
        imageView166.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a20);
                mp.start();
            }

        });

        imageView167.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a19);
                mp.start();
            }
        });
        imageView168.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a21);
                mp.start();
            }
        });
        imageView169.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a22);
                mp.start();
            }
        });
        imageView170.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a23);
                mp.start();
            }
        });
        imageView171.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a24);
                mp.start();
            }
        });
        imageView172.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a25);
                mp.start();
            }

        });
        imageView173.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a26);
                mp.start();
            }
        });
        imageView174.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a27);
                mp.start();
            }
        });
        imageView175.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a28);
                mp.start();
            }
        });
        imageView176.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a29);
                mp.start();
            }
        });
        imageView177.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a30);
                mp.start();
            }
        });
        imageView178.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a31);
                mp.start();
            }

        });
        imageView179.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a32);
                mp.start();
            }
        });
        imageView180.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a33);
                mp.start();
            }
        });
        imageView181.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a34);
                mp.start();
            }
        });
        imageView182.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a35);
                mp.start();
            }
        });
        imageView183.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a36);
                mp.start();
            }
        });
        imageView184.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a37);
                mp.start();
            }
        });
        imageView185.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a38);
                mp.start();
            }
        });
        imageView186.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a39);
                mp.start();
            }

        });

        imageView187.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a40);
                mp.start();
            }
        });
        imageView188.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a41);
                mp.start();
            }
        });
        imageView189.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a42);
                mp.start();
            }
        });
        imageView190.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a43);
                mp.start();
            }
        });
        imageView191.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(Thai1aActivity.this, R.raw.a44);
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
            startActivity(new Intent(this, Thai1Activity.class));
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
