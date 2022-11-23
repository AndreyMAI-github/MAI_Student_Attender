package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StudentAttend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("StudentAttend Created");

        setContentView(R.layout.activity_student_attend);
    }
}