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

public class plan extends AppCompatActivity {
    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }
    Button p1,p2,p3,p4;
    ImageView back;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        p3=findViewById(R.id.p3);
        p4=findViewById(R.id.p4);
        //iv=findViewById(R.id.iv1);
        back=findViewById(R.id.backplan);

        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(p1, (int) ceil(height*0.0));
        setMargins(p2, (int) ceil(height*0.1));
        setMargins(p3, (int) ceil(height*0.2));
        setMargins(p4, (int) ceil(height*0.3));

        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        if(value){
            p1.setText("الخطة العربية(علوم الحاسوب)");
            p2.setText("الخطة الإنجليزية(علوم الحاسوب)");
            p3.setText("الخطة العربية(الذكاء الاصطناعي)");
            p4.setText("الخطة الإنجليزية(الذكاء الاصطناعي)");
        }


        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1wDdZ7s15AvTTr6R1GZLsa30m6oTGv6hW/view?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1vy93P2nDSKyefoil3t53uNR-_6SBAZ4J/view?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1veduzCvZluEUcK1P2oEsdNy9QTMF8_JC/view?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/file/d/1yEzEBShc7A2bOx_4nxaVTvGTjSbfWslM/view?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(plan.this, main.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(plan.this, main.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}