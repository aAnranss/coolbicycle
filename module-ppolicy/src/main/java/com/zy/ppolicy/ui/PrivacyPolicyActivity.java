package com.zy.ppolicy.ui;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterActivityPath;
import com.zy.ppolicy.BR;
import com.zy.ppolicy.R;
import com.zy.ppolicy.databinding.ActivityUserPrivacyPolicyBinding;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by 卢文钏 on 2020/3/16
 */
@Route(path = RouterActivityPath.PrivacyPolicy.PAGER_PRIVACY_POLICY)
public class PrivacyPolicyActivity extends BaseActivity<ActivityUserPrivacyPolicyBinding,PrivacyPolicyViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_user_privacy_policy;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
