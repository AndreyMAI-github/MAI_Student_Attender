package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.mai.mai_student_attender.panel_elements.home.HomeFragment;

import java.util.Vector;

import kotlin.contracts.Returns;

public class StudentAttend extends AppCompatActivity {
    int lastIdAttend;
    ListView activity_student_attendListView;
    TextView topPanelText;
    String[] array_of_students = {"Student1", "Student2", "Student3"};
    String[] output_array;
    Vector<String> formedStudList;
    ImageButton Vihod;

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
                String[] tmp_array = getFlaggedStudents();
                // установка текста элемента TextView
                String myStr = "Выбрано: ";
                for(int i = 0; i < tmp_array.length;i++)
                {
                    myStr += tmp_array[i] + " ";
                }
                topPanelText.setText(myStr);
            }
        });

        Vihod = findViewById(R.id.Vihod);
        Vihod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeFragment.class);
                startActivity(intent);
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

    private String[] getFlaggedStudents() // Функция возвращает массив строк отмеченных студентов
    {
        SparseBooleanArray selected=activity_student_attendListView.getCheckedItemPositions();
        output_array= new String[activity_student_attendListView.getCheckedItemCount()];

        int pos = 0;
        for(int i=0;i < array_of_students.length;i++)
        {
            if(selected.get(i)) {
                output_array[pos] = array_of_students[i];
                pos++;
            }
        }

        return output_array;
    }


    protected void addStudToDBForm(String stud) //пока оставить, т.к. нет базы данных
    {

    }



    //необходимо сделать индекс каждому студенту и найти способ нахождения индекса отмеченного студента
    // принести на проверку
    protected int findElemPosition(String elem) // прилетает строка и необходимо дать на выход индекс студента
    {
        int position = -1;
        for(int i=0; i < array_of_students.length ;i++) //мне прилетел студент, сейчас я буду искать его имя в массиве студентов
        {
            if (array_of_students[i].equals(elem)) {
                position = i;
            }
            }
        return position;
    }
}