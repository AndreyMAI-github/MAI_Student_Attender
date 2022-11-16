package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class GroupList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("GroupList Created");

//        setContentView(R.layout.activity_group_list);
        setContentView(R.layout.fragment_groups);

    }
}