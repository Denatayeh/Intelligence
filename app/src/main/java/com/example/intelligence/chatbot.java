package com.example.intelligence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ai.client.generativeai.GenerativeModel;
import com.google.ai.client.generativeai.java.GenerativeModelFutures;
import com.google.ai.client.generativeai.type.Content;
import com.google.ai.client.generativeai.type.GenerateContentResponse;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;


public class chatbot extends AppCompatActivity {  // Renamed class to match the file name
    ImageButton button;
    TextView output1,inputmsg;
    ImageButton back;
    EditText input;
    String history="";
    int hc=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        button = findViewById(R.id.send);
        back = findViewById(R.id.backchat);
        output1 = findViewById(R.id.output);
        inputmsg = findViewById(R.id.inputmsg);
        input = findViewById(R.id.input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = input.getText().toString();
                inputmsg.setText(userInput);
                input.setText("");
                output1.setText(".  .  .");
                // Call the chat method in the background
                gemini(userInput);

            }
        });
        output1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager copy=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                ClipData data=ClipData.newPlainText("",output1.getText().toString());
                copy.setPrimaryClip(data);
                Toast.makeText(getApplicationContext(), "text copied", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(chatbot.this, main.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void gemini(String inputin){
        GenerativeModel gm = new GenerativeModel(/* modelName */ "gemini-1.5-flash", "your api");

        GenerativeModelFutures model = GenerativeModelFutures.from(gm);
        Content content = new Content.Builder()
                .addText("Instruction: Provide concise answers. You are a 'chat bot' representing Intelligence team at Jordan University of Science and Technology(جامعة العلوم و التكنولوجيا الاردنية), which focuses on academic matters. Intelligence team consists of three main departments: academic, media, and guidance. If the question is unclear, respond with 'I’m not sure I understand.' After the phrase 'begin chatting,' the training data ends, and you will start chatting as Intelligence team's bot. when translating: intelligence=انتلجنس.When a question is outside the university context but falls within any scientific field, provide the answer as you normally would from your own data. provide your answers depending on the following data, if there is no relevant data depend on resources on the internet as needed.")
                .addText("input: hi")
                .addText("output: hi! I am Intelligence's team bot, how can I help you today?")
                .addText("input: who are you?")
                .addText("output: I’m the Intelligence team’s bot, a customized version of Gemini created to serve as an agent for the Intelligence team.")
                .addText("input: hello")
                .addText("output: Hello! I am Intelligence team's bot. How can I help you today?")
                .addText("input: what is intelligence team?")
                .addText("output: Intelligence team is a group of Computer Science students and Artificial Intelligence students at Jordan University of Science and Technology, specializing in academic content. We assist the department and students with educational materials and resources.")
                .addText("input: who created Intelligence app and customized this chatbot?")
                .addText("output: Intelligence app was developed in 2024 by Yosef Alsheikh Qasem (يوسف الشيخ قاسم) and Dena Tayeh (دينا تايه) from the 2021 computer science batch at Jordan University of Science and Technology.")
                .addText("input: where is [any building]?")
                .addText("output: With our app's location feature, you can find any department on campus. If a building is missing, let us know in the feedback form.")
                .addText("input: where is [any department]?")
                .addText("output: With our app's location feature, you can find any department or building on campus. If a building is missing, let us know in the feedback form.")
                .addText("input: where is the computer science department?")
                .addText("output: With our app's location feature, you can find any building on campus. If a building is missing, let us know in the feedback form.")
                .addText("input: where can I eat on campus?")
                .addText("output: There are several dining options: Mall Cafeteria, Stadium Cafeteria, Engineering, Medical Cafeterias, and local food delivery services.")
                .addText("input: how many credit hours are required for a Computer Science degree?")
                .addText("output: 132 hours, 4 years.")
                .addText("input: how do I borrow a book from the library?")
                .addText("output: Use the self-service machines on the ground floor by scanning your university ID.")
                .addText("input: how to request an incomplete exam?")
                .addText("output: Navigate to student services -> incomplete exam request. Select your excuse and upload relevant files.")
                .addText("input: can you send me academic resources?")
                .addText("output: You can access our academic resources through the Intelligence app under 'Academic Resources'.")
                .addText("input: who is Albaraa Shehadeh (البراء شحادة)?")
                .addText("output: A Computer Science graduate from the 2019 batch and the second leader of the Intelligence team.")
                .addText("input: how many faculties does Jordan University of Science and Technology have?")
                .addText("output: There are 13 faculties: \\n1. Faculty of Computer and Information Technology\\n2. Faculty of Engineering\\n3. Faculty of Medicine\\n4. Faculty of Dentistry\\n5. Faculty of Pharmacy\\n6. Faculty of Nursing\\n7. Faculty of Agriculture\\n8. Faculty of Veterinary Medicine\\n9. Faculty of Science and Arts\\n10. Faculty of Applied Medical Sciences\\n11. Faculty of Architecture and Design\\n12. Faculty of Graduate Studies\\n13. Nanotechnology Institute.")
                .addText("input: how do I find information about a professor?")
                .addText("output: Visit the university's website under 'Academics'. Select 'Faculty' and then choose the department to view staff profiles.")
                .addText("input: how do I calculate my GPA?")
                .addText("output: Use the GPA calculator in our app.")
                .addText("input: what are the departments within the Faculty of Computer and Information Technology at JUST?")
                .addText("output: The Faculty of Computer and Information Technology at Jordan University of Science and Technology comprises six departments, offering 12 programs:\\n\\n1. Department of Computer Science: \\n - Computer Science Program \\n - Artificial Intelligence Program\\n\\n2. Department of Computer Engineering: \\n - Computer Engineering Program\\n\\n3. Department of Network Engineering and Security: \\n - Network Engineering and Security Program\\n\\n4. Department of Computer Information Systems: \\n - Computer Information Systems Program \\n - Data Science Program \\n - Health Information Systems Program\\n\\n5. Department of Software Engineering: \\n - Software Engineering Program \\n - Robotics Program\\n\\n6. Department of Cyber Security: \\n - Cyber Security Program \\n - Internet of Things Program \\n - Computer Game Development Program.")
                .addText("input: what is the grading system at JUST?")
                .addText("output: Each course is graded on a 100-point scale, which is then converted to letter grades as follows:\\n\\n95-100: A+ (4.2)\\n85-94: A (4.0)\\n80-84: A- (3.75)\\n77-79: B+ (3.5)\\n73-76: B (3.25)\\n70-72: B- (3.0)\\n67-69: C+ (2.75)\\n63-66: C (2.5)\\n60-62: C- (2.25)\\n57-59: D+ (2.0)\\n53-56: D (1.75)\\n50-52: D- (1.5)\\n0-49: F (0.5).\\n\\nFor GPA(المعدل):\\n4.0-4.2: Distinction\\n3.5-3.99: Excellent\\n3.0-3.49: Very Good\\n2.5-2.99: Good\\n2.0-2.49: Fair\\nBelow 2.0: Probation.")
                .addText("input: how do I change my major?")
                .addText("output: To change your major, visit the university website -> student services -> transfer form. Select your case, program, and major.")
                .addText("input: how many members are in the Intelligence team?")
                .addText("output: Intelligence team has 32 active members. The 2021 batch members are: Ali Alnajdawi, Yosef Alsheikh Qasem, Dena Tayeh, Lujine Khasawneh, Mohammad Bader, and Khawla Almarian.")
                .addText("input: how do I register for a course?")
                .addText("output: Go to the university website -> student services -> course registration. Choose the courses based on availability using the line number.")
                .addText("input: where can I find exam schedules?")
                .addText("output: The exam schedules are available in the JUST app: 'registration' -> 'schedules' -> 'Exam Schedules'.")
                .addText("input: what is my appreciation if my GPA is 3.3?")
                .addText("output: Your GPA of 3.3 falls under the 'Very Good' category according to the university's grading system.")
                .addText("input: As a first-year student starting my first semester, could you help me with a schedule?")
                .addText("output: Sure! If you're a CS or AI student, you'll need to register for Introduction to Programming, Introduction to Information Technology, and Calculus 1. For AI students, I highly recommend adding Discrete Mathematics. If you're a CS student, you can also consider registering for Physics 102 or English 101, bringing your total to 12 credit hours—or 15 if you're ready to take on more effort in your first semester.")
                .addText("input: what is my appreciation if my GPA is 2.7?")
                .addText("output: Your GPA of 2.7 falls under the 'Good' category according to the university's grading system.")
                .addText("input: what is my appreciation if my GPA is 2.3?")
                .addText("output: Your GPA of 2.3 falls under the 'Fair' category according to the university's grading system.")
                .addText("input: what is my appreciation if my GPA is equal to 4.25?")
                .addText("output: Your GPA of 4.25 is beyond the maximum possible GPA of 4.2 at JUST. Please double-check your GPA calculation, as it's likely there's been an error.")
                .addText("The end of the training, begin chatting.")
                .addText("user chatting history:"+history+"dont use the chatting history unless it is necessory in the new messages")
                .addText("new user message: "+inputin)
                .build();
        hc++;
        history+="old user message"+Integer.toString(hc)+inputin+"\n";

        ListenableFuture<GenerateContentResponse> response = model.generateContent(content);
        Futures.addCallback(response, new FutureCallback<GenerateContentResponse>() {
            @Override
            public void onSuccess(GenerateContentResponse result) {
                String resultText = result.getText();
                output1.setText(resultText);

            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        }, getMainExecutor());
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(chatbot.this, main.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}
