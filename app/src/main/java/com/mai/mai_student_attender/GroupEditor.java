package com.mai.mai_student_attender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import static com.mai.mai_student_attender.AddStudentsDialogFragment.*;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GroupEditor extends AppCompatActivity implements OnInputListener {

    private List<String> StudentsListArray = new ArrayList<String>();   // создаем список студентов
    private ArrayAdapter<String> adapter;   // создаем адаптер


    private void setHeaderTextName(String str){
        TextView textView = (TextView) findViewById(R.id.textNumber_of_group);
        textView.setText(str);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("GroupEditor Created");
        setContentView(R.layout.activity_group_editor);

        // определяем кнопки
        // присваеваем им элементы активити
        Button BackButton = (Button) findViewById(R.id.button_back_to_groups);
        Button AdditionalButton = (Button) findViewById(R.id.button_add_students);

        // получаем элемент ListView
        ListView list_of_students = findViewById(R.id.StudentsList);

        // создаем адаптер ArrayAdapter<String>
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, StudentsListArray);

        // устанавливаем для списка адаптер
        list_of_students.setAdapter(adapter);

        registerForContextMenu(list_of_students);

        BackButton.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getBaseContext(), GroupList.class);
                        startActivity(intent);
                    }
                });
        AdditionalButton.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.v("btn","Pressed AddStud btn");
                        showDialog();
                    }
                });
    }

    public void showDialog() {
        AddStudentsDialogFragment dialog = new AddStudentsDialogFragment();
        dialog.show(getSupportFragmentManager(), "AddStudents");
    }

    @Override
    public void sendInput(String input) {
        StudentsListArray.add(input);
        StudentsListArray.sort(String::compareTo);
//        Toast.makeText(getBaseContext(), "Hello, " + input, Toast.LENGTH_LONG).show();
        adapter.notifyDataSetChanged();
    }

    private static int CM_DELETE_ID = 1;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, CM_DELETE_ID, 0, "Удалить запись");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == CM_DELETE_ID) {
            // получаем инфу о пункте списка
            AdapterView.AdapterContextMenuInfo contMenu = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
            // удаляем объект, используя позицию пункта в списке
            StudentsListArray.remove(contMenu.position);
            // уведомляем, что данные изменились
            adapter.notifyDataSetChanged();
            return true;
        }
        return super.onContextItemSelected(item);
    }
}