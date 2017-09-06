package com.example.admin.walmartchallenge.Injection.settingsactivity;

import com.example.admin.walmartchallenge.View.SettingsActivity.SettingsActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class SettingsActivityModule {

    @Provides
    SettingsActivityPresenter providerSettingsActivityPresenter(){
        return new SettingsActivityPresenter();
    }
}
