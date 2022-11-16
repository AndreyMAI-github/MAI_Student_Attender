package com.mai.mai_student_attender;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;


import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class AddStudentsDialogFragment extends DialogFragment {
/*
    OnClickListener okClicker = new OnClickListener() {
        @Override
        public void onClick(View view) {
            AddStudentsDialogFragment dialog = new AddStudentsDialogFragment();
            Intent intent = new Intent(this, GroupEditor.);
            Bundle args = new Bundle();
            dialog.setArguments(args);
//            setArguments(args);
        }
    };

 */

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Добавление студента")
                .setView(R.layout.activity_add_stud_dialog)
                .setPositiveButton("Добавить", )
                .setNegativeButton("Отмена", null)
                .create();
    }



}
