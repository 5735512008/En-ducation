package com.example.nam.en_ducation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class EngEn5c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en5c);

        ImageView eng1;
        eng1 = (ImageView) findViewById(R.id.eng1);
        eng1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t11 = new Intent(getApplicationContext(), Hard5Mode.class);
                startActivity(t11);
            }
        });
        ImageView eng2;
        eng2 = (ImageView) findViewById(R.id.eng2);
        eng2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t12 = new Intent(getApplicationContext(), Hard1Mode.class);
                startActivity(t12);
            }
        });
        ImageView eng3;
        eng3 = (ImageView) findViewById(R.id.eng3);
        eng3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t13 = new Intent(getApplicationContext(), Hard2Mode.class);
                startActivity(t13);
            }
        });
        ImageView eng4;
        eng4 = (ImageView) findViewById(R.id.eng4);
        eng4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t14 = new Intent(getApplicationContext(), Hard6Mode.class);
                startActivity(t14);
            }
        });
        ImageView eng5;
        eng5 = (ImageView) findViewById(R.id.eng5);
        eng5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t15 = new Intent(getApplicationContext(), Hard3Mode.class);
                startActivity(t15);
            }
        });
        ImageView eng6;
        eng6= (ImageView) findViewById(R.id.eng6);
        eng6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t16 = new Intent(getApplicationContext(), Hard4Mode.class);
                startActivity(t16);
            }
        });
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

        if (id == R.id.back){
            startActivity(new Intent(this, EngEn5.class));
            return true;
        }

        if (id == R.id.home){
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed() {
        startActivity(new Intent(this, EnglishActivity.class));
    }

}
