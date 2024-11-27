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

public class year4 extends AppCompatActivity {
    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top-100, 0, 100);
            view.requestLayout();
        }
    }
    Button arch,crypto,bio,dist,web,wireless;
    ImageButton back;
    boolean v=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year4);
        arch=findViewById(R.id.arch);
        crypto=findViewById(R.id.crypto);
        bio=findViewById(R.id.bio);
        dist=findViewById(R.id.dist);
        web=findViewById(R.id.webtech);
        wireless=findViewById(R.id.wireless);
        back=findViewById(R.id.backfs4);

        int height= this.getResources().getDisplayMetrics().heightPixels;
        setMargins(arch, (int) ceil(height*0.20));
        setMargins(crypto, (int) ceil(height*0.30));
        setMargins(bio, (int) ceil(height*0.40));
        setMargins(dist, (int) ceil(height*0.50));
        setMargins(web, (int) ceil(height*0.60));
        setMargins(wireless, (int) ceil(height*0.70));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;
        if(value){
            arch.setText("معمارية الحاسوب");
            crypto.setText("نظرية التشفير");
            bio.setText("علم الأحياء الحسابي");
            dist.setText("النظم الحاسوبية الموزعة");
            web.setText("تكنولوجيا الشبكة العنكبوتية");
            wireless.setText("الشبكات اللاسلكية");
        }

        arch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1tffHLConxWIQe18U2ZIPJZWCeFjUJCxk?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        crypto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1sm_7pZwGUNoFbRyU2sxIlBwQTZcuILUs?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1V0Ul0wVfktbXX2OcE4PEQ0a-Iomkt12e?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });dist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/130TYGCXxarhCM-73jUw7XMzu1cbdRlo7?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1sPtk-3aXTxwG4chez8zBafBPJzOwLCSs?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        wireless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1oVZUgtJakfLIq21t1uaDs3pT28Stohzr?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(year4.this,years.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(year4.this,years.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}