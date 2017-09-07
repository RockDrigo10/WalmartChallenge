package com.example.admin.walmartchallenge;


public interface BasePresenter <V extends BaseView> {
    void attachView(V view);
    void detachView();
    
}
