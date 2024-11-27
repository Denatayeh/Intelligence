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

public class year2 extends AppCompatActivity {

    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }

    Button web,uml,data,lin,dig,algo,db,pb,th,eth,dai,introai,ml;
    ImageView back;
    boolean v=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year2);
        web=findViewById(R.id.web);
        uml=findViewById(R.id.uml);
        data=findViewById(R.id.data);
        lin=findViewById(R.id.lin);
        back=findViewById(R.id.backfs2);
        dig=findViewById(R.id.dig1);
        algo=findViewById(R.id.algo1);
        db=findViewById(R.id.db1);
        pb=findViewById(R.id.pb1);
        th=findViewById(R.id.th1);
        eth=findViewById(R.id.ethics);
        dai=findViewById(R.id.dai);
        introai=findViewById(R.id.introai);
        ml=findViewById(R.id.ml);
        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(web, (int) ceil(height*0.05));
        setMargins(uml, (int) ceil(height*0.15));
        setMargins(data, (int) ceil(height*0.25));
        setMargins(lin, (int) ceil(height*0.35));
        setMargins(dig, (int) ceil(height*0.45));
        setMargins(algo, (int) ceil(height*0.55));
        setMargins(db, (int) ceil(height*0.65));
        setMargins(pb, (int) ceil(height*0.75));
        setMargins(th, (int) ceil(height*0.85));
        setMargins(eth, (int) ceil(height*0.95));
        setMargins(dai, (int) ceil(height*1.05));
        setMargins(introai, (int) ceil(height*1.15));
        setMargins(ml, (int) ceil(height*1.25));

        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;
        if(value){
            web.setText("مقدمة في تصميم صفحات الويب");
            uml.setText("مختبر نمذجة البرمجة كينونية التوجه");
            data.setText("تراكيب البيانات");
            lin.setText("مبادئ الجبر الخطي");
            dig.setText("تصميم المنطق الرقمي");
            algo.setText("تحليل و تصميم الخوارزميات");
            db.setText("أساسيات قواعد البيانات");
            pb.setText("إحصاء و إحتمالات");
            th.setText("نظرية الحسابات");
            eth.setText("مهارات الإتصال و أخلاقيات المهنة");
            dai.setText("تصميم المنطق الرقمي و تنظيم الحاسوب");
            introai.setText("مقدمة في الذكاء الاصطناعي");
            ml.setText("تعلُّم الآلة");
        }
        eth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1gLN7jGjoNl3wEAyH7qYcDCtU7I8b_MNV?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1hgokIu4RPDKr38CU-XA2KMTLg3MoT25T?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        uml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1pCiePFEGwrkilKDttGMoDgt_I9GanSg_?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1_ADDoRuPAySIAGmaGQGLQ3d2PGm-lJuf?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/10a224tIueHAu4cu5UhC48H0j2rD7fL2F?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(year2.this,years.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });
        dig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1-iTEU8iYJH66_-GKLrMNuvyuxc9XmQr6?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/184To1kVsgrTgwRmycPfLzgDc5Pk52tFw?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1ZOB8Pbsn8WwoDMXCod4PnEmX0ADieoUM?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1q3cPJ_dGwQz1Pc4cFSmhaK7Xe0A3tbLo?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1vVFTGnLD_0uzN4ETQchGzOs-MC-FymbO?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        dai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1zb5hUMT-WVVmNhDePofES9Net3t1wlBT?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        introai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1zMKAJNLjkjHMYR8JH2UUjydmBdflRkTb?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1zNsQ8p7GCvx-ddntcc4a9cIiB8ds58je?usp=drive_link"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(year2.this,years.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}