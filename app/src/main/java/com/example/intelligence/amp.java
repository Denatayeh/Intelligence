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

public class amp extends AppCompatActivity {
    private void setMargins (View view, int top) {
    if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
        ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        p.setMargins(0, top, 0, 100);
        view.requestLayout();
    }
}
    Button salah,farouk,faraby,ibn,sc,sa,nu,alk,m;
    ImageView back;
    boolean v=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amp);
        back=findViewById(R.id.backamp);
        salah=findViewById(R.id.sd);
        farouk=findViewById(R.id.alfarouk);
        faraby=findViewById(R.id.alfarabi);
        ibn=findViewById(R.id.is);
        sc=findViewById(R.id.sh);
        sa=findViewById(R.id.saed);
        nu=findViewById(R.id.n);
        alk=findViewById(R.id.alkarama);
        m=findViewById(R.id.m);
        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(salah, (int) ceil(0));
        setMargins(farouk, (int) ceil(height*0.10));
        setMargins(alk, (int) ceil(height*0.20));
        setMargins(faraby, (int) ceil(height*0.30));
        setMargins(ibn, (int) ceil(height*0.40));
        setMargins(sc, (int) ceil(height*0.50));
        setMargins(sa, (int) ceil(height*0.60));
        setMargins(nu, (int) ceil(height*0.70));
        setMargins(m,(int)ceil(height*0.80));

        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;
        if(value){
            salah.setText("مدرج صلاح الدين");
            farouk.setText("مدرج الفاروق");
            alk.setText("مدرج الكرامة");
            faraby.setText("مدرج الفارابي");
            ibn.setText("مدرج ابن سينا");
            sc.setText("مدرج عرار(العلوم 1)");
            sa.setText("مدرج سعد حجازي(العلوم 2)");
            nu.setText("مدرج التمريض");
            m.setText("المدرج الطبي");

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(amp.this,location.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        salah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/hcnT7cA4b1gQeCD5A"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        farouk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/8S7PN66SGJ3NdN589"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        faraby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/8deKFoUPzGfVotA47"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        ibn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/oi9K9E6ZFRVYDQDY9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/6ZQdM7jakLpMXjUQ8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/uVmzptN3TFiaVwHW7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        nu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/K93kSoDLPoZAWB497"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        alk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/gPKz2fDXT7UkMYqo7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/YdfZdgXu5CTsjDAc7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(amp.this,location.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}