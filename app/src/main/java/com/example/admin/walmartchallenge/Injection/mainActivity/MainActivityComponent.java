package com.example.admin.walmartchallenge.Injection.mainActivity;

import com.example.admin.walmartchallenge.View.MainActivity.MainActivity;

import dagger.Component;

@Component(modules = MainActivityModule.class)
public interface  MainActivityComponent {

    void inject(MainActivity mainActivity);
}

