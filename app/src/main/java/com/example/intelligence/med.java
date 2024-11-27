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

public class med extends AppCompatActivity {
    private void setMargins (View view ,int right,int top,int left) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(right, top, left, 100);
            view.requestLayout();
        }
    }
    Button PH1,PH2,PH3,PH4,P1,P2,P3,D1,D2,D3,D4,N1,N2,N3,N4,M1,M2,M3,M4,M5,M6;
    ImageButton back;
    boolean v=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med);
        PH1=findViewById(R.id.PH1);
        PH2=findViewById(R.id.PH2);
        PH3=findViewById(R.id.PH3);
        PH4=findViewById(R.id.PH4);
        P1=findViewById(R.id.P1);
        P2=findViewById(R.id.P2);
        P3=findViewById(R.id.P3);
        D1=findViewById(R.id.D1);
        D2=findViewById(R.id.D2);
        D3=findViewById(R.id.D3);
        D4=findViewById(R.id.D4);
        N1=findViewById(R.id.N1);
        N2=findViewById(R.id.N2);
        N3=findViewById(R.id.N3);
        N4=findViewById(R.id.N4);
        M1=findViewById(R.id.M1);
        M2=findViewById(R.id.M2);
        M3=findViewById(R.id.M3);
        M4=findViewById(R.id.M4);
        M5=findViewById(R.id.M5);
        M6=findViewById(R.id.M6);
        back=findViewById(R.id.backmed);

        int height= this.getResources().getDisplayMetrics().heightPixels;
        int width= this.getResources().getDisplayMetrics().widthPixels;

        setMargins(PH1,(int) ceil(width*0.13),(int) ceil(height*0.10),(int) ceil(width*0.10));
        setMargins(PH2,(int) ceil(width*0.38),(int) ceil(height*0.10),(int) ceil(width*0.10));
        setMargins(PH3,(int) ceil(width*0.63),(int) ceil(height*0.10),(int) ceil(width*0.10));

        setMargins(PH4,(int) ceil(width*0.13),(int) ceil(height*0.20),(int) ceil(width*0.10));
        setMargins(P1,(int) ceil(width*0.38),(int) ceil(height*0.20),(int) ceil(width*0.10));
        setMargins(P2,(int) ceil(width*0.63),(int) ceil(height*0.20),(int) ceil(width*0.10));

        setMargins(P3,(int) ceil(width*0.13),(int) ceil(height*0.30),(int) ceil(width*0.10));
        setMargins(D1,(int) ceil(width*0.38),(int) ceil(height*0.30),(int) ceil(width*0.10));
        setMargins(D2,(int) ceil(width*0.63),(int) ceil(height*0.30),(int) ceil(width*0.10));

        setMargins(D3,(int) ceil(width*0.13),(int) ceil(height*0.40),(int) ceil(width*0.10));
        setMargins(D4,(int) ceil(width*0.38),(int) ceil(height*0.40),(int) ceil(width*0.10));
        setMargins(N1,(int) ceil(width*0.63),(int) ceil(height*0.40),(int) ceil(width*0.10));

        setMargins(N2,(int) ceil(width*0.13),(int) ceil(height*0.50),(int) ceil(width*0.10));
        setMargins(N3,(int) ceil(width*0.38),(int) ceil(height*0.50),(int) ceil(width*0.10));
        setMargins(N4,(int) ceil(width*0.63),(int) ceil(height*0.50),(int) ceil(width*0.10));

        setMargins(M1,(int) ceil(width*0.13),(int) ceil(height*0.60),(int) ceil(width*0.10));
        setMargins(M2,(int) ceil(width*0.38),(int) ceil(height*0.60),(int) ceil(width*0.10));
        setMargins(M3,(int) ceil(width*0.63),(int) ceil(height*0.60),(int) ceil(width*0.10));

        setMargins(M4,(int) ceil(width*0.13),(int) ceil(height*0.70),(int) ceil(width*0.10));
        setMargins(M5,(int) ceil(width*0.38),(int) ceil(height*0.70),(int) ceil(width*0.10));
        setMargins(M6,(int) ceil(width*0.63),(int) ceil(height*0.70),(int) ceil(width*0.10));

        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;


        PH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/4f8zPAfYFFd3nbsdA"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        PH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/VSb7yty7P2KJp7eh9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        PH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/vEdyBaKZXBVdwPre8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        PH4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/GR8iSLpWWsNvJDVXA"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/SgxndgHYAbCujG7d6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/Fm6Wd8GfpZETcvoN6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/wrRpozmHb3FTGFvY8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/u4nfZnBnYNZRN4We8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/d9TVtysD6xew2ukQ7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/qHAJGWPu14ZHbHag8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/uTfp5hV5p3dn5WqN8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/zFRT2rLbENVnwKWNA"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/vWWkxH8jNwXR8ZTZ6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        N3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/7sdL99HTSS67xpDQ8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        N4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/5nAUYy5oP8S3E6AW9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/msdESoMkmG8M3xws8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/ppqSuu4WbzMw65jN9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/TT7xGzKjUG4T6Q266"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/Ai9YY25JZDfkoMLcA"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/eEMqS6tkQ2t9nCoGA"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        M6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/8TuNk1HvyBriZZQZ6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(med.this,location.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(med.this,location.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}