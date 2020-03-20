package com.zy.community.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterFragmentPath;
import com.zy.community.BR;
import com.zy.community.R;
import com.zy.community.databinding.FragmentHotBinding;
import com.zy.community.ui.viewmodel.HotViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * Created by 卢文钏 on 2020/3/21
 */
@Route(path = RouterFragmentPath.Hot.PAGER_HOT)
public class HotFragment extends BaseFragment<FragmentHotBinding, HotViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_hot;
    }

    @Override
    public int initVariableId() {
        return BR.hotViewModel;
    }
}