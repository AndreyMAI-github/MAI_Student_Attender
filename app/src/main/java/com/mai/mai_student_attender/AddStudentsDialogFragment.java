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

        final EditText input = new EditText(getActivity());
        builder.setView(input);

        return builder
                .setTitle("Добавление студента")
                .setView(R.layout.activity_add_stud_dialog)
                .setPositiveButton("Добавить", null)

        .setNegativeButton("Отмена", null)
                .create();

    }
}
 /*new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String val = input.getText().toString();
                    }

                });*/
 /*
    public String input;

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = LayoutInflater.from(this.getContext());
        View textenter = inflater.inflate(R.layout.dialog_view, null);
        EditText userinput = (EditText) textenter.findViewById(R.id.dialView_text2);

        builder
                .setTitle("Диалоговое окно")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setView(R.layout.dialog_view);
//                .setMessage("Для закрытия окна нажмите ОК")
        userinput.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN && (i == KeyEvent.KEYCODE_ENTER)) {
                    input = userinput.getText().toString();
                    Toast.makeText(getContext(), "ooo", Toast.LENGTH_SHORT).show();
                    return true;
                }
                input = "";
                Toast.makeText(getContext(), "---", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        Button btn1 = (Button) textenter.findViewById(R.id.dialView_btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Die!", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getContext(), "Hello "+input, Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Отмена", null);

        return builder.create();
    }
*/