package com.zy.register.ui;

import android.app.Application;
import android.text.TextUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zy.base.router.RouterActivityPath;


import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by 卢文钏 on 2020/3/4
 */
public class RegisterViewModel extends BaseViewModel {


    //用户名的绑定
    public ObservableField<String> userName = new ObservableField<>("");
    //密码的绑定
    public ObservableField<String> password = new ObservableField<>("");
    //用户名的绑定
    public ObservableField<String> verificationCode = new ObservableField<>("");
    //密码的绑定
    public ObservableField<String> phoneNumber = new ObservableField<>("");

    public RegisterViewModel(@NonNull Application application) {
        super(application);
    }

    //对顶部导航栏的返回按钮的点击事件
    public BindingCommand returnBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            toLogin();
        }
    });

    public BindingCommand registerOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            register();
        }
    });

    //用户服务协议按钮的点击事件
    public BindingCommand servicePolicyBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance()
                    .build(RouterActivityPath.ServicePolicy.PAGER_SERVICE_POLICY)
                    .navigation();
        }
    });

    //隐私政策按钮的点击事件
    public BindingCommand privacyPolicyBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance()
                    .build(RouterActivityPath.PrivacyPolicy.PAGER_PRIVACY_POLICY)
                    .navigation();
        }
    });

    //注册
    private void register() {

        if (TextUtils.isEmpty(userName.get())) {
            ToastUtils.showShort("请输入账号!");
            return;
        }
        if (TextUtils.isEmpty(password.get())) {
            ToastUtils.showShort("请输入密码!");
            return;
        }
        if (TextUtils.isEmpty(verificationCode.get())) {
            ToastUtils.showShort("请输入验证码!");
            return;
        }
        if (TextUtils.isEmpty(phoneNumber.get())) {
            ToastUtils.showShort("请输入手机号!");
            return;
        }

        //跳转至登陆页
        toLogin();
        finish();
    }

    //跳转至登录页
    private void toLogin() {
        //跳转至登陆页
        ARouter.getInstance()
                .build(RouterActivityPath.Sign.PAGER_LOGIN)
                .navigation();
        finish();
    }
}
