package com.zy.user.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zy.base.contract._Login;
import com.zy.base.globle.SPKeyGlobal;
import com.zy.base.router.RouterActivityPath;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.RxBus;
import me.goldze.mvvmhabit.bus.RxSubscriptions;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.utils.SPUtils;
/**
 * Created by 卢文钏 on 2020/3/3
 */
public class MeViewModel extends BaseViewModel {

    public SingleLiveEvent<String> itemClickEvent = new SingleLiveEvent<>();

    public ObservableInt loginBtnVisible = new ObservableInt();
    public ObservableField<String> userInfoObservable = new ObservableField();
    private Disposable subscribe;

    public MeViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        initData();
    }

    public void initData() {
        String userInfo = SPUtils.getInstance().getString(SPKeyGlobal.USER_INFO);
        if (!TextUtils.isEmpty(userInfo)) {
            userInfoObservable.set(userInfo);
            loginBtnVisible.set(View.GONE);
        } else {
            loginBtnVisible.set(View.VISIBLE);
        }
    }

    //登录按钮点击事件
    public BindingCommand startLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //采用ARouter+RxBus实现组件间通信
            ARouter.getInstance().build(RouterActivityPath.Sign.PAGER_LOGIN).navigation();
            subscribe = RxBus.getDefault().toObservable(_Login.class)
                    .subscribe(new Consumer<_Login>() {
                        @Override
                        public void accept(_Login l) throws Exception {
                            //登录成功后重新刷新数据
                            initData();
                            //解除注册
                            RxSubscriptions.remove(subscribe);
                        }
                    });
            RxSubscriptions.add(subscribe);
        }
    });

    public BindingCommand feedbackBtnOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance()
                    .build(RouterActivityPath.Feedback.PAGER_FEEDBACK)
                    .navigation();
        }
    });


    //设置按钮的点击事件
    public BindingCommand settingBtnOnCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance()
                    .build(RouterActivityPath.Setting.PAGER_SETTING)
                    .navigation();
        }
    });








}
