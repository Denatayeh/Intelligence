package com.example.intelligence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ai.client.generativeai.GenerativeModel;
import com.google.ai.client.generativeai.java.GenerativeModelFutures;
import com.google.ai.client.generativeai.type.Content;
import com.google.ai.client.generativeai.type.GenerateContentResponse;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.annotation.Nullable;

public class pdf extends AppCompatActivity {
    Button up,gs,ts,ms,cs,qa;
    ImageView back;
    TextView tv;
    boolean sw=true;
    String[]op=new String[]{};
    Spinner op_list;
    String output_instructions = "Avoid including any irrelevant details or the steps taken in your answer.";
    String thepdf = "display only the following message: 'Please upload the PDF file. The process may take some time, so if it doesn't finish immediately, please be patient and try again.'";
    String General_Summary ="Step 1: Context Identification Identify the overall context of the chapter by analyzing the title, headings, and introductory paragraphs. Determine the main topic, subtopics, and key concepts. Step 2: Main Point Identification Identify the main points in the chapter by analyzing the headings, subheadings, and bullet points. Create a list of main points, including brief explanations and examples where applicable. Step 3: Subpoint Analysis Break down each main point into subpoints, analyzing the supporting details and evidence. Explain each subpoint concisely, using simple language and avoiding jargon. Step 4: Summary Rewriting Rewrite the entire summary in clear, simple language that's easy to understand and suitable for studying. Ensure the summary is concise, focused, and free of unnecessary information,Please provide only the generated summary, without any additional explanations or text.";
    String Summarizing_Terms="Step 1: Term Identification Identify and list all key terms relevant to the context of the chapter. Analyze the text to determine the importance and relevance of each term. Step 2: Definition and Explanation For each key term: If a clear definition exists within the text, include that definition. If a definition is not explicitly provided, craft a concise explanation based on the context. If the term can be inferred from the context, include a brief explanation. Step 3: Organization and Formatting Organize the terms and their definitions in a clear, well-structured format that is easy to understand and study. Use headings, subheadings, and bullet points to make the summary easy to navigate,Please provide only the generated summary, without any additional explanations or text.";
    String  Mathematical_Laws="Summary Step 1: Content Analysis Check if the content pertains to mathematics or includes mathematical laws. If it does not contain any mathematical laws, notify the user with a message: -This file does not contain mathematical laws.- Step 2: Law Identification If the content includes mathematical laws, proceed to identify each law clearly. Analyze the text to determine the significance and application of each law. Step 3: Law Explanation Explain what each law represents and its significance. If a mathematical law is not explicitly stated in the text, but can be inferred from the context, include a brief explanation,Please provide only the generated summary, without any additional explanations or text.";
    String Question_Answer="Question Generation Step 1: Question Identification Identify the main concepts and topics in the chapter. Analyze the text to determine the key ideas and themes. Step 2: Question Creation Create multiple-choice questions based on the identified concepts and topics. Each question should have: A clear and concise question stem 4 answer options (A, B, C, and D) Only one correct answer Step 3: Question Organization Organize the questions in a logical order, such as by topic or chapter section. Use a consistent format for each question. Example Output Here is an example of what the output might look like: Question 1 What is the main purpose of identifying key concepts and topics in a chapter? A) To create a summary of the chapter B) To identify the main questions answered by the chapter C) To analyze the text for key ideas and themes D) To generate concise answers to questions Correct Answer: C) To analyze the text for key ideas and themes Question 2 What should be avoided when generating answers to questions about a chapter? A) Using simple language B) Ensuring accuracy and completeness C) Using jargon and technical terms D) Organizing answers in a clear format Correct Answer: C) Using jargon and technical terms Question 3 What is the purpose of organizing questions and answers in a summary? A) To make the summary more concise B) To make the summary easier to navigate C) To identify the main concepts and topics D) To generate multiple-choice questions Correct Answer: B) To make the summary easier to navigate And so on..., Please provide only the generated questions with their answers, without any additional explanations or text. additional notes:'try to maximize the number of questions','if the pdf is about programming make sure to add code tracing multiple answer question'.";
    String  Sentence_Compression_Summary="Step 1: Sentence Selection Select the most important sentences in the chapter, based on their relevance and significance. Analyze the sentences to determine their core meaning and key concepts. Step 2: Compression Compress each sentence, removing unnecessary words and phrases while preserving the core meaning. Use simple language and concise phrasing to make the sentences easy to understand. Step 3: Summary Review Review the compressed sentences to ensure they accurately represent the main ideas and concepts in the chapter. Use the compressed sentences to create a concise and focused summary,Please provide only the generated summary, without any additional explanations or text.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        up = findViewById(R.id.up);
        back = findViewById(R.id.backpdf);
        tv = findViewById(R.id.tvOutput);
        gs=findViewById(R.id.general);
        ts=findViewById(R.id.terms);
        ms=findViewById(R.id.math);
        cs=findViewById(R.id.compression);
        qa=findViewById(R.id.question);

