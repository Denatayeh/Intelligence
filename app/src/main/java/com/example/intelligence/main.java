package com.example.intelligence;

import static java.lang.Math.ceil;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class main extends AppCompatActivity {

    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn9;
    static boolean dena=false;
    ImageButton btn8,lan, bot, pdf;
    ExtendedFloatingActionButton menuFab;
    Boolean extendFAB;

    Context context;
    Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.acr);
        btn2=findViewById(R.id.as);
        btn3=findViewById(R.id.group);
        btn4=findViewById(R.id.insta);
        btn5=findViewById(R.id.tp);
        btn6=findViewById(R.id.gpa);
        btn7=findViewById(R.id.loc);
        btn9=findViewById(R.id.yt);
        lan=findViewById(R.id.language);
        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(btn1, (int) ceil(height*0.13));
        setMargins(btn7, (int) ceil(height*0.23));
        setMargins(btn6, (int) ceil(height*0.33));
        setMargins(btn5, (int) ceil(height*0.43));
        setMargins(btn9, (int) ceil(height*0.53));
        setMargins(btn3, (int) ceil(height*0.63));
        setMargins(btn4, (int) ceil(height*0.73));
        setMargins(btn2, (int) ceil(height*0.83));
        if(dena){
            btn1.setText("المصادر الأكاديمية");
            btn2.setText("حولنا");
            btn3.setText("فيسبوك");
            btn4.setText("إنستغرام");
            btn5.setText("الخطط الشجرية");
            btn6.setText("حساب المعدل");
            btn7.setText("المواقع");
            btn9.setText("يوتيوب");
        }

        menuFab = findViewById(R.id.btn_menu);

        bot = findViewById(R.id.bot_btn);
        pdf = findViewById(R.id.pdf_btn);

        bot.setVisibility(View.GONE);
        pdf.setVisibility(View.GONE);

        extendFAB = false;

        menuFab.shrink();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(main.this,years.class);
                i.putExtra("lang", dena);
                startActivity(i);
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(main.this, about_us.class);
                i.putExtra("lang", dena);
                startActivity(i);
                finish();
            }
        });
        pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(main.this, pdf.class);
                i.putExtra("lang", dena);
                startActivity(i);
                finish();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/groups/IntelligenceGroup.CS/?ref=share"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/intelligence.group?igsh=MTNiMnVxZ3g4MG1jdg=="; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(main.this,plan.class);
                i.putExtra("lang", dena);
                startActivity(i);
                finish();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(main.this,gpa.class);
                i.putExtra("lang", dena);
                startActivity(i);
                finish();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(main.this,location.class);
                i.putExtra("lang", dena);
                startActivity(i);
                finish();
            }
        });
        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(main.this,chatbot.class);
                startActivity(i);
                finish();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtube.com/@intelligencegroup3695?si=ZPov7OizI99NVAmK"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }


        });
        lan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dena=!dena;
                if(dena){
                    btn1.setText("المصادر الأكاديمية");
                    btn2.setText("حولنا");
                    btn3.setText("مجموعة الفيسبوك");
                    btn4.setText("صفحة الإنستغرام");
                    btn5.setText("الخطط الشجرية");
                    btn6.setText("حساب المعدل");
                    btn7.setText("المواقع الجامعية");
                    btn9.setText("قناة اليوتيوب");
                }
                if(!dena){
                    btn1.setText("Academic Resources");
                    btn2.setText("About us");
                    btn3.setText("Facebook group");
                    btn4.setText("Instagram page");
                    btn5.setText("CS and AI plans");
                    btn6.setText("GPA calculator");
                    btn7.setText("University locations");
                    btn9.setText("Youtube channel");
                }
            }


        });


        menuFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!extendFAB) {

                            bot.setVisibility(View.VISIBLE);
                            pdf.setVisibility(View.VISIBLE);

                            menuFab.extend();

                            extendFAB = true;
                        } else {

                            bot.setVisibility(View.GONE);
                            pdf.setVisibility(View.GONE);

                            menuFab.shrink();

                            extendFAB = false;
                        }
                    }
                });
    }

}
