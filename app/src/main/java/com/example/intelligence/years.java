package com.example.intelligence;

import static java.lang.Math.ceil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class years extends AppCompatActivity {
    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top-100, 0, 100);
            view.requestLayout();
        }
    }
    ImageButton y1,y2,y3,y4,elc,bc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years);
        y1=findViewById(R.id.y1);
        y2=findViewById(R.id.y2);
        y3=findViewById(R.id.y3);
        y4=findViewById(R.id.y4);
        elc=findViewById(R.id.elc);
        bc=findViewById(R.id.back2);

        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(y1, (int) ceil(height*0.10));
        setMargins(y2, (int) ceil(height*0.30));
        setMargins(y3, (int) ceil(height*0.50));
        setMargins(y4, (int) ceil(height*0.70));
        setMargins(elc, (int) ceil(height*0.90));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);

        y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(years.this, year1.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(years.this, year2.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(years.this, year3.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        y4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(years.this, year4.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        elc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(years.this,electives.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(years.this, main.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(years.this, main.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}