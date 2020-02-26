package com.zy.base.config;

import android.app.Application;

import androidx.annotation.NonNull;

import com.zy.base.base.IModuleInit;

/**
 * Created by 卢文钏 on 2020/2/26
 */
public class ModuleLifecycleConfig {
    private static class SingletonHolder{
        public static ModuleLifecycleConfig instance = new ModuleLifecycleConfig();
    }

    public static ModuleLifecycleConfig getInstance(){
        return SingletonHolder.instance;
    }

    private ModuleLifecycleConfig(){

    }

    //初始化组件--靠前
    public void initModuleAhead(@NonNull Application application){
        for (String moduleInitName : ModuleLifecycleReflexs.initModuleNames) {
            try {
                Class<?> clas = Class.forName(moduleInitName);
                IModuleInit init = (IModuleInit) clas.newInstance();
                //调用初始化方法
                init.onInitAhead(application);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    //初始化组件--靠后
    public void initModuleLow(@NonNull Application application){
        for (String moduleInitName : ModuleLifecycleReflexs.initModuleNames) {
            try {
                Class<?> clas = Class.forName(moduleInitName);
                IModuleInit init = (IModuleInit) clas.newInstance();
                //调用初始化方法
                init.onInitLow(application);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
