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
    private static final String CommunityInit = "com.zy.communityInit.CommunityModuleInit";
    //用户模块
    private static final String UserInit = "com.zy.user.UserModuleInit";
    //添加用户登陆模块
    private static final String SignInit = "com.zy.sign.SignModuleInit";
    //隐私政策
    private static final String PrivacyPolicyInit = "com.zy.ppolicy.PrivacyPolicyModuleInit";
    //用户服务协议
    private static final String ServicePolicyInit = "com.zy.spolicy.ServicePolicyModuleInit";
    //设置模块
    private static final String SettingInit = "com.zy.setting.SettingModuleInit";
    //反馈模块
    private static final String FeedbackInit = "com.zy.feedback.FeedbackModuleInit";


    public static String[] initModuleNames = {BaseInit, MainInit, CommunityInit, SignInit,
            UserInit, PrivacyPolicyInit, ServicePolicyInit, SettingInit, FeedbackInit
    };
}
