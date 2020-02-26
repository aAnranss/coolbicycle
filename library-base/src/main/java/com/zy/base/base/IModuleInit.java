package com.zy.base.base;

import android.app.Application;

/**
 * Created by 卢文钏 on 2020/2/26
 * 动态配置Application，有需要初始化的组件实现该接口，统一在主app的Application中初始化
 */
public interface IModuleInit {
    //优先初始化
    boolean onInitAhead(Application application);

    //靠后初始化
    boolean onInitLow(Application application);
}
