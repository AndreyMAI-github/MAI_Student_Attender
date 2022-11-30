package com.mai.mai_student_attender.panel_elements.discipline;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DisciplineViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DisciplineViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is discipline fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}