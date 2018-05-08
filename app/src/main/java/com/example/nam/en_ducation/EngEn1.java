package com.example.nam.en_ducation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class EngEn1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_en1);

        ImageView imageView11;
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t11 = new Intent(getApplicationContext(), EngEn01.class);
                startActivity(t11);
            }
        });
        ImageView imageView13;
        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t11 = new Intent(getApplicationContext(), EngEn102.class);
                startActivity(t11);
            }
        });
        ImageView imageView17;
        imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent t11 = new Intent(getApplicationContext(), EngEn1c.class);
                startActivity(t11);
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
