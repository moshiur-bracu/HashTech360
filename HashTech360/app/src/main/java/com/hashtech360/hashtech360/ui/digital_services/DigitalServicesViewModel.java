package com.hashtech360.hashtech360.ui.digital_services;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DigitalServicesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DigitalServicesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}