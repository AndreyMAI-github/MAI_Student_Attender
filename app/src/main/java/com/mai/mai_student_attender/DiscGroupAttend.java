package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DiscGroupAttend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("DiscGroupAttend Created");

        setContentView(R.layout.activity_groups_attend);
    }
}