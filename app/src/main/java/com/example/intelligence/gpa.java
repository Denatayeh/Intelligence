package com.example.intelligence;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class gpa extends AppCompatActivity {

    EditText creditsInput, nameInput, cgradeInput, choursInput;
    Spinner letterGradeSpinner, creditSpinner;
    Button calculateGpaButton, addCourse, clear;
    ImageButton back;
    TextView gpaResultText,text1,course_name,credits,grade,cgrade,ccredits,gpares;
    ArrayList<String> res;
    ListView marks;
    ArrayList<Double> savec, savem;
    String valid="please enter a valid gpa",name="Name: " ,mark="Mark: ",credit="Credits: ",course_added="course added successfully";

    private List<String> letterGrades, letterCredits; // List of letter grades
    double gpa = 0;
    double cgpa = 0;
    int h = 0;
    int ch = 0;
    double zero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);
        nameInput = findViewById(R.id.name_input);
        letterGradeSpinner = findViewById(R.id.letter_grade_spinner);
        creditSpinner = findViewById(R.id.op_spinner);
        calculateGpaButton = findViewById(R.id.calculate_gpa_button);
        gpaResultText = findViewById(R.id.gpa_result_text);
        cgradeInput = findViewById(R.id.c_grade_input);
        choursInput = findViewById(R.id.c_hours_input);
        back = findViewById(R.id.backgpa);
        addCourse = findViewById(R.id.Add_course);
        marks = findViewById(R.id.marks);
        clear = findViewById(R.id.clear);
        text1=findViewById(R.id.course_name_label);
        course_name=findViewById(R.id.name_label);
        credits=findViewById(R.id.credits_label);
        grade=findViewById(R.id.letter_grade_label);
        cgrade=findViewById(R.id.c_grade_label);
        ccredits=findViewById(R.id.c_hours_label);
        gpares=findViewById(R.id.gpa_result_label);
        res = new ArrayList<>();
        savec = new ArrayList<>();
        savem = new ArrayList<>();
        ArrayAdapter ad = new ArrayAdapter<>(gpa.this, android.R.layout.simple_list_item_1, res);
        marks.setAdapter(ad);

        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        if(value){
            text1.setText("قم بإضافة علامات المساق واحداّ كل مرة, و قم بالضغط على المساق للقيام بحذفه.");
            course_name.setText("اسم المساق");
            nameInput.setHint("أدخل إسم المساق(اختياري)");
            credits.setText("الساعات المعتمدة");
            grade.setText("رمز العلامة");
            addCourse.setText("إضافة مساق");
            clear.setText("مسح الكل");
            cgrade.setText("المعدل التراكمي:");
            ccredits.setText("الساعات التراكمية:");
            calculateGpaButton.setText("حساب المعدل");
            gpares.setText("المعدل المحسوب:");
            valid="الرجاء إدخال معدل صحيح";
            name="الإسم: " ;
            mark="العلامة: ";
            credit="الساعات: ";
            course_added="تم إضافة المساق بنجاح";

        }
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.clear();
                savec.clear();
                savem.clear();
                nameInput.setText("");
                cgradeInput.setText("");
                choursInput.setText("");
                h = 0;
                gpa = 0;
                ch = 0;
                cgpa = 0;
                ad.notifyDataSetChanged();
                gpaResultText.setText("_");
            }
        });

        marks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                h -= savec.get(position).doubleValue();
                gpa -= savec.get(position).doubleValue() * savem.get(position).doubleValue();
                savec.remove(position);
                savem.remove(position);
                res.remove(position);
                ad.notifyDataSetChanged();
            }
        });

        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String creditsString = creditsInput.getText().toString().trim();
                String letterGrade = (String) letterGradeSpinner.getSelectedItem();
                String creditsString = (String) creditSpinner.getSelectedItem().toString().trim();
                double gradeValue = convertLetterGrade(letterGrade);
                double credits = Double.parseDouble(creditsString);
                String namestring = nameInput.getText().toString().trim();
                res.add(name + namestring + "\n" + mark + letterGrade + "\n" + credit + creditsString + "\n");
                savec.add(credits);
                savem.add(gradeValue);
                calculateCourseGpa(credits, gradeValue);
                ad.notifyDataSetChanged();
                Toast.makeText(gpa.this, course_added, Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(gpa.this, main.class);
                startActivity(i);
                finish();
            }
        });
        letterCredits = new ArrayList<>();
        letterCredits.add("1");
        letterCredits.add("2");
        letterCredits.add("3");
        letterCredits.add("4");
        letterCredits.add("5");
        letterCredits.add("6");

        letterGrades = new ArrayList<>();
        letterGrades.add("A+");
        letterGrades.add("A");
        letterGrades.add("A-");
        letterGrades.add("B+");
        letterGrades.add("B");
        letterGrades.add("B-");
        letterGrades.add("C+");
        letterGrades.add("C");
        letterGrades.add("C-");
        letterGrades.add("D+");
        letterGrades.add("D");
        letterGrades.add("D-");
        letterGrades.add("F");  // You can modify this list as needed

        // Create adapter for spinner using the letter grade list
        ArrayAdapter<String> credit_adapter = new ArrayAdapter<>(this, R.layout.spinner_style, letterCredits);
        credit_adapter.setDropDownViewResource(R.layout.items);
        creditSpinner.setAdapter(credit_adapter);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_style, letterGrades);
        adapter.setDropDownViewResource(R.layout.items);
        letterGradeSpinner.setAdapter(adapter);

        // Set click listener for calculate button
        calculateGpaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateGpa();
            }
        });
    }

    private void calculateGpa() {
        if (cgradeInput.getText().toString().isEmpty() || choursInput.getText().toString().isEmpty()) {
            cgpa = 0;
            ch = 0;
        } else {
            cgpa = Double.parseDouble(cgradeInput.getText().toString());
            ch = (int) Double.parseDouble(choursInput.getText().toString());
            double credits;
        }


        double res = (gpa / h);
        double cres = (cgpa * ch);

        if (cgpa > 4.2) {
            Toast.makeText(gpa.this, valid, Toast.LENGTH_SHORT).show();
            cgradeInput.setText("");
            choursInput.setText("");
            cres = 0;
        }

        if (Double.isNaN(res)) {
            res = 0;
        }
        if (Double.isNaN(cres)) {
            cres = 0;
        }

        if (res == 0 && cres == 0)
            gpaResultText.setText(String.format("%.2f", zero));
        else if (res == 0 && cres != 0)
            gpaResultText.setText(String.format("%.2f", cgpa));// Display GPA with 2 decimal places
        else if (res != 0 && cres == 0)
            gpaResultText.setText(String.format("%.2f", res));// Display GPA with 2 decimal places
        else
            gpaResultText.setText(String.format("%.2f", (cres + gpa) / (ch + h)));// Display GPA with 2 decimal places
    }

    private double convertLetterGrade(String letterGrade) {
        if (letterGrade == "A+") return 4.2;
        if (letterGrade == "A") return 4.0;
        if (letterGrade == "A-") return 3.75;
        if (letterGrade == "B+") return 3.5;
        if (letterGrade == "B") return 3.25;
        if (letterGrade == "B-") return 3.0;
        if (letterGrade == "C+") return 2.75;
        if (letterGrade == "C") return 2.5;
        if (letterGrade == "C-") return 2.25;
        if (letterGrade == "D+") return 2.0;
        if (letterGrade == "D") return 1.75;
        if (letterGrade == "D-") return 1.5;
        if (letterGrade == "F") return 0.5;
        return 0.0;


    }

    private double calculateCourseGpa(double credits, double gradeValue) {
        h += credits;
        gpa += credits * gradeValue;

        return credits * gradeValue;
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(gpa.this, main.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}