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

public class eng extends AppCompatActivity {
    private void setMargins (View view ,int right,int top,int left) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(right, top, left, 100);
            view.requestLayout();
        }
    }
    Button D1,A1,A2,A3,A4,G1,G2,G3,G4,C1,C2,C3,C4,C5,C6,M1,M2,M3,M4,M5,M6,M7,M8,E1,E2,E3,E4,N1,N2,CH1,CH2;
    ImageView back;
    boolean v=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng);
        back=findViewById(R.id.backeng);
        D1=findViewById(R.id.D1);
        A1=findViewById(R.id.A1);
        A2=findViewById(R.id.A2);
        A3=findViewById(R.id.A3);
        A4=findViewById(R.id.A4);
        G1=findViewById(R.id.G1);
        G2=findViewById(R.id.G2);
        G3=findViewById(R.id.G3);
        G4=findViewById(R.id.G4);
        C1=findViewById(R.id.C1);
        C2=findViewById(R.id.C2);
        C3=findViewById(R.id.C3);
        C4=findViewById(R.id.C4);
        C5=findViewById(R.id.C5);
        C6=findViewById(R.id.C6);
        M1=findViewById(R.id.M1);
        M2=findViewById(R.id.M2);
        M3=findViewById(R.id.M3);
        M4=findViewById(R.id.M4);
        M5=findViewById(R.id.M5);
        M6=findViewById(R.id.M6);
        M7=findViewById(R.id.M7);
        M8=findViewById(R.id.M8);
        E1=findViewById(R.id.E1);
        E2=findViewById(R.id.E2);
        E3=findViewById(R.id.E3);
        E4=findViewById(R.id.E4);
        N1=findViewById(R.id.N1);
        N2=findViewById(R.id.N2);
        CH1=findViewById(R.id.CH1);
        CH2=findViewById(R.id.CH2);

        int height= this.getResources().getDisplayMetrics().heightPixels;
        int width= this.getResources().getDisplayMetrics().widthPixels;

        setMargins(D1,(int) ceil(width*0.13),0,(int) ceil(width*0.10));
        setMargins(A1,(int) ceil(width*0.38),0,(int) ceil(width*0.10));
        setMargins(A2,(int) ceil(width*0.63),0,(int) ceil(width*0.10));

        setMargins(A3,(int) ceil(width*0.13),(int) ceil(height*0.10),(int) ceil(width*0.10));
        setMargins(A4,(int) ceil(width*0.38),(int) ceil(height*0.10),(int) ceil(width*0.10));
        setMargins(G1,(int) ceil(width*0.63),(int) ceil(height*0.10),(int) ceil(width*0.10));

        setMargins(G2,(int) ceil(width*0.13),(int) ceil(height*0.20),(int) ceil(width*0.10));
        setMargins(G3,(int) ceil(width*0.38),(int) ceil(height*0.20),(int) ceil(width*0.10));
        setMargins(G4,(int) ceil(width*0.63),(int) ceil(height*0.20),(int) ceil(width*0.10));

        setMargins(C1,(int) ceil(width*0.13),(int) ceil(height*0.30),(int) ceil(width*0.10));
        setMargins(C2,(int) ceil(width*0.38),(int) ceil(height*0.30),(int) ceil(width*0.10));
        setMargins(C3,(int) ceil(width*0.63),(int) ceil(height*0.30),(int) ceil(width*0.10));

        setMargins(C4,(int) ceil(width*0.13),(int) ceil(height*0.40),(int) ceil(width*0.10));
        setMargins(C5,(int) ceil(width*0.38),(int) ceil(height*0.40),(int) ceil(width*0.10));
        setMargins(C6,(int) ceil(width*0.63),(int) ceil(height*0.40),(int) ceil(width*0.10));

        setMargins(M1,(int) ceil(width*0.13),(int) ceil(height*0.50),(int) ceil(width*0.10));
        setMargins(M2,(int) ceil(width*0.38),(int) ceil(height*0.50),(int) ceil(width*0.10));
        setMargins(M3,(int) ceil(width*0.63),(int) ceil(height*0.50),(int) ceil(width*0.10));

        setMargins(M4,(int) ceil(width*0.13),(int) ceil(height*0.60),(int) ceil(width*0.10));
        setMargins(M5,(int) ceil(width*0.38),(int) ceil(height*0.60),(int) ceil(width*0.10));
        setMargins(M6,(int) ceil(width*0.63),(int) ceil(height*0.60),(int) ceil(width*0.10));

        setMargins(M7,(int) ceil(width*0.13),(int) ceil(height*0.70),(int) ceil(width*0.10));
        setMargins(M8,(int) ceil(width*0.38),(int) ceil(height*0.70),(int) ceil(width*0.10));
        setMargins(E1,(int) ceil(width*0.63),(int) ceil(height*0.70),(int) ceil(width*0.10));

        setMargins(E2,(int) ceil(width*0.13),(int) ceil(height*0.80),(int) ceil(width*0.10));
        setMargins(E3,(int) ceil(width*0.38),(int) ceil(height*0.80),(int) ceil(width*0.10));
        setMargins(E4,(int) ceil(width*0.63),(int) ceil(height*0.80),(int) ceil(width*0.10));

        setMargins(N1,(int) ceil(width*0.13),(int) ceil(height*0.90),(int) ceil(width*0.10));
        setMargins(N2,(int) ceil(width*0.38),(int) ceil(height*0.90),(int) ceil(width*0.10));
        setMargins(CH1,(int) ceil(width*0.63),(int) ceil(height*0.90),(int) ceil(width*0.10));

        setMargins(CH2,(int) ceil(width*0.38),height,(int) ceil(width*0.10));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(eng.this,location.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=17058453924250634382&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=15145840705601750824&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/ZDsoNDHebX7AjMa3A"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?q=32.494055,35.988263&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?q=32.494199,35.987896&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/6MjoJzo21SvVmLnm6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/koNzZwACdiWFdLdG7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?q=32.493579,35.987963&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/gFbb3L755YzXNP8E6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/95b9MguAzu3VFAQ56"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/VyB5DCjZ5H6aKLCKA"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?q=32.493348,35.987630&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/Z6wQYX4fWfZcZGZR7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/rV6D3npyDaWXKNFT8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?q=32.492807,35.987407&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/wSks762ifukavEpE9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/tfdtgNtYjydrhExq6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/4QcSeNxLzsyDJx9r9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?q=32.492651,35.986560&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/BteZaBkWhjRhfRvH6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=5316797940194256374&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=12307237390240049947&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/535S5igLysQGHMoTA"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=9357501574978170497&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=6602657864979428168&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/z8vrBfMJniBF6Hs47"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/KftmJ3JjVvu9NNHb8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?q=32.490794,35.987002&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=6982239602012276862&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        CH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=16319359804497827300&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        CH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.google.com/?cid=15116291658657103810&entry=gps"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(eng.this,location.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}