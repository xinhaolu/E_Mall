package com.bwie.e_mall.mvp.HomeMvp;

import com.bwie.e_mall.net.CallBack;

public class IHomePresenter implements IHomeContract.IHomePresenter {
    private IHomeContract.IHomeModel model;
    private IHomeContract.IHomeView view;
    @Override
    public void attach(IHomeContract.IHomeView view) {
        this.view=view;
        model=new IHomeModel();
    }

    @Override
    public void detach() {
            if (view!=null){
                view=null;
            }
            if (model!=null){
                model=null;
            }
            System.gc();
    }

    @Override
    public void getHome(String url) {
        model.doHttpGet(url, new CallBack() {
            @Override
            public void success(String s) {
                view.showHome(s);
            }

            @Override
            public void error(String msg) {

            }
        });
    }

    @Override
    public void getBanner(String url) {
        model.doHttpGet(url, new CallBack() {
            @Override
            public void success(String s) {
                view.showBanner(s);
            }

            @Override
            public void error(String msg) {

            }
        });
    }
}
