package com.zy.base.contract;

/**
 * Created by 卢文钏 on 2020/2/26
 * 登录完成后，组件间通信的契约类
 */
public class _Login {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
