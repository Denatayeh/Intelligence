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

public class year3 extends AppCompatActivity {
    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top-100, 0, 100);
            view.requestLayout();
        }
    }
    Button hci,dlab,orga,net,swe,ai,os,sys,multi;;
    ImageButton back;
    boolean v=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year3);
        hci=findViewById(R.id.hci);
        dlab=findViewById(R.id.dlab);
        orga=findViewById(R.id.orga);
        net=findViewById(R.id.net);
        swe=findViewById(R.id.swe);
        ai=findViewById(R.id.ai);
        os=findViewById(R.id.os);
        sys=findViewById(R.id.sys);
        multi=findViewById(R.id.multi);
        back=findViewById(R.id.backfs3);

        int height= this.getResources().getDisplayMetrics().heightPixels;
        setMargins(hci, (int) ceil(height*0.10));
        setMargins(dlab, (int) ceil(height*0.20));
        setMargins(orga, (int) ceil(height*0.30));
        setMargins(net, (int) ceil(height*0.40));
        setMargins(swe, (int) ceil(height*0.50));
        setMargins(ai, (int) ceil(height*0.60));
        setMargins(os, (int) ceil(height*0.70));
        setMargins(sys, (int) ceil(height*0.80));
        setMargins(multi, (int) ceil(height*0.90));

        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;
        if(value){
            hci.setText("تفاعل الإنسان و الحاسوب");
            dlab.setText("مختبر تصميم المنطق الرقمي");
            orga.setText("تصميم و تنظيم الحاسوب");
            net.setText("شبكات الحاسوب");
            swe.setText("اساسيات هندسة البرمجيات");
            ai.setText("الذكاء الإصطناعي");
            os.setText("مبادئ نظم التشغيل الحديثة");
            sys.setText("تحليل و تصميم الأنظمة");
            multi.setText("اساسيات الوسائط المتعددة");
        }

        hci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/12FfgOAW_whggq47C8dAypC0DJEeCOA9h?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        dlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1jIb01lnd0eJ9d16Si6dXLqKBwFn7x4Ew?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        orga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/17wBw-A7Mpc2p0Zz_JrEwApcIQLrzOWOn?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1KMga8-rVgzllm3UiZv1AWZwVnQeIIdXn?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        swe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1bPuuA0ldGGPMOPKVIIk2SH_1ImkwFPSd?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1qMQ8Dy_-9PaWR-MRBf5R5JfCI34GuYo-?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1OcfQx5Jjz6ih2r3KMnLMLJ8YKgCB_IFo?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        sys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1xVopVMxKTMb2rU6ptvOAOSuDC84HBrKE?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1D81RXKxv3TSVSttskeMZ09Jcnx2Joqbk?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(year3.this,years.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(year3.this,years.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}