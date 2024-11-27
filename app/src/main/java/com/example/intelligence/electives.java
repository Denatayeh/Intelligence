package com.example.intelligence;

import static java.lang.Math.ceil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class electives extends AppCompatActivity {
    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }
   boolean v=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electives);

        Button java,hpc,gfx,python,imagepr,webapp;
        ImageButton bc;

            java=findViewById(R.id.java);
            hpc=findViewById(R.id.hpc);
            gfx=findViewById(R.id.gfx);
            python=findViewById(R.id.py);
            imagepr=findViewById(R.id.imagepr);
            webapp=findViewById(R.id.webapp);
            bc=findViewById(R.id.back);

            int height= this.getResources().getDisplayMetrics().heightPixels;

            setMargins(java, (int) ceil(height*0.20));
            setMargins(hpc, (int) ceil(height*0.30));
            setMargins(gfx, (int) ceil(height*0.40));
            setMargins(python, (int) ceil(height*0.50));
            setMargins(imagepr, (int) ceil(height*0.60));
            setMargins(webapp, (int) ceil(height*0.70));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;
        if(value){
            java.setText("تقنيات برمجة عصرية");
            hpc.setText("الحوسبة عالية الأداء");
            gfx.setText("الرسم بالحاسوب");
            python.setText("موضوعات متقدمة في مهارات البرمجة");
            imagepr.setText("معالجة الصور");
            webapp.setText("تطوير تطبيقات الويب");
        }



        java.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = "https://drive.google.com/drive/folders/1VCQiz1wW1QqouDZe6vQbEkTX1fp_SA_K?usp=drive_link"; // Replace with your desired URL
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                }
            });
            hpc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = "https://drive.google.com/drive/folders/1DKn8WDSRZmqeMcQclKIrsg8aoByILw94?usp=drive_link"; // Replace with your desired URL
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                }
            });
            gfx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = "https://drive.google.com/drive/folders/1XyAcDWyWA3T7-3whpW1D-_iTzeD9Q0c5?usp=drive_link"; // Replace with your desired URL
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                }
            });
            python.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = "https://drive.google.com/drive/folders/1ynA26Kyza579vwncFmAPLd8i2lyRvn1w?usp=drive_link"; // Replace with your desired URL
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                }
            });
        imagepr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/12-Iqop1pt54r3BkystOwlr5qfJiGkxLX?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        webapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1WW62hjaAhTsicuRNfLIelEWJZgHKOFhh?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(electives.this,years.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(electives.this,years.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}