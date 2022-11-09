package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DisciplineList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("DisciplineList Created");

        setContentView(R.layout.activity_discipline_list);
    }
}