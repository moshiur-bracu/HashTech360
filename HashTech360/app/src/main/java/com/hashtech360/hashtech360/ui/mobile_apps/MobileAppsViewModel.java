package com.hashtech360.hashtech360.ui.mobile_apps;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MobileAppsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MobileAppsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}