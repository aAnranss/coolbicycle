package com.zy.base.debug;

import com.zy.base.config.ModuleLifecycleConfig;

import me.goldze.mvvmhabit.base.BaseApplication;


/**
 * Created by 卢文钏 on 2020/2/26
 */
public class DebugApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        //组件初始化(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //组件初始化(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
