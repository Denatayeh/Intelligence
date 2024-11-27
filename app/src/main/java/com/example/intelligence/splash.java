package com.example.intelligence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class splash extends AppCompatActivity {
    Handler sp=new Handler();
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img=findViewById(R.id.im);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        img.startAnimation(animation);

        sp.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splash.this, main.class);
                startActivity(i);
                finish();
            }
        },1500);

    }
}