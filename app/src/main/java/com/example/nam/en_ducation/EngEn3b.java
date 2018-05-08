package com.example.nam.en_ducation;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Collections;

public class EngEn3b extends AppCompatActivity {
    Button Btch1, Btch2, Btch3, Btch4;
   //  ImageView Image;
    ImageButton Btspeaker;
    int score = 0;
    int guestionCount = 10;
    ArrayList<Integer> IDchoice = new ArrayList<Integer>();
    String Answer;
    MediaPlayer correct,wrong,mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en3b);

        Btch1 = (Button) findViewById(R.id.Btch1);
        Btch2 = (Button) findViewById(R.id.Btch2);
        Btch3 = (Button) findViewById(R.id.Btch3);
        Btch4 = (Button) findViewById(R.id.Btch4);
        Btspeaker = (ImageButton) findViewById(R.id.imageButton);
      //  Image = (ImageView) findViewById(R.id.imageView);
         correct = MediaPlayer.create(this, R.raw.correct);
         wrong = MediaPlayer.create(this, R.raw.wrong);

        for (int i = 1; i <= guestionCount; i++)
            IDchoice.add(i);
            Collections.shuffle(IDchoice);
            setQuestion(IDchoice.remove(0));
        }


    private void setQuestion(int IDchoice) {
        if (IDchoice == 1) {
            Answer = "Circle";
         //  Image.setImageResource(R.drawable.num33);
            mPlayer = MediaPlayer.create(this, R.raw.shapes01);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Ellipse");
            choice.add("Circle");
            choice.add("Square");
            choice.add("heptagon");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 2) {
            Answer = "Ellipse";
          // Image.setImageResource(R.drawable.num38);
            mPlayer = MediaPlayer.create(this,  R.raw.shapes02);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("heptagon");
            choice.add("Square");
            choice.add("Circle");
            choice.add("Ellipse");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 3) {
            Answer = "Square";
         //   Image.setImageResource(R.drawable.num32);
            mPlayer = MediaPlayer.create(this,  R.raw.shapes03);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Rectangle");
            choice.add("Square");
            choice.add("Ellipse");
            choice.add("Heart");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 4) {
            Answer = "Rectangle";
         //  Image.setImageResource(R.drawable.num36);
            mPlayer = MediaPlayer.create(this,  R.raw.shapes04);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Star");
            choice.add("Rectangle");
            choice.add("Triangle");
            choice.add("Crescent");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 5) {
            Answer = "Triangle";
            //Image.setImageResource(R.drawable.num35);
            mPlayer = MediaPlayer.create(this, R.raw.shapes05);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Pentagon");
            choice.add("Rectangle");
            choice.add("Triangle");
            choice.add("diamobd");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }

        if (IDchoice == 6) {
            Answer = "Pentagon";
         //   Image.setImageResource(R.drawable.num40);
            mPlayer = MediaPlayer.create(this, R.raw.shapes08);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Pentagon");
            choice.add("hexagon");
            choice.add("heptagon");
            choice.add("octagon");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }


        if (IDchoice == 7) {
            Answer = "Star";
         //    Image.setImageResource(R.drawable.num31);
            mPlayer = MediaPlayer.create(this, R.raw.shapes012);
            ArrayList<String> choice = new ArrayList<String>();

            choice.add("Heart");
            choice.add("octagon");
            choice.add("Heart");
            choice.add("Star");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 8) {
            Answer = "Heart";
           // Image.setImageResource(R.drawable.num34);
            mPlayer = MediaPlayer.create(this, R.raw.shapes013);
            ArrayList<String> choice = new ArrayList<String>();

            choice.add("Heart");
            choice.add("Crescent");
            choice.add("Arrow");
            choice.add("Star");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }

        if (IDchoice==9){
             Answer="Diamond";
          //   Image.setImageResource(R.drawable.num37);
             mPlayer = MediaPlayer.create(this, R.raw.shapes07);
             ArrayList<String> choice = new ArrayList<String>();
         choice.add("Diamond");
         choice.add("Crescent");
         choice.add("hexagon");
         choice.add("Circle");
         Collections.shuffle(choice);

         Btch1.setText(choice.remove(0));
              Btch2.setText(choice.remove(0));
         Btch3.setText(choice.remove(0));
         Btch4.setText(choice.remove(0));
        }

         if (IDchoice==10){
              Answer="hexagon";
          //    Image.setImageResource(R.drawable.num39);
              mPlayer = MediaPlayer.create(this, R.raw.shapes09);
              ArrayList<String> choice = new ArrayList<String>();
          choice.add("heptagon");
          choice.add("Crescent");
          choice.add("hexagon");
          choice.add("Circle");
          Collections.shuffle(choice);

          Btch1.setText(choice.remove(0));
               Btch2.setText(choice.remove(0));
          Btch3.setText(choice.remove(0));
          Btch4.setText(choice.remove(0));
         }

    }


    public void choiceAns(View v) {
        Button b = (Button) v;
        String buttonText = b.getText().toString();
        if (buttonText.equals(Answer)) {
            correct.start();
            score++;
                    }
        if (buttonText != Answer ) {
            wrong.start();

        }
        if (IDchoice.isEmpty()) {
            DialogBox();
        } else {
            setQuestion(IDchoice.remove(0));

                    }
    }

    public void playSound(View v) {
        mPlayer.start();
    }

    private void DialogBox() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("จบเกมส์");
        builder.setIcon(R.drawable.logo);
        builder.setMessage(" คุณได้คะแนน " + score + " คะแนน")
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
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.back){
            startActivity(new Intent(this, EngEn3.class));
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
