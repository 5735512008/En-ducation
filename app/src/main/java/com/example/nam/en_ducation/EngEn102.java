package com.example.nam.en_ducation;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;




public class EngEn102 extends AppCompatActivity {
    MediaPlayer sound;
    Button choose1, choose2,choose3,choose4;
    TextView score;
    ImageView question;
    private Question mQuestion = new Question();
    private String  mAnswer;
    private int mscore =0;
    private int mQuestionsLenght = mQuestion.mQuestion.length;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en102);
        r = new Random();




        choose1 = (Button) findViewById(R.id.choose1);
        choose2 = (Button) findViewById(R.id.choose2);
        choose3 = (Button) findViewById(R.id.choose3);
        choose4 = (Button)findViewById(R.id.choose4);

        score = (TextView) findViewById(R.id.score);
        question= (ImageView) findViewById(R.id.question);

        score.setText("Score:"+mscore);
        updateQuestion(r.nextInt(mQuestionsLenght));
        choose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose1.getText()==mAnswer){
                    Toast.makeText(EngEn102.this,"ถูกต้อง",Toast.LENGTH_LONG).show();
                    mscore++;
                    score.setText("Score:"+mscore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                    if (mscore==15) {
                        Toast.makeText(EngEn102.this, "จบเกม", Toast.LENGTH_LONG).show();
                        gameOver();
                    }


                }else{
                    Toast.makeText(EngEn102.this,"ผิด",Toast.LENGTH_LONG).show();
                    gameOver();
                }
            }

        });
        choose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose2.getText()==mAnswer){
                    Toast.makeText(EngEn102.this,"ถูกต้อง",Toast.LENGTH_LONG).show();
                    mscore++;
                    score.setText("Score:"+mscore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                    if (mscore==15) {
                        Toast.makeText(EngEn102.this, "จบเกม", Toast.LENGTH_LONG).show();
                        gameOver();
                    }


                }else{
                    Toast.makeText(EngEn102.this,"ผิด",Toast.LENGTH_LONG).show();
                    gameOver();
                }
            }

        });
        choose3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose3.getText()==mAnswer){
                    Toast.makeText(EngEn102.this,"ถูกต้อง",Toast.LENGTH_LONG).show();
                    mscore++;
                    score.setText("Score:"+mscore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                    if (mscore==15) {
                        Toast.makeText(EngEn102.this, "จบเกม", Toast.LENGTH_LONG).show();
                        gameOver();
                    }


                }else{
                    Toast.makeText(EngEn102.this,"ผิด",Toast.LENGTH_LONG).show();
                    gameOver();
                }
            }

        });
        choose4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose4.getText()==mAnswer){
                    Toast.makeText(EngEn102.this,"ถูกต้อง",Toast.LENGTH_LONG).show();
                    mscore++;
                    score.setText("Score:"+mscore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                    if (mscore==15) {
                        Toast.makeText(EngEn102.this, "จบเกม", Toast.LENGTH_LONG).show();
                        gameOver();
                    }


                }else {
                    Toast.makeText(EngEn102.this, "ผิด", Toast.LENGTH_LONG).show();
                    gameOver();
                }
            }
        });
    }
    private  void  updateQuestion(int num){
        question.setImageResource(mQuestion.getQuestion(num));
        choose1.setText(mQuestion.getChoice1(num));
        choose2.setText(mQuestion.getChoice2(num));
        choose3.setText(mQuestion.getChoice3(num));
        choose4.setText(mQuestion.getChoice4(num));
        mAnswer=mQuestion.getCorrectAnswer(num);
    }


    private void gameOver(){
        AlertDialog.Builder Showscore = new AlertDialog.Builder(this);
        Showscore.setTitle("จบเกม ");
        Showscore.setIcon(R.drawable.logo);
        Showscore.setMessage("คะแนนของคุณ"+ mscore+"คะแนน")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener(){
                            @Override
                            public  void onClick(DialogInterface dialogInterface,int i){
                                startActivity(new Intent(getApplicationContext(),EngEn102.class));
                                finish();
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener(){
                            @Override
                            public  void onClick(DialogInterface dialogInterface,int i){
                                finish();
                            }
                        });
        AlertDialog alertDialog = Showscore.create();
        alertDialog.show();;
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
            startActivity(new Intent(this, EngEn1.class));
            return true;
        }
        if (id == R.id.home){
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed() {
        startActivity(new Intent(this, EngEn1.class));
    }

}