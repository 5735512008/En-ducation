package com.example.nam.en_ducation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class EngEn8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en8);
        ImageView imageView12;
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t12 = new Intent(getApplicationContext(), EngEn08.class);
                startActivity(t12);
            }
        });
        ImageView imageView13;
        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t13 = new Intent(getApplicationContext(), EngEn8a.class);
                startActivity(t13);
            }
        });
        ImageView imageView14;
        imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t14 = new Intent(getApplicationContext(), EngEn8c.class);
                startActivity(t14);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chap1, menu);
        return (super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

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
