package com.zy.community.ui.viewmodel;

import androidx.annotation.NonNull;

import me.goldze.mvvmhabit.base.ItemViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

/**
 * Created by 卢文钏 on 2020/2/27
 */
public class ViewPagerItemViewModel extends ItemViewModel<CommunityViewModel> {
    public String text;

    public ViewPagerItemViewModel(@NonNull CommunityViewModel viewModel, String text){
        super(viewModel);
        this.text = text;
    }
    public BindingCommand onClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //点击之后将逻辑转到adapter中处理
            viewModel.itemClickEvent.setValue(text);
        }
    });

}
