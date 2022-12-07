package com.mai.mai_student_attender.panel_elements.home;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mai.mai_student_attender.Logger;
import com.mai.mai_student_attender.R;
import com.mai.mai_student_attender.databinding.FragmentDisciplineBinding;

public class HomeFragment extends Fragment {
    // Сначала добавление функциональных кнопок-дисциплин
    // Создание отдельного окна для этого действия, в котором будет вводится название дисциплин,
    // Которые будут преобразовываться в кнопки-дисциплины, с последующим переходом в DisciplineEdit

    String[] disciplineList = {"OOP", "PMU"};

    ListView fragment_homeListView;
    private FragmentDisciplineBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,
                container, false);



        // получаем элемент ListView
        fragment_homeListView = view.findViewById(R.id.homeList);
        Logger.d("Before return");

        setHomeList(disciplineList);

        return view;


    }

    protected void setHomeList(String[] discipline) {
        // создаем адаптер
        Logger.d("Adapter");
        if(discipline!= null) {
            ArrayAdapter adapter = new ArrayAdapter(this.getContext(), android.R.layout.simple_list_item_1, discipline);
            // устанавливаем для списка адаптер                                     simple_list_item_1
            Logger.d("Nuller");
            fragment_homeListView.setAdapter(adapter);
            Logger.d("Set Adapter");
        }
    }
}



//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;

//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.lifecycle.ViewModelProvider;

//import com.mai.mai_student_attender.R;
//import com.mai.mai_student_attender.databinding.FragmentHomeBinding;

//public class HomeFragment extends Fragment {

    //private FragmentHomeBinding binding;

    //public View onCreateView(@NonNull LayoutInflater inflater,
      //                       ViewGroup container, Bundle savedInstanceState) {
       // return
        //inflater.inflate(R.layout.fragment_home,null);

    //}

//}