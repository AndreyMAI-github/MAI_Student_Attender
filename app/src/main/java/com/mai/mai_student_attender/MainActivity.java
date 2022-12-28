package com.mai.mai_student_attender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("MainActivity Created");

        setContentView(R.layout.activity_main);

    }

}
    /*@Override
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

}*/

