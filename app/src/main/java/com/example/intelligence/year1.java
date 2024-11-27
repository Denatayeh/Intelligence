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

public class year1 extends AppCompatActivity {

    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }
    Button cpp,it,calc,ph,oop,dis,calc2,phl,python;
    ImageView back;
    boolean v=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1);
        cpp=findViewById(R.id.cpp);
        it=findViewById(R.id.intro);
        calc=findViewById(R.id.calc1);
        ph=findViewById(R.id.phy);
        back=findViewById(R.id.back);
        oop=findViewById(R.id.oop);
        calc2=findViewById(R.id.calc2);
        dis=findViewById(R.id.disc);
        phl=findViewById(R.id.phylab);
        python=findViewById(R.id.python);



        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(cpp, (int) ceil(height*0.0));
        setMargins(it, (int) ceil(height*0.10));
        setMargins(calc, (int) ceil(height*0.20));
        setMargins(ph, (int) ceil(height*0.30));
        setMargins(oop, (int) ceil(height*0.40));
        setMargins(calc2, (int) ceil(height*0.50));
        setMargins(dis, (int) ceil(height*0.60));
        setMargins(phl, (int) ceil(height*0.70));
        setMargins(python, (int) ceil(height*0.80));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;
        if(value){
            cpp.setText("مقدمة في البرمجة");
            it.setText("مقدمة في تكنولوجيا المعلومات");
            calc.setText("تفاضل و تكامل 1");
            oop.setText("مقدمة في البرمجة الكينونية");
            calc2.setText("تفاضل و تكامل 2");
            dis.setText("الرياضيات المتقطعة");
            phl.setText("فيزياء عملي 2");
            ph.setText("فيزياء عامة 2");
            python.setText("برمجة الذكاء الاصطناعي");

        }

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1KbuZt-yGK9r1ZWt3yLHDsIECuzP_wWEj?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/16BZlxbum-DmuACJfivz-0tzApiziZJAH?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/15scwnOOazDX8wTox14Nj97yBLKrHjWXB?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/11eoz5CD1LVPZhvFjf3UTT2atYJH1Nb6j?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1ZSeWxEcTZx_1fX-t7KoQty8zaC3BpbLX?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1kIGU9qJCdAjk2uECaYancx6nZvR7dHBU?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        calc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/17QQ9A5qye1KFNh8TQcHxVVA8Ofn6EqDu?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        phl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1VxMotiZfQCuh9lYSuSuntACjiw2bWd9G?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1z9gmR9S350XBRL_NF0DwEaN1zYoBGlco?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(year1.this,years.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(year1.this,years.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}