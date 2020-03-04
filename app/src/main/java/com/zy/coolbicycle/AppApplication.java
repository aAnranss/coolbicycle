package com.zy.coolbicycle;



import com.zy.base.config.ModuleLifecycleConfig;
import me.goldze.mvvmhabit.base.BaseApplication;

public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }

}
