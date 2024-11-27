package com.example.intelligence;

import static java.lang.Math.ceil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class others extends AppCompatActivity {
    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }
    Button lib,yard,lake,gym,fin,pres;
    ImageView back;
    ImageView iv;
    boolean v=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        lake=findViewById(R.id.lake);
        yard=findViewById(R.id.yard);
        lib=findViewById(R.id.lib);
        gym=findViewById(R.id.gym);
        fin=findViewById(R.id.fin);
        pres=findViewById(R.id.pres);
        back=findViewById(R.id.backplan);

        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(lib, (int) ceil(height*0.0));
        setMargins(lake, (int) ceil(height*0.1));
        setMargins(yard, (int) ceil(height*0.2));
        setMargins(gym, (int) ceil(height*0.3));
        setMargins(fin, (int) ceil(height*0.4));
        setMargins(pres, (int) ceil(height*0.5));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;
        if(value){
            lib.setText("المكتبة");
            lake.setText("البحيرة");
            yard.setText("الملعب");
            gym.setText("النادي الرياضي");
            fin.setText("الشؤون المالية");
            pres.setText("رئاسة الجامعة");
        }


        lake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/4qwJxUt22e65pvB68"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/iTUb4Lra6e6hqPNy9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        yard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/X719RW7fGhnT5Cpe8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/UyTYJoBJPBTYq2Zc7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/heigNRmKyPu48Ukp7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        pres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/236VZ5Hr3R7NZug8A"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(others.this,location.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(others.this,location.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}