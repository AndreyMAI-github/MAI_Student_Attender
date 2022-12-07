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
import android.widget.Toast;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class AddStudentsDialogFragment extends DialogFragment {

    private static final String TAG = "AddStudentsDialogFragment";

//    public interface OnInputListener {
//        void sendInput(String input);
//    }
//    public OnInputListener mOnInputListener;
//
///*
//    OnClickListener okClicker = new OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            AddStudentsDialogFragment dialog = new AddStudentsDialogFragment();
//            Intent intent = new Intent(this, GroupEditor.);
//            Bundle args = new Bundle();
//            dialog.setArguments(args);
////            setArguments(args);
//        }
//    };
//
// */
//
////    final AddStudentsDialogFragment context = this;
////    private Button addbutton;
////    private EditText result;
////
////    @Override
////    public void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_add_stud_dialog);
////
////        addbutton = (Button) findViewById(R.id.addbutton);
////        result = (EditText) findViewById(R.id.editTextNameStudent);
////    }
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(
//                R.layout.activity_add_stud_dialog, container, false);
//
//        EditText input = view.findViewById(R.id.editTextNameStudent);
//
//        return super.onCreateView(inflater, container, savedInstanceState);
//    }
//
//    @Override public void onAttach(Context context)
//    {
//        super.onAttach(context);
//        try {
//            mOnInputListener = (OnInputListener)getActivity();
//        }
//        catch (ClassCastException e) {}
//    }
//
//    @NonNull
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//
////        String str = getArguments().toString();
////        EditText in = ;
//
//
////        final EditText input = new EditText(getActivity());
////        builder.setView(input);
//
//
////        getActivity().getParent().getClass().getMethods();
////        ((GroupEditor)getActivity()).pushStud();
//
//        return builder
//                .setTitle("Добавление студента")
//                .setView(R.layout.activity_add_stud_dialog)
//                .setPositiveButton("Добавить",
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                String str = in.getText().toString();
//                                Toast.makeText(getContext(), "It's me, " + str, Toast.LENGTH_SHORT).show();
//                                mOnInputListener.sendInput(str);
//                            }
//                        })
//                .setNegativeButton("Отмена", null)
//                .create();
//
//    }
//}
//
//

//        extends android.app.DialogFragment {

//    private static final String TAG = "DialogFragment";

    public interface OnInputListener {
        void sendInput(String input);
    }
    public OnInputListener mOnInputListener;

    private EditText mInput;
    private TextView mActionOk, mActionCancel;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(
                R.layout.activity_add_stud_dialog, container, false);
        mActionCancel
                = view.findViewById(R.id.buttoncancel);
        mActionOk = view.findViewById(R.id.buttonaddstud);
        mInput = view.findViewById(R.id.editTextNameStudent);

        mActionCancel.setOnClickListener(
                new View.OnClickListener() {
                    @Override public void onClick(View v)
                    {
                        Log.d(TAG, "onClick: closing dialog");
                        getDialog().dismiss();
                    }
                });

        mActionOk.setOnClickListener(
                new View.OnClickListener() {
                    @Override public void onClick(View v)
                    {
                        Log.d(TAG, "onClick: capturing input");
                        String input
                                = mInput.getText().toString();
                        mOnInputListener.sendInput(input);
                        getDialog().dismiss();
                    }
                });

        return view;
    }

    @Override public void onAttach(Context context)
    {
        super.onAttach(context);
        try {
            mOnInputListener
                    = (OnInputListener)getActivity();
        }
        catch (ClassCastException e) {
            Log.e(TAG, "onAttach: ClassCastException: "
                    + e.getMessage());
        }
    }
}
