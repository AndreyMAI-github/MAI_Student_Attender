package com.mai.mai_student_attender;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;
import android.widget.EditText;
import android.widget.TextView;

public class AddStudentsDialogFragment extends DialogFragment {

    private static final String TAG = "AddStudentsDialogFragment";

    public interface OnInputListener {
        void sendInput(String input);
    }
    public OnInputListener mOnInputListener;

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


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.activity_add_stud_dialog, container, false);

        EditText input = view.findViewById(R.id.editTextNameStudent);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override public void onAttach(Context context)
    {
        super.onAttach(context);
        try {
            mOnInputListener = (OnInputListener)getActivity();
        }
        catch (ClassCastException e) {}
    }

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

//        String str = getArguments().toString();
        String str;

//        final EditText input = new EditText(getActivity());
//        builder.setView(input);


//        getActivity().getParent().getClass().getMethods();
//        ((GroupEditor)getActivity()).pushStud();

        return builder
                .setTitle("Добавление студента")
                .setView(R.layout.activity_add_stud_dialog)
                .setPositiveButton("Добавить",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String str = ""; //input.getText().toString();
                                mOnInputListener.sendInput(str);
                            }
                        })
                .setNegativeButton("Отмена", null)
                .create();

    }
}


