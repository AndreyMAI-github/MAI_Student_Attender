package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String tag = "uWu";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Created");
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