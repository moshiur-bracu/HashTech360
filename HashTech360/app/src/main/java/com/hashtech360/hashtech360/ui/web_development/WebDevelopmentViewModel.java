package com.hashtech360.hashtech360.ui.web_development;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WebDevelopmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WebDevelopmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}