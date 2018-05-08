package com.example.nam.en_ducation;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Hard6Mode extends AppCompatActivity {
    private ArrayList<Integer> randomSmallJigsawPic = new ArrayList<Integer>();
    private ArrayList<Integer> ANS;
    private Integer resource;
    private ArrayList<Integer> BtSmallJigsaw_arr = new ArrayList<Integer>();
    private ArrayList<Integer> BtBigJigsaw_arr = new ArrayList<Integer>();
    private int counter = 0;
    private int numberJigsaw = 9;
    private ImageButton BigJigsaw[] = new ImageButton[numberJigsaw];
    private ImageButton SmallJigsaw[] = new ImageButton[numberJigsaw];
    private TextView txtTime;
    private CountDownTimer CountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hard6_mode);

        txtTime = (TextView) findViewById(R.id.txtTime);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw1_id);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw2_id);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw3_id);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw4_id);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw5_id);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw6_id);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw7_id);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw8_id);
        BtBigJigsaw_arr.add(R.id.BtBigJigsaw9_id);

        for (int i = 0; i < BtBigJigsaw_arr.size(); i++) {
            BigJigsaw[i] = (ImageButton) findViewById(BtBigJigsaw_arr.get(i));
            BigJigsaw[i].setTag(R.drawable.dropans2);
        }
        randomSmallJigsawPic.add(R.drawable.long51);
        randomSmallJigsawPic.add(R.drawable.long52);
        randomSmallJigsawPic.add(R.drawable.long53);
        randomSmallJigsawPic.add(R.drawable.long54);
        randomSmallJigsawPic.add(R.drawable.long55);
        randomSmallJigsawPic.add(R.drawable.long56);
        randomSmallJigsawPic.add(R.drawable.long57);
        randomSmallJigsawPic.add(R.drawable.long58);
        randomSmallJigsawPic.add(R.drawable.long59);

        ANS = new ArrayList<Integer>(randomSmallJigsawPic);
        Collections.shuffle(randomSmallJigsawPic);

        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw1_id);
        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw2_id);
        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw3_id);
        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw4_id);
        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw5_id);
        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw6_id);
        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw7_id);
        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw8_id);
        BtSmallJigsaw_arr.add(R.id.BtSmallJigsaw9_id);


        for (int i = 0; i < BtSmallJigsaw_arr.size(); i++) {
            SmallJigsaw[i] = (ImageButton) findViewById(BtSmallJigsaw_arr.get(i));
            SmallJigsaw[i].setImageResource(randomSmallJigsawPic.get(0));
            SmallJigsaw[i].setTag(randomSmallJigsawPic.remove(0));
        }
        CountDown = new CountDownTimer(60000, 1000) {
            public void onTick(long millisUntilFinished) {
                txtTime.setText("Time Left:" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                DialogBox("หมดเวลา!!");
            }
        };
        CountDown.start();
    }

    public void SmallJigsawClicked(View v) {
        ImageButton b = (ImageButton) v;
        resource = (Integer) b.getTag();
    }

    public void BigJigsawClick(View v) {
        ImageButton p = (ImageButton) v;
        p.setImageResource(resource);
        p.setTag(resource);
    }

    public void checkClicked(View v) {
        for (int i = 0; i < BigJigsaw.length; i++) {
            if ((int) BigJigsaw[i].getTag() == ANS.get(i)) {
                counter++;
            }
        }
        if (counter == numberJigsaw) {
            CountDown.cancel();
            DialogBox("ถูกต้อง");
            counter = 0;
        } else {
            Toast.makeText(getApplicationContext(), "ผิด!!", Toast.LENGTH_SHORT).show();
            counter = 0;
        }
    }

    private void DialogBox(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Jigsaw 4");
        builder.setIcon(R.drawable.logo);
        builder.setMessage(msg)
                .setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();


                    }
                })
                .setNegativeButton("Replay", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
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
            startActivity(new Intent(this, EngEn5c.class));
            return true;
        }
        if (id == R.id.home){
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed() {
        startActivity(new Intent(this, EngEn5c.class));
    }

}
