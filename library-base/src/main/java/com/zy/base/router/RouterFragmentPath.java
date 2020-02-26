package com.zy.base.router;

/**
 * Created by 卢文钏 on 2020/2/26
 * 用于组件开发中，ARouterARouter多Fragment跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */
public class RouterFragmentPath {
    /**
     * 首页组件
     */
    public static class Home {
        private static final String HOME = "/home";
        /*首页*/
        public static final String PAGER_HOME = HOME + "/Home";
    }
}
