package com.example.nam.en_ducation;

import android.content.Intent;
import android.media.MediaPlayer;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class EngEn4c extends AppCompatActivity implements View.OnClickListener{

    ImageView Image;
    int guestionCount = 11;
    ArrayList<Integer> IDchoice = new ArrayList<Integer>();
    MediaPlayer correct,wrong;
    private TextView wordTv;
    private EditText wordEnteredit;
    private Button validate,newGame;
    private String wordToFind;
    ImageView question;
    Random r;
    public static final Random RANDOM=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en6b);
        Image = (ImageView) findViewById(R.id.imageView);
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
    private void setQuestion(int IDchoice) {
        if (IDchoice == 1) {
            Image.setImageResource(R.drawable.num61);
            wordToFind=WORDS[0];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");
        }
        if (IDchoice == 2) {
            Image.setImageResource(R.drawable.num62);
            wordToFind=WORDS[1];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");
        }
        if (IDchoice == 3) {
            Image.setImageResource(R.drawable.num63);
            wordToFind=WORDS[2];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");
        }
        if (IDchoice == 4) {
            Image.setImageResource(R.drawable.num64);
            wordToFind=WORDS[3];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");
        }
        if (IDchoice == 5) {
            Image.setImageResource(R.drawable.num65);
            wordToFind=WORDS[4];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");}
        if (IDchoice == 6) {
            Image.setImageResource(R.drawable.num66);
            wordToFind=WORDS[5];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");
        }
        if (IDchoice == 7) {
            Image.setImageResource(R.drawable.num67);
            wordToFind=WORDS[6];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");}
        if (IDchoice == 8) {
            Image.setImageResource(R.drawable.num68);
            wordToFind=WORDS[7];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");
        }
        if (IDchoice == 9) {

            Image.setImageResource(R.drawable.num69);
            wordToFind=WORDS[8];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");}
        if (IDchoice == 10) {
            Image.setImageResource(R.drawable.num70);
            wordToFind=WORDS[9];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");
        }
        if (IDchoice == 11) {
            Image.setImageResource(R.drawable.num71);
            wordToFind=WORDS[10];
            String wordShuffled=shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredit.setText("");
        }

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
       wordEnteredit.setText("");
       for (int i = 1; i <= guestionCount; i++)
            IDchoice.add(i);
        Collections.shuffle(IDchoice);
     setQuestion(IDchoice.remove(0));
    }
    public static final String[] WORDS ={"YELLOW","PURPLE","RED","ORANGE","WHITE",
            "BLUE","GREEN","GRAY","BLACK","BROWN","PINK"};

     /*   public static String randomWord(){
            return WORDS[RANDOM.nextInt(WORDS.length)];
        }
        */
        public static String shuffleWord(String word){
            if (word !=null && !"".equals(word)){
            char a[] = word.toCharArray();
            for (int i=0;i<a.length;i++){
                int j = RANDOM.nextInt(a.length);
                char tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
            }
            return new String(a);
        }
        return word;
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
