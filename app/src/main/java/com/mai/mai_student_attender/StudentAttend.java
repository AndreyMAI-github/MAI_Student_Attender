package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Vector;

public class StudentAttend extends AppCompatActivity {

    int lastIdAttend;
    ListView activity_student_attendListView;
    TextView topPanelText;
    String[] array_of_students = {"Student1", "Student2", "Student3"};
    Vector<String> formedStudList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("StudentAttend Created");

        setContentView(R.layout.activity_student_attend);

        activity_student_attendListView = findViewById(R.id.student_attend); // получаем элемент ListView
        topPanelText = findViewById(R.id.Nomer_groopi);

        setStudentList(array_of_students);
        //
        activity_student_attendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                SparseBooleanArray selected=activity_student_attendListView.getCheckedItemPositions();

                String selectedItems="";
                for(int i=0;i < array_of_students.length;i++)
                {
                    if(selected.get(i))
                        selectedItems+=array_of_students[i]+",";
                }
                // установка текста элемента TextView
                topPanelText.setText("Выбрано: " + selectedItems);
            }
        });

    }

    protected void setStudentList(String[] array_of_students)
    {
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice,array_of_students);

        // устанавливаем для списка адаптер
        activity_student_attendListView.setAdapter(adapter);

    }

    protected void addStudToForm(String stud)
    {

    }

    protected int findElemPosition(String elem)
    {
        for(int i =0; i < formedStudList.size(); i++)
        {

        }
        return -1;
    }
}