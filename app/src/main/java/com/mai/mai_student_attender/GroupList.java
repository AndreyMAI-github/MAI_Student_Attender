package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.ListView;


public class GroupList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("GroupList Created");

//        setContentView(R.layout.activity_group_list);
        setContentView(R.layout.fragment_groups);

    }

}

