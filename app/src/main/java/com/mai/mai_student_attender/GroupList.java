package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.ListView;


public class GroupList extends AppCompatActivity {

    /*
    private void setGroupList (String[] groups){
        String[] GroupList = new String[2];
//        for (int i = 0; i < 2; i++){}
        GroupList[0] = "М4О-306Б-20";
        GroupList[1] = "М4О-307Б-20";
    }
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_list);

        String[] GroupListArray = {"М4О-306Б-20", "М4О-307Б-20"};



            // получаем элемент ListView
            ScrollView ScrollGroupList = findViewById(R.id.GroupList);

            // создаем адаптер
            ArrayAdapter<String> adapter = new ArrayAdapter(this,
                    android.R.layout.simple_list_item_1, GroupListArray);

            // устанавливаем для списка адаптер
            ScrollGroupList.setAdapter(adapter);
        }


}

