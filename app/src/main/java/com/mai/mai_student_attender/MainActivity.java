package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.mai.mai_student_attender.panel_elements.UnitAdapter;

public class MainActivity extends AppCompatActivity {

    private Button btnCalendar;
    private final String tag = "uWu";

    private View.OnClickListener btnHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Logger.d("Button btnCalendar clicked");
            (Toast.makeText(getApplicationContext(),"btnCalendarClicked", Toast.LENGTH_LONG)).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("MainActivity Created");

        setContentView(R.layout.activity_main);
        btnCalendar = findViewById(R.id.bActMainCalendar);
        btnCalendar.setOnClickListener(btnHandler);

        ListView home_list = (ListView) findViewById(R.id.home_list);

        Unit[] units = {
                new Unit("а", "10", "1"), //добавить фото
                new Unit("б", "11", "2"),
                new Unit("в", "12", "2"),
                new Unit("г", "13", "1")
        };

        UnitAdapter unitAdapter = new UnitAdapter(this, units);
        home_list.setAdapter(unitAdapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.d("MainActivity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("MainActivity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d("MainActivity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("MainActivity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.d("MainActivity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("MainActivity Destroyed");
    }

}

