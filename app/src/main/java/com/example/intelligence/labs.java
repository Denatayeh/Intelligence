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

public class labs extends AppCompatActivity {
    private void setMargins (View view, int top) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(0, top, 0, 100);
            view.requestLayout();
        }
    }
    Button cs1,cs2,cs3,cs4,cs5,cs6,cis1,cis2,cis3,cis4,cis5,cis6,cis7,nes1,nes2,nes3,nes4,cpe1,cpe2,cpe3,cpe4,cpe5,cpe6,cpe7,cpe8,cpe9,se1,se2,se3,se4,se5;
    ImageView back;
    boolean v=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labs);
        cs1=findViewById(R.id.cs1);
        cs2=findViewById(R.id.cs2);
        cs3=findViewById(R.id.cs3);
        cs4=findViewById(R.id.cs4);
        cs5=findViewById(R.id.cs5);
        cs6=findViewById(R.id.cs6);
        cis1=findViewById(R.id.cis01);
        cis2=findViewById(R.id.cis02);
        cis3=findViewById(R.id.cis03);
        cis4=findViewById(R.id.cis04);
        cis5=findViewById(R.id.cis05);
        cis6=findViewById(R.id.cis06);
        cis7=findViewById(R.id.cis07);
        nes1=findViewById(R.id.nes01);
        nes2=findViewById(R.id.nes02);
        nes3=findViewById(R.id.nes03);
        nes4=findViewById(R.id.nes04);
        cpe1=findViewById(R.id.cpe01);
        cpe2=findViewById(R.id.cpe02);
        cpe5=findViewById(R.id.cpe05);
        cpe6=findViewById(R.id.cpe06);
        cpe7=findViewById(R.id.cpe07);
        cpe8=findViewById(R.id.cpe08);
        cpe9=findViewById(R.id.cpe09);
        se1=findViewById(R.id.se01);
        se2=findViewById(R.id.se02);
        se3=findViewById(R.id.se03);
        se4=findViewById(R.id.se04);
        se5=findViewById(R.id.se05);
        back=findViewById(R.id.backlab);






        int height= this.getResources().getDisplayMetrics().heightPixels;

        setMargins(cs1, (int) ceil(height*0.0));
        setMargins(cs2, (int) ceil(height*0.1));
        setMargins(cs3, (int) ceil(height*0.2));
        setMargins(cs4, (int) ceil(height*0.3));
        setMargins(cs5, (int) ceil(height*0.4));
        setMargins(cs6, (int) ceil(height*0.5));
        setMargins(cis1, (int) ceil(height*0.6));
        setMargins(cis2, (int) ceil(height*0.7));
        setMargins(cis3, (int) ceil(height*0.8));
        setMargins(cis4, (int) ceil(height*0.9));
        setMargins(cis5, (int) ceil(height*1.0));
        setMargins(cis6, (int) ceil(height*1.1));
        setMargins(cis7, (int) ceil(height*1.2));
        setMargins(nes1, (int) ceil(height*1.3));
        setMargins(nes2, (int) ceil(height*1.4));
        setMargins(nes3, (int) ceil(height*1.5));
        setMargins(nes4, (int) ceil(height*1.6));
        setMargins(cpe1, (int) ceil(height*1.7));
        setMargins(cpe2, (int) ceil(height*1.8));
        setMargins(cpe5, (int) ceil(height*1.9));
        setMargins(cpe6, (int) ceil(height*2.0));
        setMargins(cpe7, (int) ceil(height*2.1));
        setMargins(cpe8, (int) ceil(height*2.2));
        setMargins(cpe9, (int) ceil(height*2.3));
        setMargins(se1, (int) ceil(height*2.4));
        setMargins(se2, (int) ceil(height*2.5));
        setMargins(se3, (int) ceil(height*2.6));
        setMargins(se4, (int) ceil(height*2.7));
        setMargins(se5, (int) ceil(height*2.8));
        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        v=value;

        cs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/wmxo3Cd3zFKQYscW8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        cs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/TF8uBhVSzq456vbU8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        cs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/TF8uBhVSzq456vbU8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        cs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://goo.gl/maps/GmbbJH3xZ9q7a8oK8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        cs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/UxDAc9rjXMR7gZJZ9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        cs6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/jgvMwAEQ24Coxj9f6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        cis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/wmxo3Cd3zFKQYscW8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/wmxo3Cd3zFKQYscW8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/TF8uBhVSzq456vbU8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/rTkrQbFszVSjWLct8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cis5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/rTkrQbFszVSjWLct8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cis6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/voYpKBsqaK4mFbED7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cis7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/AsLkpSj9886jsbxGA"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        nes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/yCCVpZ5GAnmmnz94A"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        nes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/yCCVpZ5GAnmmnz94A"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        nes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/WmqyGQwuxfoXyEr36"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        nes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/rTkrQbFszVSjWLct8"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cpe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/xwWUph7vN8KEcx697"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cpe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/xwWUph7vN8KEcx697"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cpe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/zEKGPwxa1JuwXEKo7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cpe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/7cBrBbuasirmfogV9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cpe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/7cBrBbuasirmfogV9"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cpe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/zEKGPwxa1JuwXEKo7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        cpe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/zEKGPwxa1JuwXEKo7"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        se1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/WmqyGQwuxfoXyEr36"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        se2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/WmqyGQwuxfoXyEr36"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        se3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/WmqyGQwuxfoXyEr36"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        se4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/nY2kRQjzRj2cgyf17"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        se5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/fGza9eAQ8qBcX6KZ6"; // Replace with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(labs.this,location.class);
                i.putExtra("lang", value);
                startActivity(i);
                finish();
            }
        });



    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(labs.this,location.class);
        i.putExtra("lang", v);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}