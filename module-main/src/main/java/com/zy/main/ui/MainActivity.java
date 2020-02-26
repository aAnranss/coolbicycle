package com.zy.main.ui;

import android.os.Bundle;

import com.zy.main.BR;
import com.zy.main.R;
import com.zy.main.databinding.ActivityMainBinding;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * Created by 卢文钏 on 2020/2/26
 */
public class MainActivity extends BaseActivity<ActivityMainBinding, BaseViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {

        //初始化fragment
        initFragment();
        //初始化底部导航栏
        initBottomTab();
    }

    private void initFragment() {


    }

    private void initBottomTab() {



    }
}
