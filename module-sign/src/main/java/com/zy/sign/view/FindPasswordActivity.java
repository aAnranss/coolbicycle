package com.zy.sign.view;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterActivityPath;
import com.zy.sign.BR;
import com.zy.sign.R;
import com.zy.sign.databinding.ActivityFindpasswordBinding;
import com.zy.sign.viewmodel.FindPasswordViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by 卢文钏 on 2020/3/19
 */
@Route(path = RouterActivityPath.FindPassword.PAGER_FINDPASSWORD)
public class FindPasswordActivity extends BaseActivity<ActivityFindpasswordBinding, FindPasswordViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_findpassword;
    }

    @Override
    public int initVariableId() {
        return BR.findPasswordViewModel;
    }
}
