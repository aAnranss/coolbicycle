package com.zy.feedback.view;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zy.base.router.RouterActivityPath;
import com.zy.feedback.BR;
import com.zy.feedback.R;
import com.zy.feedback.databinding.ActivityFeedbackBinding;
import com.zy.feedback.viewmodel.FeedbackViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by 卢文钏 on 2020/3/18
 */
@Route(path = RouterActivityPath.Feedback.PAGER_FEEDBACK)
public class FeedbackActivity extends BaseActivity<ActivityFeedbackBinding, FeedbackViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_feedback;
    }

    @Override
    public int initVariableId() {
        return BR.feedbackViewModel;
    }
}
