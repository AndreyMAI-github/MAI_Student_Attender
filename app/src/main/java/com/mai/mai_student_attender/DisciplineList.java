package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisciplineList extends AppCompatActivity {
// Сначала добавление функциональных кнопок-дисциплин
// Создание отдельного окна для этого действия, в котором будет вводится название дисциплин,
// Которые будут преобразовываться в кнопки-дисциплины, с последующим переходом в DisciplineEdit
    String[] discipline = {"OOP", "PMU"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<<<< Temporary merge branch 1

        Logger.d("DisciplineList Created");

//        setContentView(R.layout.activity_discipline_list);
        setContentView(R.layout.fragment_discipline);

=========
        Logger.d("OnCreate");

        setContentView(R.layout.fragment_discipline);
        Logger.d("OnSetContent");

        setDisciplineList(discipline);
        Logger.d("OnSetDisciplineList");

    }

    protected void setDisciplineList(String[] gitdiscipline) {

        // получаем элемент ListView
        ListView fragment_disciplineListView = findViewById(R.id.disciplineList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, discipline);

        // устанавливаем для списка адаптер
        fragment_disciplineListView.setAdapter(adapter);

>>>>>>>>> Temporary merge branch 2
    }
}