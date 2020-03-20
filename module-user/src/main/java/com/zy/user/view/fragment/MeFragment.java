package com.zy.user.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterFragmentPath;
import com.zy.user.BR;
import com.zy.user.R;
import com.zy.user.databinding.FragmentMeBinding;
import com.zy.user.viewmodel.MeViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * Created by 卢文钏 on 2020/3/3
 */
@Route(path = RouterFragmentPath.User.PAGER_ME)
public class MeFragment extends BaseFragment<FragmentMeBinding, MeViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_me;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
