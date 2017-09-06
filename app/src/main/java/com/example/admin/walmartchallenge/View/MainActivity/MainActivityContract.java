package com.example.admin.walmartchallenge.View.MainActivity;

import android.app.Activity;
import android.content.Context;

import com.example.admin.walmartchallenge.BasePresenter;
import com.example.admin.walmartchallenge.BaseView;
import com.example.admin.walmartchallenge.Model.CurrentObservation;
import com.example.admin.walmartchallenge.Model.HourlyForecastOrdered;

import java.util.List;

public interface MainActivityContract {
    interface View extends BaseView{
        void getZipCode(String zipCode);
        void currentWeather(CurrentObservation weather);
        void nextWeather(List<HourlyForecastOrdered> hourlyForecastOrdered);
    }
    interface Presenter extends BasePresenter<View> {
        void init(Activity activity);
        void getContext(Context context);
        void getLocation();
        void restCall(String zipCode,Boolean flag);
    }

}
