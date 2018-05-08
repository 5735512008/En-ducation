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

public class ThaiTest extends AppCompatActivity {
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
        setContentView(R.layout.thai_test);

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
            Answer = "ป";
            Image.setImageResource(R.drawable.eng411);
            mPlayer = MediaPlayer.create(this, R.raw.a27);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ป");
            choice.add("บ");
            choice.add("พ");
            choice.add("ฟ");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 2) {
            Answer = "น";
            Image.setImageResource(R.drawable.eng404);
            mPlayer = MediaPlayer.create(this, R.raw.a25);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม");
            choice.add("น");
            choice.add("ล");
            choice.add("ก");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 3) {
            Answer = "ง";
            Image.setImageResource(R.drawable.eng405);
            mPlayer = MediaPlayer.create(this, R.raw.a7);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("จ");
            choice.add("ว");
            choice.add("ง");
            choice.add("อ");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 4) {
            Answer = "ม";
            Image.setImageResource(R.drawable.eng416);
            mPlayer = MediaPlayer.create(this, R.raw.a33);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ล");
            choice.add("ย");
            choice.add("ผ");
            choice.add("ม");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 5) {
            Answer = "ช";
            Image.setImageResource(R.drawable.eng417);
            mPlayer = MediaPlayer.create(this, R.raw.a10);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ซ");
            choice.add("ข");
            choice.add("ฃ");
            choice.add("ช");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 6) {
            Answer = "ย";
            Image.setImageResource(R.drawable.lon);
            mPlayer = MediaPlayer.create(this, R.raw.a34);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ฦ");
            choice.add("ย");
            choice.add("ฆ");
            choice.add("ษ");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 7) {
            Answer = "ต";
            Image.setImageResource(R.drawable.pic10);
            mPlayer = MediaPlayer.create(this, R.raw.a21);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ต");
            choice.add("ค");
            choice.add("ฅ");
            choice.add("ฒ");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 8) {
            Answer = "ส";
            Image.setImageResource(R.drawable.eng414);
            mPlayer = MediaPlayer.create(this, R.raw.a40);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ศ");
            choice.add("ษ");
            choice.add("ส");
            choice.add("ฒ");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 9) {
            Answer = "ก";
            Image.setImageResource(R.drawable.eng413);
            mPlayer = MediaPlayer.create(this, R.raw.a1);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ก");
            choice.add("ข");
            choice.add("ค");
            choice.add("ฅ");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 10) {
            Answer = "ล";
            Image.setImageResource(R.drawable.eng409);
            mPlayer = MediaPlayer.create(this, R.raw.a36);
            ArrayList<String> choice = new ArrayList<String>();

            choice.add("ร");
            choice.add("ม");
            choice.add("ว");
            choice.add("ล");
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
