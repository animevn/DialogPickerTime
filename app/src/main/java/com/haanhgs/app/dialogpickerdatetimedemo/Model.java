package com.haanhgs.app.dialogpickerdatetimedemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Model extends ViewModel {

    private MutableLiveData<String> date = new MutableLiveData<>();
    private MutableLiveData<String> time = new MutableLiveData<>();

    public MutableLiveData<String> getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date.setValue(date);
    }

    public MutableLiveData<String> getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time.setValue(time);
    }
}
