package com.zy.community.debug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.zy.community.ui.fragment.CommunityFragment;

import me.goldze.mvvmhabit.base.ContainerActivity;

/**
 * Created by 卢文钏 on 2020/3/4
 */
public class DebugActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment_recommend", CommunityFragment.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
