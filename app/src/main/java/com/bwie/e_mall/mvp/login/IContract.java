package com.bwie.e_mall.mvp.login;

import com.bwie.e_mall.net.CallBack;

/*
 *@Auther:路鑫豪
 *@Date: 2019/6/9
 *@Time:19:58
 *@Description:${契约接口  }
 * */
public interface IContract {
    interface IView{
        void showLogin(String s);
        void showZhuce(String s);
    }
    interface IModel{
        void doHttpPost(String url, String phone, String pwd, CallBack callBack);
    }
    interface IPresenter{
        void  attach(IView view);
        void  detach();
        void getLogin(String url, String phone, String pwd);
        void getZhuce(String url, String phone, String pwd);
    }
}
