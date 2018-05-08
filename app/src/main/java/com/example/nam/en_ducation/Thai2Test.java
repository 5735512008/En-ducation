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

public class Thai2Test extends AppCompatActivity {
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
        setContentView(R.layout.thai2_test);

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
            Answer = "-ะ";
           // Image.setImageResource(R.drawable.eng411);
            mPlayer = MediaPlayer.create(this, R.raw.s1);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("-ะ");
            choice.add("-า");
            choice.add("-ิ");
            choice.add("-ุ");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 2) {
            Answer = "-ุ";
           // Image.setImageResource(R.drawable.eng404);
            mPlayer = MediaPlayer.create(this,  R.raw.s7);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("-ู");
            choice.add("-ุ");
            choice.add("-ื");
            choice.add("-ี");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 3) {
            Answer = "แ-";
          //  Image.setImageResource(R.drawable.eng405);
            mPlayer = MediaPlayer.create(this,  R.raw.s12);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("เ-");
            choice.add("เ-ะ");
            choice.add("แ-");
            choice.add("แ-ะ");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 4) {
            Answer = "โ-";
           // Image.setImageResource(R.drawable.eng416);
            mPlayer = MediaPlayer.create(this,  R.raw.s14);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("โ-ะ");
            choice.add("เ-า");
            choice.add("โ-");
            choice.add("ไ-");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 5) {
            Answer = "เ-า";
           // Image.setImageResource(R.drawable.eng417);
            mPlayer = MediaPlayer.create(this, R.raw.s28);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("เ-า");
            choice.add("เ-");
            choice.add("-อ");
            choice.add("-ำ");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
        }
        if (IDchoice == 6) {
            Answer = "-ิ";
           // Image.setImageResource(R.drawable.quest);
            mPlayer = MediaPlayer.create(this, R.raw.s3);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("-ื");
            choice.add("-ิ");
            choice.add("-ึ");
            choice.add("-ี");
            Collections.shuffle(choice);
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 7) {
            Answer = "เ-ีย";
           // Image.setImageResource(R.drawable.quest);
            mPlayer = MediaPlayer.create(this, R.raw.s20);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("เ-ีย");
            choice.add("เ-ียะ");
            choice.add("เ-ือะ");
            choice.add("เ-ือ");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 8) {
            Answer = "-ำ";
           // Image.setImageResource(R.drawable.quest);
            mPlayer = MediaPlayer.create(this, R.raw.s25);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("-า");
            choice.add("-อ");
            choice.add("-ำ");
            choice.add("-ัวะ");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 9) {
            Answer = "ไ-";
           // Image.setImageResource(R.drawable.quest);
            mPlayer = MediaPlayer.create(this,R.raw.s27);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ไ-");
            choice.add("ใ-");
            choice.add("โ-");
            choice.add("เ-");
            Collections.shuffle(choice);

            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));

        }
        if (IDchoice == 10) {
            Answer = "-า";
          //  Image.setImageResource(R.drawable.quest);
            mPlayer = MediaPlayer.create(this, R.raw.s2);
            ArrayList<String> choice = new ArrayList<String>();

            choice.add("แ-");
            choice.add("เ-า");
            choice.add("-อ");
            choice.add("-า");
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
            startActivity(new Intent(this, Thai2Activity.class));
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
