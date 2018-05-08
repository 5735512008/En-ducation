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

public class EngEn8c extends AppCompatActivity {
    Button Btch1, Btch2, Btch3, Btch4;
   ImageView Image;
    ImageButton Btspeaker;
    int score = 0;
    int guestionCount = 10;
    ArrayList<Integer> IDchoice = new ArrayList<Integer>();
    String Answer;
    MediaPlayer correct,wrong,mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en8c);

        Btch1 = (Button) findViewById(R.id.Btch1);
        Btch2 = (Button) findViewById(R.id.Btch2);
        Btch3 = (Button) findViewById(R.id.Btch3);
        Btch4 = (Button) findViewById(R.id.Btch4);
        Btspeaker = (ImageButton) findViewById(R.id.imageButton);
      Image = (ImageView) findViewById(R.id.imageView);
         correct = MediaPlayer.create(this, R.raw.correct);
         wrong = MediaPlayer.create(this, R.raw.wrong);

        for (int i = 1; i <= guestionCount; i++)
            IDchoice.add(i);
            Collections.shuffle(IDchoice);
            setQuestion(IDchoice.remove(0));
        }


    private void setQuestion(int IDchoice) {
        if (IDchoice == 1) {
            Answer = "teacher";
           Image.setImageResource(R.drawable.m701);
            mPlayer = MediaPlayer.create(this, R.raw.m701);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("teacher");
            choice.add("Chef");
            choice.add("Police");
            choice.add("Doctor");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 3) {
            Answer = "Chef";
          Image.setImageResource(R.drawable.m702);
            mPlayer = MediaPlayer.create(this, R.raw.m702);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Nurse");
            choice.add("Chef");
            choice.add("Merchant");
            choice.add("Soldier");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 3) {
            Answer = "Doctor";
        Image.setImageResource(R.drawable.m703);
            mPlayer = MediaPlayer.create(this, R.raw.m703);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Engineer");
            choice.add("Merchant");
            choice.add("Doctor");
            choice.add("Engineer");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 4) {
            Answer = "Engineer";
            Image.setImageResource(R.drawable.m704);
            mPlayer = MediaPlayer.create(this, R.raw.m704);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Soldier");
            choice.add("Farmer");
            choice.add("Engineer");
            choice.add("teacher");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 5) {
            Answer = "Farmer";
            Image.setImageResource(R.drawable.m705);
            mPlayer = MediaPlayer.create(this, R.raw.m705);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Police");
            choice.add("Merchant");
            choice.add("Judge");
            choice.add("Farmer");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 6) {
            Answer = "Judge";
           Image.setImageResource(R.drawable.m706);
            mPlayer = MediaPlayer.create(this, R.raw.m706);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Nurse");
            choice.add("Judge");
            choice.add("Merchant");
            choice.add("Engineer");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 7) {
            Answer = "Merchant";
            Image.setImageResource(R.drawable.m707);
            mPlayer = MediaPlayer.create(this, R.raw.m707);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Farmer");
            choice.add("Nurse");
            choice.add("Chef");
            choice.add("Merchant");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 8) {
            Answer = "Nurse";
            Image.setImageResource(R.drawable.m708);
            mPlayer = MediaPlayer.create(this, R.raw.m708);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Nurse");
            choice.add("Farmer");
            choice.add("Doctor");
            choice.add("Chef");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 9) {
            Answer = "Police";
            Image.setImageResource(R.drawable.m709);
            mPlayer = MediaPlayer.create(this, R.raw.m709);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("Judge");
            choice.add("Soldier");
            choice.add("Chef");
            choice.add("Police");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 10) {
            Answer = "Soldier";
            Image.setImageResource(R.drawable.m710);
            mPlayer = MediaPlayer.create(this, R.raw.m710);
            ArrayList<String> choice = new ArrayList<String>();

            choice.add("teacher");
            choice.add("Police");
            choice.add("Soldier");
            choice.add("Merchant");
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
            startActivity(new Intent(this, EngEn8.class));
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
