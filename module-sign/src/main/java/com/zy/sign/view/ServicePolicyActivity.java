package com.zy.sign.view;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterActivityPath;
import com.zy.sign.BR;
import com.zy.sign.R;
import com.zy.sign.databinding.ActivityUserServicePolicyBinding;
import com.zy.sign.viewmodel.ServicePolicyViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by 卢文钏 on 2020/3/16
 */
@Route(path = RouterActivityPath.ServicePolicy.PAGER_SERVICE_POLICY)
public class ServicePolicyActivity extends BaseActivity<ActivityUserServicePolicyBinding, ServicePolicyViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_user_service_policy;
    }

    @Override
    public int initVariableId() {
        return BR.servicePolicyViewModel;
    }
}
