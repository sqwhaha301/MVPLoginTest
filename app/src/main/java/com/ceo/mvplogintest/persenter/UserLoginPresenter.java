package com.ceo.mvplogintest.persenter;

import android.os.Handler;

import com.ceo.mvplogintest.bean.User;
import com.ceo.mvplogintest.biz.IUserBiz;
import com.ceo.mvplogintest.biz.OnLoginListener;
import com.ceo.mvplogintest.biz.UserBiz;
import com.ceo.mvplogintest.view.IUserLoginView;

/**
 * @author：${} on 2016/9/26 17:14
 * @emal：
 * @projectName: MVPLoginTest
 * @date: 2016-09-26
 * @time: 17:14
 */
public class UserLoginPresenter {

    private IUserBiz userBiz;
    private IUserLoginView userLoginView;
    private Handler mHandler = new Handler();


    public UserLoginPresenter(){

    }
    public UserLoginPresenter(IUserLoginView userLoginView){
        this.userLoginView = userLoginView;
        this.userBiz = new UserBiz();

    }
    public void login()
    {
        userLoginView.showLoading();
        userBiz.login(userLoginView.getUserName(), userLoginView.getPassWord(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.toMainActivity(user);
                        userLoginView.hideLoading();
                    }
                });
            }

            @Override
            public void loginFailed() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.showFailedError();
                        userLoginView.hideLoading();
                    }
                });
            }
        });
    }
    public void clear()
    {
        userLoginView.clearUserName();
        userLoginView.clearPassWord();
    }

}
