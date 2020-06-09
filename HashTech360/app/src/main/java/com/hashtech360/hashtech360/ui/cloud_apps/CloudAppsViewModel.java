package com.hashtech360.hashtech360.ui.cloud_apps;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CloudAppsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CloudAppsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}