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
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class EngEn1c extends AppCompatActivity {
    Button Btch1, Btch2, Btch3, Btch4;
   // ImageView Image;
    ImageButton Btspeaker;
    int score = 0;
    int guestionCount = 10;
    ArrayList<Integer> IDchoice = new ArrayList<Integer>();
    String Answer;
    MediaPlayer correct,wrong,mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en1c);

        Btch1 = (Button) findViewById(R.id.Btch1);
        Btch2 = (Button) findViewById(R.id.Btch2);
        Btch3 = (Button) findViewById(R.id.Btch3);
        Btch4 = (Button) findViewById(R.id.Btch4);
        Btspeaker = (ImageButton) findViewById(R.id.imageButton);
       // Image = (ImageView) findViewById(R.id.imageView);
         correct = MediaPlayer.create(this, R.raw.correct);
         wrong = MediaPlayer.create(this, R.raw.wrong);

        for (int i = 1; i <= guestionCount; i++)
            IDchoice.add(i);
            Collections.shuffle(IDchoice);
            setQuestion(IDchoice.remove(0));
        }


    private void setQuestion(int IDchoice) {
        if (IDchoice == 1) {
            Answer = "C";
          //  Image.setImageResource(R.drawable.eng408);
            mPlayer = MediaPlayer.create(this, R.raw.eng03c);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("C");
            choice.add("P");
            choice.add("E");
            choice.add("B");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 3) {
            Answer = "L";
        //    Image.setImageResource(R.drawable.eng410);
            mPlayer = MediaPlayer.create(this, R.raw.eng12l);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("T");
            choice.add("L");
            choice.add("S");
            choice.add("I");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 3) {
            Answer = "R";
         //   Image.setImageResource(R.drawable.eng407);
            mPlayer = MediaPlayer.create(this, R.raw.eng18r);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("F");
            choice.add("A");
            choice.add("R");
            choice.add("G");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 4) {
            Answer = "F";
         //   Image.setImageResource(R.drawable.eng411);
            mPlayer = MediaPlayer.create(this, R.raw.eng06f);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("K");
            choice.add("S");
            choice.add("H");
            choice.add("F");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 5) {
            Answer = "J";
          //  Image.setImageResource(R.drawable.eng414);
            mPlayer = MediaPlayer.create(this, R.raw.eng10j);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("J");
            choice.add("T");
            choice.add("L");
            choice.add("I");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 6) {
            Answer = "W";
          //  Image.setImageResource(R.drawable.eng415);
            mPlayer = MediaPlayer.create(this, R.raw.eng23w);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("V");
            choice.add("M");
            choice.add("W");
            choice.add("U");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 7) {
            Answer = "D";
           // Image.setImageResource(R.drawable.test1d);
            mPlayer = MediaPlayer.create(this, R.raw.eng04d);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("D");
            choice.add("O");
            choice.add("A");
            choice.add("L");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 8) {
            Answer = "P";
           // Image.setImageResource(R.drawable.test1p);
            mPlayer = MediaPlayer.create(this, R.raw.eng16e);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("B");
            choice.add("P");
            choice.add("D");
            choice.add("N");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 9) {
            Answer = "I";
          //  Image.setImageResource(R.drawable.test1i);
            mPlayer = MediaPlayer.create(this, R.raw.eng09i);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("E");
            choice.add("L");
            choice.add("J");
            choice.add("I");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 10) {
            Answer = "U";
          //  Image.setImageResource(R.drawable.test1u);
           mPlayer = MediaPlayer.create(this, R.raw.eng21u);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("U");
            choice.add("O");
            choice.add("E");
            choice.add("Q");
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
        builder.setTitle("Game Over");
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
            startActivity(new Intent(this, EngEn1.class));
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
