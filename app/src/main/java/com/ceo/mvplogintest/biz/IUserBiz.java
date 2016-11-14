package com.ceo.mvplogintest.biz;

/**
 * @author：${} on 2016/9/26 17:14
 * @emal：
 * @projectName: MVPLoginTest
 * @date: 2016-09-26
 * @time: 17:14
 */
public interface IUserBiz {
    public void login(String username,String password,OnLoginListener loginListener);
}
