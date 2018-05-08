package com.example.nam.en_ducation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ChooseAnswer extends AppCompatActivity implements View.OnClickListener {
ImageView img_1,img_2,img_3,img_4,img_5,img_6,img_7,img_8,img_9,img_10,img_11;
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
    int ma= R.drawable.num61;
    int mb= R.drawable.num62;
    int mc= R.drawable.num63;
    int md= R.drawable.num64;
    int me= R.drawable.num65;
    int mf= R.drawable.num66;
    int mg= R.drawable.num67;
    int mh= R.drawable.num68;
    int mi= R.drawable.num69;
    int mj= R.drawable.num70;
    int mk= R.drawable.num71;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_answer);

        img_1 = (ImageView) findViewById(R.id.ima_1);
        img_1.setTag(ma);
        img_1.setOnClickListener(this);

        img_2 = (ImageView) findViewById(R.id.ima_2);
        img_2.setTag(mb);
        img_2.setOnClickListener(this);

        img_3 = (ImageView) findViewById(R.id.ima_3);
        img_3.setTag(mc);
        img_3.setOnClickListener(this);

        img_4 = (ImageView) findViewById(R.id.ima_4);
        img_4.setTag(md);
        img_4.setOnClickListener(this);

        img_5 = (ImageView) findViewById(R.id.ima_5);
        img_5.setTag(me);
        img_5.setOnClickListener(this);

        img_6 = (ImageView) findViewById(R.id.ima_6);
        img_6.setTag(mf);
        img_6.setOnClickListener(this);

        img_7 = (ImageView) findViewById(R.id.ima_7);
        img_7.setTag(mg);
        img_7.setOnClickListener(this);

        img_8 = (ImageView) findViewById(R.id.ima_8);
        img_8.setTag(mh);
        img_8.setOnClickListener(this);

        img_9 = (ImageView) findViewById(R.id.ima_9);
        img_9.setTag(mi);
        img_9.setOnClickListener(this);

        img_10 = (ImageView) findViewById(R.id.ima_10);
        img_10.setTag(mj);
        img_10.setOnClickListener(this);

        img_11 = (ImageView) findViewById(R.id.ima_11);
        img_11.setTag(mk);
        img_11.setOnClickListener(this);
    }
@Override
public void onClick(View v){
    Intent intent = new Intent();
    ImageView img =(ImageView)v;
    aa=ma;
    bb=mb;
    cc=mc;

    kk=mk;


    int img_resource_id = Integer.parseInt(img.getTag().toString());
    intent.putExtra("Answer",img_resource_id);
    setResult(1999,intent);
finish();


}
}