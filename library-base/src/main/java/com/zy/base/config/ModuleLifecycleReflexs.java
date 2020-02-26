package com.zy.base.config;

/**
 * Created by 卢文钏 on 2020/2/26
 * 作为组件生命周期初始化的配置类，通过反射机制，动态调用每个组件初始化逻辑
 */
public class ModuleLifecycleReflexs {
    //设置各个组件的全类名

    private static final String BaseInit = "com.zy.base.base.BaseModuleInit";
    //主业务模块
    private static final String MainInit = "com.zy.main.MainModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.zy.home.HomeModuleInit";

    public static String[] initModuleNames = {BaseInit,MainInit,HomeInit};
}
