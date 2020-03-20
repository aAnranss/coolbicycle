package com.zy.sign.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zy.base.router.RouterActivityPath;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by 卢文钏 on 2020/3/19
 */
public class FindPasswordViewModel extends BaseViewModel {
    public FindPasswordViewModel(@NonNull Application application) {
        super(application);
    }

    //顶部返回键的点击事件
    public BindingCommand returnBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            onBackPressed();
        }
    });

    public BindingCommand getCodeBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ToastUtils.showShort("验证码：HHHH");
        }
    });

    public BindingCommand findpasswrodCommitBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ToastUtils.showShort("完成");
            ARouter.getInstance()
                    .build(RouterActivityPath.Sign.PAGER_LOGIN)
                    .navigation();
            finish();
        }
    });
}
