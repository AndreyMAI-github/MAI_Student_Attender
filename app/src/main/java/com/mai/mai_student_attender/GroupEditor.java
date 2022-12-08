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

    List<String> StudentsListArray = new ArrayList<String>();   // создаем список студентов

    ArrayAdapter<String> adapter;   // создаем адаптер

    // определяем кнопку BackButton
    // присваеваем ей активити в качестве обработчика
    Button BackButton;
    Button AdditionalButton;

    public String mInput;

    private void setStarterPack() {
        StudentsListArray.add("Бойко Виктория");
        StudentsListArray.add("Астапов Владимир");
        StudentsListArray.sort(String::compareTo);
    }

    private void setHeaderTextName(String str){
        TextView textView = (TextView) findViewById(R.id.textNumber_of_group);
        textView.setText(str);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("GroupEditor Created");

        setContentView(R.layout.activity_group_editor);

        setStarterPack();

        BackButton = (Button) findViewById(R.id.button_back_to_groups);

        AdditionalButton = (Button) findViewById(R.id.button_add_students);

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
                }
        );
        AdditionalButton.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.v("btn","Pressed AddStud btn");
                        showDialog();
                    }
                }
        );
    }

    public void showDialog() {
        AddStudentsDialogFragment dialog = new AddStudentsDialogFragment();
        Bundle args = new Bundle();
        dialog.setArguments(args);
        String str = "";
        dialog.show(getSupportFragmentManager(), "AddStudents");
    }

    @Override
    public void sendInput(String input) {
        StudentsListArray.add(input);
        StudentsListArray.sort(String::compareTo);
//        Toast.makeText(getBaseContext(), "Hello, " + input, Toast.LENGTH_LONG).show();
        adapter.notifyDataSetChanged();
    }

    private static final int CM_DELETE_ID = 1;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, CM_DELETE_ID, 0, "Удалить запись");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == CM_DELETE_ID) {
            // получаем инфу о пункте списка
            AdapterView.AdapterContextMenuInfo acmi = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
            // удаляем объект из коллекции, используя позицию пункта в списке
            StudentsListArray.remove(acmi.position);
            StudentsListArray.sort(String::compareTo);
            // уведомляем, что данные изменились
            adapter.notifyDataSetChanged();
            return true;
        }
        return super.onContextItemSelected(item);
    }
}


