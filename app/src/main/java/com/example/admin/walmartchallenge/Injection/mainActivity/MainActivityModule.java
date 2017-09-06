package com.example.admin.walmartchallenge.Injection.mainActivity;

import com.example.admin.walmartchallenge.View.MainActivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;


@Module
public class MainActivityModule {

    @Provides
    MainActivityPresenter providerMainActivityPresenter(){return new MainActivityPresenter();
    }
}
