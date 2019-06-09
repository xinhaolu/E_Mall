package com.bwie.e_mall.mvp.HomeMvp;

import com.bwie.e_mall.net.CallBack;

public interface IHomeContract {
    interface IHomeView{
        void showHome(String s);
        void showBanner(String s);
    }
    interface IHomeModel{
        void doHttpGet(String url, CallBack callBack);
    }
    interface IHomePresenter{
        void attach(IHomeView view);
        void detach();
        void getHome(String url);
        void getBanner(String url);
    }
}
