package com.zy.main.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

/**
 * Created by 卢文钏 on 2020/2/26
 * 冷启动
 */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //在SplashActivity停留3秒，随即跳转至MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                initMain();
            }
        },3000);
    }

    //加载主页面
    private void initMain() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
