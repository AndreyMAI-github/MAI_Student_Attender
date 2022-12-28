package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DisciplineEdit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast toast = Toast.makeText(getApplicationContext(),
                "selectedItem", Toast.LENGTH_SHORT);
        toast.show();
        Logger.d("DiciplineEdit Created");

        setContentView(R.layout.activity_discipline_edit);
    }
}