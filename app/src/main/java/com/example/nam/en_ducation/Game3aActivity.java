package com.example.nam.en_ducation;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Game3aActivity extends AppCompatActivity {
    ImageView drag, drag2, drag3;
    ImageView drop, drop1;

    private String msg = "debug";
    private int score = 0;
    private String strscore, strReceiveScore;
    private Context activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3a);
        final MediaPlayer correct = MediaPlayer.create(this, R.raw.correct);
        final MediaPlayer wrong = MediaPlayer.create(this, R.raw.wrong);
        strReceiveScore = getIntent().getStringExtra("score");
        score = Integer.parseInt(strReceiveScore);
        drag = (ImageView) findViewById(R.id.drag1);
        drag2 = (ImageView) findViewById(R.id.drag2);
        drag3 = (ImageView) findViewById(R.id.drag3);
        drop = (ImageView) findViewById(R.id.drop4);
        drop1 = (ImageView) findViewById(R.id.imageView15);
        drop1.setVisibility(View.INVISIBLE);
        drag.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData.Item item = new ClipData.Item((CharSequence) v.getTag());
                String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};

                ClipData dragData = new ClipData(v.getTag().toString(), mimeTypes, item);
                View.DragShadowBuilder myShadow = new View.DragShadowBuilder(drag);

                v.startDrag(dragData, myShadow, null, 0);
                return true;
            }
        });

        drag2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData.Item item = new ClipData.Item((CharSequence) v.getTag());
                String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};

                ClipData dragData = new ClipData(v.getTag().toString(), mimeTypes, item);
                View.DragShadowBuilder myShadow = new View.DragShadowBuilder(drag2);

                v.startDrag(dragData, myShadow, null, 0);
                return true;
            }
        });
        drag3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData.Item item = new ClipData.Item((CharSequence) v.getTag());
                String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};

                ClipData dragData = new ClipData(v.getTag().toString(), mimeTypes, item);
                View.DragShadowBuilder myShadow = new View.DragShadowBuilder(drag3);

                v.startDrag(dragData, myShadow, null, 0);
                return true;
            }
        });

        drop.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                switch (event.getAction()) {
                    case DragEvent.ACTION_DROP:
                        Log.d(msg, "ACTION_DROP event " + event.getClipData().getItemAt(0).getText());
                        int itemId = Integer.parseInt((String) event.getClipData().getItemAt(0).getText());
                        if (itemId == R.id.drag1) {
                            correct.start();
                            score++;
                            delay1();
                            Toast.makeText(getApplicationContext(), "ถูกต้อง", Toast.LENGTH_LONG).show();
                            float gx = drop.getX();
                            float gy = drop.getY();
                            drag.setX(gx);
                            drag.setY(gy);
                        } else if ((itemId == R.id.drag2)) {
                            wrong.start();
                            Change();
                            Toast.makeText(getApplicationContext(), "ผิด", Toast.LENGTH_LONG).show();
                            float gx = drop.getX();
                            float gy = drop.getY();
                            drag2.setX(gx);
                            drag2.setY(gy);

                        } else if ((itemId == R.id.drag3)) {
                            wrong.start();
                            Change1();
                            Toast.makeText(getApplicationContext(), "ผิด", Toast.LENGTH_LONG).show();
                            float gx = drop.getX();
                            float gy = drop.getY();
                            drag3.setX(gx);
                            drag3.setY(gy);

                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        drag.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("id", "" + drag.getId());
                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(drag);

                    drag.startDrag(data, shadowBuilder, drag, 0);

                    return true;
                } else {
                    return false;
                }
            }
        });
        drag2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("id", "" + drag2.getId());
                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(drag2);

                    drag2.startDrag(data, shadowBuilder, drag2, 0);

                    return true;
                } else {
                    return false;
                }
            }
        });
        drag3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("id", "" + drag3.getId());
                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(drag3);

                    drag3.startDrag(data, shadowBuilder, drag3, 0);
//                    red.setVisibility(View.INVISIBLE);
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    private void delay1() {
        android.os.Handler myhandler = new android.os.Handler();
        myhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                drag2.setImageResource(R.drawable.dropf2);
                drag3.setImageResource(R.drawable.dropf2a);
                delay();
            }
        }, 1000);
    }

    private void Change1() {
        android.os.Handler myhandler = new android.os.Handler();
        myhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                drag.setVisibility(View.INVISIBLE);
                drag2.setVisibility(View.INVISIBLE);
                drag3.setVisibility(View.INVISIBLE);
                drop1.setVisibility(View.VISIBLE);
                drop.setImageResource(R.drawable.dropf2a);
                delay();
            }
        }, 1000);

    }

    private void Change() {
        android.os.Handler myhandler = new android.os.Handler();
        myhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                drag.setVisibility(View.INVISIBLE);
                drag2.setVisibility(View.INVISIBLE);
                drag3.setVisibility(View.INVISIBLE);
                drop1.setVisibility(View.VISIBLE);
                drop.setImageResource(R.drawable.dropf2);
                delay();
            }
        }, 1000);
    }

    private void delay() {
        android.os.Handler myhandler = new android.os.Handler();
        myhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent nextquest = new Intent(getApplicationContext(), Game3bActivity.class);
                strscore = Integer.toString(score);
                nextquest.putExtra("score", strscore);
                startActivity(nextquest);

            }
        }, 3000);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game1, menu);
        return (super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.exit){
            startActivity(new Intent(this, Thai4Activity.class));
            return true;
        }
        if (id == R.id.home){
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed() {
        startActivity(new Intent(this, Thai4Activity.class));
    }

}