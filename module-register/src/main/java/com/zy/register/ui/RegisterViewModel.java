package com.zy.register.ui;

import android.app.Application;

import androidx.annotation.NonNull;

import com.zy.sign.ui.LoginActivity;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

/**
 * Created by 卢文钏 on 2020/3/4
 */
public class RegisterViewModel extends BaseViewModel {

    public RegisterViewModel(@NonNull Application application) {
        super(application);
    }

    public BindingCommand returnBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            toLogin();
        }
    });

    private void toLogin() {
        startActivity(LoginActivity.class);
        finish();
    }
}
