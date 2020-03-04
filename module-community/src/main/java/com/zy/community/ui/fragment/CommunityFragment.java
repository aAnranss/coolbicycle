package com.zy.community.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.zy.base.router.RouterFragmentPath;
import com.zy.community.BR;
import com.zy.community.R;
import com.zy.community.databinding.FragmentCommunityBinding;
import com.zy.community.ui.viewmodel.CommunityViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * Created by 卢文钏 on 2020/2/27
 */

@Route(path = RouterFragmentPath.Community.PAGER_COMMUNITY)
public class CommunityFragment extends BaseFragment<FragmentCommunityBinding, CommunityViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_community;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        // 使用 TabLayout 和 ViewPager 相关联
        //出现setupWithViewPager和addOnPageChangeListener两个函数无法找到的问题在于：
        //迁移到了androidx版本，在layout文件中将<android.support.design.widget.TabLayout>变成了<com.google.android.material.tabs.TabLayout>
        //由<android.support.v4.view.ViewPager>变成了<androidx.viewpager.widget.ViewPager>
        binding.tabs.setupWithViewPager(binding.viewPager,true);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));
        viewModel.addPage();
    }

    @Override
    public void initViewObservable() {
        viewModel.itemClickEvent.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //ToastUtils.showShort(s);
            }
        });
    }
}
