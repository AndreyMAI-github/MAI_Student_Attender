package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisciplineList extends AppCompatActivity {

    String[] discipline = {"OOP", "PMU"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_discipline);

        // получаем элемент ListView
        ListView disciplineList = findViewById(R.id.disciplineList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, discipline);

        // устанавливаем для списка адаптер
         disciplineList.setAdapter(adapter);

    }
}