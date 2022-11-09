package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StudentAttend extends AppCompatActivity {

    String[] array_of_students = {"Student1", "Student2", "Student3"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_attend);
        setStudentList(array_of_students);
        //

    }

    protected void setStudentList(String[] array_of_students)
    {
        // получаем элемент ListView
        ListView activity_student_attendListView = findViewById(R.id.student_attend);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,array_of_students);

        // устанавливаем для списка адаптер
        activity_student_attendListView.setAdapter(adapter);

    }
}