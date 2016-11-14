package com.ceo.mvplogintest.view;

import com.ceo.mvplogintest.bean.User;

/**
 * @author：${} on 2016/9/26 17:28
 * @emal：
 * @projectName: MVPLoginTest
 * @date: 2016-09-26
 * @time: 17:28
 */
public interface IUserLoginView {

    //获取用户名和密码
    String getUserName();
    String getPassWord();
    //清除用户名和密码
    void clearUserName();
    void clearPassWord();
    //显示或隐藏登陆状态
    void showLoading();
    void hideLoading();
    //登陆成功跳转或信息提醒失败
    void toMainActivity(User user);
    void showFailedError();


}
