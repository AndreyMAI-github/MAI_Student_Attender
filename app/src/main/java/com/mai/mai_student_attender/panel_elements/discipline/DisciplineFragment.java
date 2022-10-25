package com.mai.mai_student_attender.panel_elements.discipline;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mai.mai_student_attender.databinding.FragmentDisciplineBinding;

public class DisciplineFragment extends Fragment {

    private FragmentDisciplineBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DisciplineViewModel disciplineViewModel =
                new ViewModelProvider(this).get(DisciplineViewModel.class);

        binding = FragmentDisciplineBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDiscipline;
        disciplineViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}