package com.mai.mai_student_attender.panel_elements.discipline;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.widget.Toast;
import android.content.Intent;
import android.widget.AdapterView;

import com.mai.mai_student_attender.R;
import com.mai.mai_student_attender.Logger;
import com.mai.mai_student_attender.DisciplineEdit;
import com.mai.mai_student_attender.databinding.FragmentDisciplineBinding;

public class DisciplineFragment extends Fragment {
    //сделать переход в DisciplineEdit

    EnterDiscip[] dusts = {
            new EnterDiscip("OOP"), //добавить фото
            new EnterDiscip("PMU")
    };

    ListView fragment_disciplineListView;
    private FragmentDisciplineBinding binding;

    @SuppressLint("MissingInflatedId")
    @Override //
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discipline,
                container, false);


        // получаем элемент ListView
        fragment_disciplineListView = view.findViewById(R.id.disciplineList);
        Logger.d("Before return");

        setDisciplineList(dusts);

        fragment_disciplineListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View fragment_homeListView, int pos, long id) {
                String selectedItem = dusts[pos].getDiscipline();
                Intent intent = new Intent(getContext(), DisciplineEdit.class);
                intent.putExtra("name", selectedItem);
                startActivity(new Intent(getContext(), DisciplineEdit.class));
                startActivity(intent);
            }
        });

        return view;

    }

    protected void setDisciplineList(EnterDiscip[] discipline) {
        // создаем адаптер
        Logger.d("Adapter");
        if (discipline != null) {
            EnterDiscipAda dustAdapter = new EnterDiscipAda(this.getContext(), dusts);
            // устанавливаем для списка адаптер
            Logger.d("Nuller");
            fragment_disciplineListView.setAdapter(dustAdapter);
            Logger.d("Set Adapter");
        }

    }
}
