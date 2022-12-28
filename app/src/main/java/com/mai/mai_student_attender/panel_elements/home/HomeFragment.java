package com.mai.mai_student_attender.panel_elements.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.mai.mai_student_attender.Logger;
import com.mai.mai_student_attender.R;
import com.mai.mai_student_attender.StudentAttend;
import com.mai.mai_student_attender.databinding.FragmentDisciplineBinding;
import com.mai.mai_student_attender.databinding.FragmentHomeBinding;

public class HomeFragment<RecycleAdapterDome> extends Fragment {

    Unit[] units = {
            new Unit("ооп", "10:00", "лк"), //добавить фото
            new Unit("пму", "11:00", "пз"),
            new Unit("схемотехника", "12:00", "лк"),
            new Unit("радиоавтоматика", "13:00", "пз1")
    };

    ListView fragment_homeListView;
    private FragmentDisciplineBinding binding;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,
                container, false);

        fragment_homeListView = view.findViewById(R.id.homeList);

        setHomeList(units);

        fragment_homeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View fragment_homeListView, int pos, long id) {
                String selectedItem = units[pos].getDiscipline();
                Intent intent = new Intent(getContext(), StudentAttend.class);
                intent.putExtra("name", selectedItem);
//                startActivity(new Intent(getContext(), StudentAttend.class));
                startActivity(intent);
            }
        });


        return view;
    }



    protected void setHomeList(Unit[] units) {
            UnitAdapter unitAdapter = new UnitAdapter(this.getContext(), units);
            fragment_homeListView.setAdapter(unitAdapter);
    }




//    //public void buttonClickFunction()
//    {
//        fragment_homeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View fragment_homeListView, int position, long id) {
//                String selectedItem = units[position].getDiscipline();
//                Intent intent = new Intent(getContext(), StudentAttend.class);
//                intent.putExtra(selectedItem.getDiscipline().toString());
//                startActivity(new Intent(getContext(), StudentAttend.class));
//
//            }
//        });
//    }






    }



