package com.zy.base.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zy.base.BuildConfig;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * Created by 卢文钏 on 2020/2/26
 * 基础库自身初始化操作
 */
public class BaseModuleInit implements IModuleInit{
    @Override
    public boolean onInitAhead(Application application) {
        //开启打印日志
        KLog.init(true);
        //初始化阿里路由框架
        if (BuildConfig.DEBUG){
            ARouter.openLog();      //打印日志
            ARouter.openDebug();    //打开调试模式
        }
        ARouter.init(application);  //尽可能早，在application中初始化
        KLog.e("基础层初始化--onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("基础层初始化--onInitLow");
        return false;
    }
}
