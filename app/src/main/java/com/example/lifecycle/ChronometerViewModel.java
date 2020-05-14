package com.example.lifecycle;

import android.content.Context;

import androidx.lifecycle.ViewModel;



public class ChronometerViewModel extends ViewModel {
    private Long mStartTime;

    public Long getStartTime() {
        return mStartTime;
    }

    public void setStartTime(final Long startTime){
        this.mStartTime = startTime;
    }
}
