package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import java.util.Arrays;
import androidx.annotation.NonNull;
import android.app.AlertDialog;
import android.app.Dialog;




public class GroupEditor extends AppCompatActivity implements OnClickListener {


    private void setHeaderTextName(String str){
        TextView textView = (TextView) findViewById(R.id.textNumber_of_group);
        textView.setText(str);
    }

    // определяем кнопку BackButton
    // присваеваем ей активити в качестве обработчика
    Button BackButton;
    Button AdditionalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_editor);


        BackButton = (Button) findViewById(R.id.button_back_to_groups);
        BackButton.setOnClickListener(this);

        AdditionalButton = (Button) findViewById(R.id.button_add_students);
        AdditionalButton.setOnClickListener(this);

        String[] StudentsListArray = {"Бойко Виктория", "Астапов Владимир"};
        Arrays.sort(StudentsListArray);


        // получаем элемент ListView
        ListView list_of_students = findViewById(R.id.StudentsList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, StudentsListArray);

        // устанавливаем для списка адаптер
        list_of_students.setAdapter(adapter);
    }

    public void showDialog(View v) {
        AddStudentsDialogFragment dialog = new AddStudentsDialogFragment();
        Bundle args = new Bundle();
        dialog.setArguments(args);
        String str = "";
        dialog.show(getSupportFragmentManager(), "AddStudents");
//        str = dialog.getArguments().getString(StData);
    }

    // реализация метода onClick
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_back_to_groups:
                Intent intent = new Intent(this, GroupList.class);
                startActivity(intent);
                break;
            case R.id.button_add_students:
                Log.v("btn","Pressed AddStud btn");
                //Toast.makeText(getApplicationContext(), "Btn pressed", Toast.LENGTH_LONG).show();
                showDialog(v);
                break;
        }
    }
}

