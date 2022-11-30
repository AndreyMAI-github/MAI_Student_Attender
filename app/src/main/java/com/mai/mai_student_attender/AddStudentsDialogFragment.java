package com.mai.mai_student_attender;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;
import android.widget.EditText;

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

//    final AddStudentsDialogFragment context = this;
//    private Button addbutton;
//    private EditText result;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_stud_dialog);
//
//        addbutton = (Button) findViewById(R.id.addbutton);
//        result = (EditText) findViewById(R.id.editTextNameStudent);
//    }


    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        String str = getArguments().toString();

        final EditText input = new EditText(getActivity());
        builder.setView(input);

        str = input.getText().toString();



//        getActivity().getParent().getClass().getMethods();

        return builder
                .setTitle("Добавление студента")
                .setView(R.layout.activity_add_stud_dialog)
                .setPositiveButton("Добавить", null)

        .setNegativeButton("Отмена", null)
                .create();

    }
}


