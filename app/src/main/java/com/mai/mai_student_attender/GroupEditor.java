package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TextView;


public class GroupEditor extends AppCompatActivity implements OnClickListener {


    private void setHeaderTextName(String str){
        TextView textView = (TextView) findViewById(R.id.textNumber_of_group);


        textView.getText();
        textView.setText(str);
    }

    // определяем кнопку BackButton
    // присваеваем ей активити в качестве обработчика
    Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_editor);

        BackButton = (Button) findViewById(R.id.button_back_to_groups);
        BackButton.setOnClickListener(this);

        String[] StudentsListArray = {"Астапов Владимир", "Бойко Виктория"};

        // получаем элемент ListView
        ListView list_of_students = findViewById(R.id.StudentsList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, StudentsListArray);

        // устанавливаем для списка адаптер
        list_of_students.setAdapter(adapter);
    }

    // реализация метода onClick
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_back_to_groups:
                Intent intent = new Intent(this, GroupList.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

