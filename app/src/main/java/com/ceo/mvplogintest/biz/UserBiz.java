package com.ceo.mvplogintest.biz;

import com.ceo.mvplogintest.bean.User;

/**
 * @author：${} on 2016/9/26 17:15
 * @emal：
 * @projectName: MVPLoginTest
 * @date: 2016-09-26
 * @time: 17:15
 */
public class UserBiz implements IUserBiz {
    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {

        //模拟子线程耗时操作
        new Thread(){

            public void run()
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //模拟登陆成功
                if("sunqiwen".equals(username)&&"123456".equals(password))
                {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    loginListener.loginSuccess(user);
                }
                else
                {
                    loginListener.loginFailed();
                }



            }

        }.start();



    }
}
