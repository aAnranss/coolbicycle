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
public class ServicePolicyViewModel extends BaseViewModel {
    public ServicePolicyViewModel(@NonNull Application application) {
        super(application);
    }

    public BindingCommand returnBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            onBackPressed();
        }
    });
}