//a {
//        package com.mai.mai_student_attender;
//
//        import androidx.appcompat.app.AppCompatActivity;
//
//        import static com.mai.mai_student_attender.AddStudentsDialogFragment.*;
//
//        import android.app.DialogFragment;
//        import android.os.Bundle;
//        import android.util.Log;
//        import android.widget.ArrayAdapter;
//        import android.widget.ListView;
//        import android.view.View;
//        import android.widget.Button;
//        import android.view.View.OnClickListener;
//        import android.content.Intent;
//        import android.widget.SimpleAdapter;
//        import android.widget.TextView;
//        import android.widget.Toast;
//
//        import java.lang.reflect.Array;
//        import java.util.Arrays;
//        import androidx.annotation.NonNull;
//
//        import android.app.AlertDialog;
//        import android.app.Dialog;
//
//
//public class GroupEditor extends AppCompatActivity implements OnInputListener {
////public class GroupEditor extends AppCompatActivity implements OnClickListener {
//
//    private String[] StudentsListArray = {"Бойко Виктория", "Астапов Владимир"};
////    private ArrayAdapter<String> StudentsListArray;
//
////    private void setStarterPack() {
////        StudentsListArray.add("Бойко Виктория");
////        StudentsListArray.add("Астапов Владимир");
////        StudentsListArray.sort(String::compareTo);
////    }
//
//    // создаем адаптер
//    ArrayAdapter<String> adapter; // = new ArrayAdapter(this,
////            android.R.layout.simple_list_item_1, StudentsListArray);
//
//    public void pushStud(String st){
//        int len = StudentsListArray.length;
//        String[] NewList = new String[len + 1];
//        for (int i = 0; i < len-1; i++) {
//            NewList[i] = StudentsListArray[i];
//        }
//        NewList[len] = st;
//        StudentsListArray = NewList;
//
//        Toast.makeText(getBaseContext(),
//                "Arr[0]= " + StudentsListArray[0] + "\nArr[n]= " + StudentsListArray[len],
//                Toast.LENGTH_LONG).show();
//    }
//
//    private void setHeaderTextName(String str){
//        TextView textView = (TextView) findViewById(R.id.textNumber_of_group);
//        textView.setText(str);
//    }
//
//    // определяем кнопку BackButton
//    // присваеваем ей активити в качестве обработчика
//    Button BackButton;
//    Button AdditionalButton;
//
//    public String mInput;
//
////    private void addS(){
////        // получаем элемент ListView
////        ListView list_of_students = findViewById(R.id.StudentsList);
////
////        // создаем адаптер
////        ArrayAdapter<String> adapter = new ArrayAdapter(this,
////                android.R.layout.simple_list_item_1, StudentsListArray);
////
////        // устанавливаем для списка адаптер
////        list_of_students.setAdapter(adapter);
////    }
//
////    public void add(){
////        String user = mInput;
////        if(!user.isEmpty()){
////            adapter.add(user);
////            adapter.notifyDataSetChanged();
////        }
////    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        Logger.d("GroupEditor Created");
//
//        setContentView(R.layout.activity_group_editor);
//
////        setStarterPack();
//
//        BackButton = (Button) findViewById(R.id.button_back_to_groups);
////        BackButton.setOnClickListener(this);
//
//        AdditionalButton = (Button) findViewById(R.id.button_add_students);
////        AdditionalButton.setOnClickListener(this);
//
//        Arrays.sort(StudentsListArray);
////        String[] StudentsListArray = {"Бойко Виктория", "Астапов Владимир"};
////        Arrays.sort(StudentsListArray);
//
//
//        // получаем элемент ListView
//        ListView list_of_students = findViewById(R.id.StudentsList);
//
////        // создаем адаптер ArrayAdapter<String>
//        adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1, StudentsListArray);
//
//        // устанавливаем для списка адаптер
//        list_of_students.setAdapter(adapter);
//
//
//
//        BackButton.setOnClickListener(
//                new OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Intent intent = new Intent(getBaseContext(), GroupList.class);
//                        startActivity(intent);
//                    }
//                }
//        );
//        AdditionalButton.setOnClickListener(
//                new OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Log.v("btn","Pressed AddStud btn");
//                        //Toast.makeText(getApplicationContext(), "Btn pressed", Toast.LENGTH_LONG).show();
//                        showDialog();
//                    }
//                }
//        );
//    }
//
//    public void showDialog() {
//        AddStudentsDialogFragment dialog = new AddStudentsDialogFragment();
//        Bundle args = new Bundle();
//        dialog.setArguments(args);
//        String str = "";
//        dialog.show(getSupportFragmentManager(), "AddStudents");
////        str = dialog.getArguments().getString(StData);
//    }
//
//    // реализация метода onClick
////    @Override
////    public void onClick(View v) {
////        switch (v.getId()) {
////            case R.id.button_back_to_groups:
////                Intent intent = new Intent(this, GroupList.class);
////                startActivity(intent);
////                break;
////            case R.id.button_add_students:
////                Log.v("btn","Pressed AddStud btn");
////                //Toast.makeText(getApplicationContext(), "Btn pressed", Toast.LENGTH_LONG).show();
////                showDialog(v);
////                break;
////        }
////    }
//
//    @Override
//    public void sendInput(String input) {
//        pushStud(input);
////        Toast.makeText(getBaseContext(), "Hello, " + input, Toast.LENGTH_LONG).show();
//// а что если не обновлять адаптер, а пересоздавать его?
//// При получении строки вызывался бы new Adapter...
//        adapter.notifyDataSetChanged();
//    }
//}
//        }