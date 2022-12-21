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

    public interface OnInputListener {
        void sendInput(String input);
    }
    public OnInputListener mOnInputListener;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.activity_add_stud_dialog, container, false);
        Button mActionOk, mActionCancel;
        EditText mInput;
        mActionCancel = view.findViewById(R.id.buttoncancel);
        mActionOk = view.findViewById(R.id.buttonaddstud);
        mInput = view.findViewById(R.id.editTextNameStudent);

        mActionCancel.setOnClickListener(
                new View.OnClickListener() {
                    @Override public void onClick(View v)
                    {
                        Log.d("AddStudentsDialogFragment", "onClick: closing dialog");
                        getDialog().dismiss();
                    }
                });

        mActionOk.setOnClickListener(
                new View.OnClickListener() {
                    @Override public void onClick(View v)
                    {
                        Log.d("AddStudentsDialogFragment", "onClick: capturing input");
                        String input = mInput.getText().toString();
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
            mOnInputListener = (OnInputListener)getActivity();
        }
        catch (ClassCastException e) {
            Log.e("AddStudentsDialogFragment",
                    "onAttach: ClassCastException: " + e.getMessage());
        }
    }
}
