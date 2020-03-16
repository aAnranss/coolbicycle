package com.zy.main.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zy.base.router.RouterActivityPath;

/**
 * Created by 卢文钏 on 2020/2/26
 * 冷启动
 */
public class SplashActivity extends Activity {

    //设置延迟时间
    private final int SKIP_DELAY_TIME = 1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在SplashActivity停留3秒，随即跳转至MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                initMain();
            }
        },SKIP_DELAY_TIME);
    }

    //加载主页面
    private void initMain() {
        /*this.startActivity(new Intent(this,MainActivity.class));
        this.finish();*/
        ARouter.getInstance()
                .build(RouterActivityPath.Sign.PAGER_LOGIN)
                .navigation();
        finish();
    }
}
