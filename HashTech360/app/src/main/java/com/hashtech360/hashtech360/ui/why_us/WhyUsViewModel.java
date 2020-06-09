package com.hashtech360.hashtech360.ui.why_us;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WhyUsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WhyUsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}