package com.zy.base.router;

/**
 * Created by 卢文钏 on 2020/2/26
 * 用于组件开发中，ARouterARouter多Fragment跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */
public class RouterFragmentPath {
    /**
     * 社区组件
     */
    public static class Community {
        private static final String COMMUNITY = "/community";
        //社区
        public static final String PAGER_COMMUNITY = COMMUNITY + "/Community";
    }

    public static class Recommend {
        private static final String RECOMMEND = "/recommend";
        //推荐页
        public static final String PAGER_RECOMMEND = RECOMMEND + "/Recommend";
    }

    /**
     * 用户组件
     */
    public static class User {
        private static final String USER = "/user";
        /*我的*/
        public static final String PAGER_ME = USER + "/Me";
    }

}
