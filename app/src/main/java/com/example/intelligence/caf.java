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

public class caf extends AppCompatActivity {

    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }
    Button eng,med,sh,st,mall;
    ImageView back;
    boolean v=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caf);
        back=findViewById(R.id.backcaf);
        eng=findViewById(R.id.eng);
        med=findViewById(R.id.med);
        sh=findViewById(R.id.shaks);
        st=findViewById(R.id.st);
        mall=findViewById(R.id.mall);

        int height= this.getResources().getDisplayMetrics().heightPixels;
        setMargins(eng, (int) ceil(height*0.20));
        setMargins(med, (int) ceil(height*0.30));
        setMargins(sh, (int) ceil(height*0.40));
        setMargins(st, (int) ceil(height*0.50));
        setMargins(mall, (int) ceil(height*0.60));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;
        if(value){
            eng.setText("الكفيتيريا الهندسية");
            med.setText("الكفتيريا الطبية");
            sh.setText("كفتيريا الأكشاك");
            st.setText("كفتيريا الملاعب");
            mall.setText("كفتيريا المول");
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(caf.this,location.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/e7rnuc6ESFv65qQH9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/etzcwiBFf2m4W4zC7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/TiwMmfHTZPPPhioE6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/UADJ14MXoAh8U2hi7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/KWXo4yCM7XxZVJD88"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(caf.this,location.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}