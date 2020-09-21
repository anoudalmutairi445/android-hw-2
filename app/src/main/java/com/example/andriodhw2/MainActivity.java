package com.example.andriodhw2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText midterms;
    EditText quizzes;
    EditText finals;
    EditText homeworks ;
    Button reset, calculate ;

    float result_num;
    int midterm, fin, quiz, home;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        midterms = (EditText)findViewById(R.id.midterms);
        quizzes = (EditText)findViewById(R.id.quizzes);
        homeworks = (EditText)findViewById(R.id.homeworks);
        finals = (EditText)findViewById(R.id.finals);
        reset = (Button) findViewById(R.id.reset);
        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midterm = Integer.parseInt(midterms.getText().toString());
                 fin = Integer.parseInt(finals.getText().toString());
                home = Integer.parseInt(homeworks.getText().toString());
                quiz = Integer.parseInt(quizzes.getText().toString());
                result_num = (midterm + fin + quiz + home)/4 ;
                result.setText(String.valueOf(result_num));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("Result");
            }
        });




    }
}