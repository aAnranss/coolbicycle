package com.zy.setting.viewmodel;

import android.app.Application;
import android.content.pm.PackageInfo;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

/**
 * Created by 卢文钏 on 2020/3/18
 */
public class AboutViewModel extends BaseViewModel {

    //获取包信息
    private PackageInfo packageInfo = new PackageInfo();

    //版本号的绑定
    public ObservableField<String> versionInfo = new ObservableField<>(packageInfo.versionName);

    public AboutViewModel(@NonNull Application application) {
        super(application);
    }

    //返回按钮的点击事件
    public BindingCommand returnBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            onBackPressed();
        }
    });

    //版本检查
    public BindingCommand versionCheckBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //检查是否有新版本
        }
    });
}
