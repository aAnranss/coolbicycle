package com.zy.setting.view;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterActivityPath;
import com.zy.setting.BR;
import com.zy.setting.R;
import com.zy.setting.databinding.ActivitySettiingBinding;
import com.zy.setting.viewmodel.SettingViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by 卢文钏 on 2020/3/18
 */

@Route(path = RouterActivityPath.Setting.PAGER_SETTING)
public class SettingActivity extends BaseActivity<ActivitySettiingBinding, SettingViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_settiing;
    }

    @Override
    public int initVariableId() {
        return BR.settingViewModel;
    }
}
