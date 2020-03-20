package com.zy.sign.view;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterActivityPath;
import com.zy.sign.BR;
import com.zy.sign.R;
import com.zy.sign.databinding.ActivityRegisterBinding;
import com.zy.sign.viewmodel.RegisterViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by 卢文钏 on 2020/3/4
 */
@Route(path = RouterActivityPath.Register.PAGER_REGISTER)
public class RegisterActivity extends BaseActivity<ActivityRegisterBinding, RegisterViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_register;
    }

    @Override
    public int initVariableId() {
        return BR.registerViewModel;
    }


}
