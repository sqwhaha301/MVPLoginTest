package com.ceo.mvplogintest.biz;

import com.ceo.mvplogintest.bean.User;

/**
 * @author：${} on 2016/9/26 17:15
 * @emal：
 * @projectName: MVPLoginTest
 * @date: 2016-09-26
 * @time: 17:15
 */
public interface OnLoginListener {

    void loginSuccess(User user);
    void loginFailed();


}
