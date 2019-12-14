package com.example.animationtype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation androidZoomInAnimation,androidZoomOutAnimation,androidsideup,androidsidedown,androidsequential,androirotate,androidmove,androidfadeout,androidfadein,androidbounce,androidblink;

    ImageView imageView;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
        b1 =(Button) findViewById(R.id.button);
        b2 =(Button) findViewById(R.id.button2);
        b3 =(Button) findViewById(R.id.button3);
        b4 =(Button) findViewById(R.id.button4);
        b5 =(Button) findViewById(R.id.button5);
        b6 =(Button) findViewById(R.id.button6);
        b7 =(Button) findViewById(R.id.button7);
        b8 =(Button) findViewById(R.id.button8);
        b9 =(Button) findViewById(R.id.button9);
        b10 =(Button) findViewById(R.id.button10);
        b11 =(Button) findViewById(R.id.button11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidZoomInAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_animation);
                imageView.startAnimation(androidZoomInAnimation);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidZoomOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out_animation);
                imageView.startAnimation(androidZoomOutAnimation);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidsideup = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up_animation);
                imageView.startAnimation(androidsideup);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidsidedown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down_animation);
                imageView.startAnimation(androidsidedown);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidsequential = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential_animation);
                imageView.startAnimation(androidsequential);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androirotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
                imageView.startAnimation(androirotate);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidmove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
                imageView.startAnimation(androidmove);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidfadeout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out_animation);
                imageView.startAnimation(androidfadeout);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidfadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in_animation);
                imageView.startAnimation(androidfadein);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidbounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_animation);
                imageView.startAnimation(androidbounce);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidblink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
                imageView.startAnimation(androidblink);
            }
        });




    }
}
