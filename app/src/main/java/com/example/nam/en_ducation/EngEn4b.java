package com.example.nam.en_ducation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Random;

/**
 * Created by nolog on 2/18/2018.
 */

public class EngEn4b extends AppCompatActivity {
    ImageView img_question,img_answer;
    int aa= R.drawable.color01;
    int bb= R.drawable.color02;
    int cc= R.drawable.color03;
    int dd= R.drawable.color04;
    int ee= R.drawable.color05;
    int ff= R.drawable.color06;
    int gg= R.drawable.color07;
    int hh= R.drawable.color08;
    int ii= R.drawable.color09;
    int jj= R.drawable.color010;
    int kk= R.drawable.color011;



    int array_images[] =new int[]{
            aa, bb, cc, dd, ee, ff, gg,hh, ii, jj, kk,

    };
    int  correct_answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en4b);
        img_question=(ImageView)findViewById(R.id.img_question);
        Button btn_answer;
        btn_answer=(Button) findViewById(R.id.btn_answer);
        btn_answer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChooseAnswer.class);
                startActivityForResult(intent,1999);
            }
        });
        randomImage();
    }



    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1999)
        {
            int answer_resource_id=data.getIntExtra("Answer",0);
            img_answer=(ImageView)findViewById(R.id.img_answer);
            img_answer.setImageResource(answer_resource_id);


            if (answer_resource_id==correct_answer)
            {
                Toast.makeText(this, "Good job", Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.memu_memory, menu);
              return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_re_new:
                randomImage();
                img_answer=(ImageView) findViewById(R.id.img_answer);
                img_answer.setImageResource(R.drawable.num);
                            break;
        }return true;

    }
    public void randomImage() {
        int img_resouse =array_images[new Random().nextInt(11)];
        img_question.setImageResource(img_resouse);
         correct_answer = img_resouse;

    }

}

