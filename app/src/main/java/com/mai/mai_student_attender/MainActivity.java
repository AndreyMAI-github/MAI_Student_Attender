package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCalendar;
    private final String tag = "uWu";

    private View.OnClickListener btnHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            (Toast.makeText(getApplicationContext(),"btnCalendarClicked", Toast.LENGTH_LONG)).show();
            Log.i(tag, "Button Clicked");
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Created");

        btnCalendar = findViewById(R.id.bActMainCalendar);
        btnCalendar.setOnClickListener(btnHandler);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, "Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, "Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag, "Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag, "Destroyed");
    }


}

