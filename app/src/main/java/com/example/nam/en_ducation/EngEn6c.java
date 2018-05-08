package com.example.nam.en_ducation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by nolog on 4/6/2018.
 */

public class EngEn6c extends AppCompatActivity implements View.OnClickListener{

    private TextView wordTv;
    private EditText wordEnteredit;
    private Button validate,newGame;
    private String wordToFind;
    ImageView question;
    private String  mAnswer;
    private Anagram mAnagram  = new Anagram();
    Random r;

    private int mscore =0;
    private int mAnagramsLenght =  mAnagram .mAnagram.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en6c);
        r = new Random();
        wordTv = (TextView) findViewById(R.id.wordTv);
        question= (ImageView) findViewById(R.id.question);
        wordEnteredit = (EditText) findViewById(R.id.wordEnteredit);
        validate = (Button) findViewById(R.id.validate);
        validate.setOnClickListener(this);
        newGame = (Button) findViewById(R.id.newGame);
        newGame.setOnClickListener(this);
        newGame();
    }



    @Override
    public void onClick(View view){
        if (view == validate){
            validate();
        }
        else if (view==newGame){
            newGame();
        }
    }
    private void validate(){
        String w=wordEnteredit.getText().toString();
        if (wordToFind.equals(w)){
            Toast.makeText(this,"ถูกต้อง "+wordToFind,Toast.LENGTH_SHORT).show();
            newGame();
        }
        else {
            Toast.makeText(this,"ลองใหม่อีกครั้ง!!",Toast.LENGTH_SHORT).show();
        }
    }
    private void newGame(){
        wordToFind=Anagram.randomWord();
        updateQuestion(r.nextInt(mAnagramsLenght));;
        String wordShuffled=Anagram.shuffleWord(wordToFind);
        wordTv.setText(wordShuffled);
        wordEnteredit.setText("");
    }

     private void  updateQuestion(int num){
        question.setImageResource(mAnagram.getAnagram(num));


        mAnswer=mAnagram.getWORDS(num);

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
            startActivity(new Intent(this, EngEn6.class));
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

