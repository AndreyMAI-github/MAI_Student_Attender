package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DisciplineDayHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("DiciplineDayHandler Created");

        setContentView(R.layout.activity_discipline_day_handler);
    }
}