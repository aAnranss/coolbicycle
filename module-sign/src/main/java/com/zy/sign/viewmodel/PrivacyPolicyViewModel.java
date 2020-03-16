package com.zy.sign.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zy.base.router.RouterActivityPath;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

/**
 * Created by 卢文钏 on 2020/3/16
 */
public class PrivacyPolicyViewModel extends BaseViewModel {
    public PrivacyPolicyViewModel(@NonNull Application application) {
        super(application);
    }

    //返回键的点击事件
    public BindingCommand returnBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //返回上一页
            onBackPressed();
        }
    });
}
