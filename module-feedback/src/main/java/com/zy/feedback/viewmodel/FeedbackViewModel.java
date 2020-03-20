package com.zy.feedback.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by 卢文钏 on 2020/3/18
 */
public class FeedbackViewModel extends BaseViewModel {

    private ObservableField<String> feedbackContent = new ObservableField<>("");

    public FeedbackViewModel(@NonNull Application application) {
        super(application);
    }
    //返回键的点击按钮
    public BindingCommand returnBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            onBackPressed();
        }
    });

    //提交按钮的点击事件
    public BindingCommand submitBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ToastUtils.showShort("提交成功！");
        }
    });



}
