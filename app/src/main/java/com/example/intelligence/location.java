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

public class location extends AppCompatActivity {

    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }
    Button eng,med,hall,dean,caf,amp,lab,oth;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        eng=findViewById(R.id.eng);
        med=findViewById(R.id.med);
        hall=findViewById(R.id.hall);
        dean=findViewById(R.id.dean);
        caf=findViewById(R.id.caf);
        amp=findViewById(R.id.amp);
        back=findViewById(R.id.backloc);
        lab=findViewById(R.id.labs);
        oth=findViewById(R.id.oth);
        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(eng, (int) ceil(height*0.0));
        setMargins(med, (int) ceil(height*0.1));
        setMargins(hall, (int) ceil(height*0.2));
        setMargins(dean, (int) ceil(height*0.3));
        setMargins(caf, (int) ceil(height*0.4));
        setMargins(amp, (int) ceil(height*0.5));
        setMargins(lab, (int) ceil(height*0.6));
        setMargins(oth, (int) ceil(height*0.7));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        if(value){
            eng.setText("المباني الهندسية");
            med.setText("المباني الطبية");
            hall.setText("مجمع القاعات التدريسية");
            dean.setText("عمادة شؤون الطلبة(SA1)");
            caf.setText("الكافيتيريات");
            amp.setText("المدرجات");
            lab.setText("المختبرات");
            oth.setText("غيرها");
        }

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(location.this,eng.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(location.this,med.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/ZonFYikmSgfvGLV6A"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        dean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/a8jfHgWwNRhofB6j8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        caf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(location.this,caf.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        amp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(location.this,amp.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(location.this,labs.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        oth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(location.this,others.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(location.this, main.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(location.this, main.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}