package com.zy.setting.view;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterActivityPath;
import com.zy.setting.BR;
import com.zy.setting.R;
import com.zy.setting.databinding.ActivityAboutBinding;
import com.zy.setting.viewmodel.AboutViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by 卢文钏 on 2020/3/18
 */
@Route(path = RouterActivityPath.About.PAGER_ABOUT)
public class AboutActivity extends BaseActivity<ActivityAboutBinding, AboutViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_about;
    }

    @Override
    public int initVariableId() {
        return BR.settingViewModel;
    }
}
