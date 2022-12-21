package com.mai.mai_student_attender.panel_elements.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.mai.mai_student_attender.Logger;
import com.mai.mai_student_attender.R;
import com.mai.mai_student_attender.databinding.FragmentDisciplineBinding;

public class HomeFragment extends Fragment {

    Unit[] units = {
            new Unit("ооп", "10:00", "лк"), //добавить фото
            new Unit("пму", "11:00", "пз"),
            new Unit("схемотехника", "12:00", "лк"),
            new Unit("радиоавтоматика", "13:00", "пз1")
    };


    ListView fragment_homeListView;
    private FragmentDisciplineBinding binding;

    @SuppressLint("MissingInflatedId")
    @Override //
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,
                container, false);


        // получаем элемент ListView
        fragment_homeListView = view.findViewById(R.id.homeList);
        Logger.d("Before return");

        setHomeList(units);

        return view;


    }

    protected void setHomeList(Unit[] discipline) {
        // создаем адаптер
        Logger.d("Adapter");
        if(discipline!= null) {
            UnitAdapter unitAdapter = new UnitAdapter(this.getContext(), units);
            Logger.d("Nuller");
            fragment_homeListView.setAdapter(unitAdapter);
            Logger.d("Set Adapter");
        }
    }
}