        Intent intent = getIntent();
        boolean value = intent.getBooleanExtra("lang",false);
        if(value){
            up.setText("رفع الملف");
            gs.setText("تلخيص عام");
            ts.setText("تلخيص المصطلحات");
            ms.setText("تلخيص القوانين الرياضية");
            cs.setText("تلخيص مختصر");
            qa.setText("مولد الأسئلة");
            op= new String[]{"تلخيص عام", "تلخيص المصطلحات", "تلخيص القوانين الرياضية", "تلخيص مختصر", "مولد الأسئلة"};
        }

        else {
            op=new String[]{"General Summary","Definition Extractor","Math Rule Summary","Summary Compressor","QA Extractor"};
        }
        op_list=findViewById(R.id.op_spinner);

        ArrayAdapter ad = new ArrayAdapter<>(pdf.this, android.R.layout.simple_list_item_1, op);
        op_list.setAdapter(ad);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseFile();thepdf+=" ";tv.setText(thepdf);
            }
        });
        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw) {
                    gemini(General_Summary + "\nthe pdf:" + thepdf + output_instructions);
                    tv.setText("...");
                }
            }
        });
        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw) {
                    gemini(Summarizing_Terms + "\nthe pdf:" + thepdf + output_instructions);
                    tv.setText("...");
                }
            }
        });
        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw) {
                    gemini(Mathematical_Laws + "\nthe pdf:" + thepdf + output_instructions);
                    tv.setText("...");
                }
            }
        });
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw) {
                    gemini(Sentence_Compression_Summary + "\nthe pdf:" + thepdf + output_instructions);
                    tv.setText("...");
                }

            }
        });
        qa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw) {
                    gemini(Question_Answer + "\nthe pdf:" + thepdf + output_instructions);
                    tv.setText("...");
                }
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager copy=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                ClipData data=ClipData.newPlainText("",tv.getText().toString());
                copy.setPrimaryClip(data);
                Toast.makeText(getApplicationContext(), "text copied", Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(pdf.this, main.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void chooseFile() {
        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
        i.setType("application/pdf");
        i.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            if (data != null) {
                Uri selectedFileUri = data.getData();
                getText(selectedFileUri);
            }
        }
    }

    private void getText(Uri uri) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                sw=false;
                InputStream input;
                StringBuilder builder = new StringBuilder();
                PdfReader reader = null;

                try {
                    input = getContentResolver().openInputStream(uri);
                    if (input != null) {
                        reader = new PdfReader(input);
                        int pages = reader.getNumberOfPages();
                        for (int i = 1; i <= pages; i++) {
                            builder.append(PdfTextExtractor.getTextFromPage(reader, i)).append("\n");
                            if(builder.length()>=5000000)break;
                        }
                        reader.close();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        reader.close();
                    }
                }

                thepdf = builder.toString();
                sw=true;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), "PDF uploaded", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }).start();
    }


    public void gemini(String inputin) {
        sw=false;
        GenerativeModel gm = new GenerativeModel("gemini-1.5-flash", "AIzaSyDRSwgdDw0TItr9Jbz0pZdisYDWbdq6EIg");
        GenerativeModelFutures model = GenerativeModelFutures.from(gm);
        Content content = new Content.Builder().addText(inputin).build();

        ListenableFuture<GenerateContentResponse> response = model.generateContent(content);
        Futures.addCallback(response, new FutureCallback<GenerateContentResponse>() {
            @Override
            public void onSuccess(GenerateContentResponse result) {
                String resultText = result.getText();
                tv.setText(resultText);
                sw=true;
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        }, getMainExecutor());
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(pdf.this, main.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}