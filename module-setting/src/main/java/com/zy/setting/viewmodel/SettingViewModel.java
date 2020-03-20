package com.zy.setting.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zy.base.globle.SPKeyGlobal;
import com.zy.base.router.RouterActivityPath;
import com.zy.base.router.RouterFragmentPath;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.utils.SPUtils;

/**
 * Created by 卢文钏 on 2020/3/18
 */
public class SettingViewModel extends BaseViewModel {

    public ObservableField<String> userInfoObservable = new ObservableField();

    public SettingViewModel(@NonNull Application application) {
        super(application);
    }

    public BindingCommand returnBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            onBackPressed();
        }
    });

    public void initData() {
        String userInfo = SPUtils.getInstance().getString(SPKeyGlobal.USER_INFO);
        if (!TextUtils.isEmpty(userInfo)) {
            userInfoObservable.set(userInfo);
        } else {

        }
    }

    //用户服务协议的点击事件
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

    //关于按钮的点击事件
    public BindingCommand aboutBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance()
                    .build(RouterActivityPath.About.PAGER_ABOUT)
                    .navigation();
        }
    });

    //退出按钮的点击事件
    public BindingCommand LogoutBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            SPUtils.getInstance().put(SPKeyGlobal.USER_INFO, "");
            initData();
            ARouter.getInstance()
                    .build(RouterFragmentPath.User.PAGER_ME)
                    .navigation();
            finish();
        }
    });


}
