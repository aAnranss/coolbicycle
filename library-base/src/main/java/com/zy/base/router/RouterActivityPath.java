package com.zy.base.router;

/**
 * Created by 卢文钏 on 2020/2/26
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */
public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_MAIN = MAIN +"/Main";
    }

    /**
     * 身份验证组件
     */
    public static class Sign {
        private static final String SIGN = "/sign";
        /*登录界面*/
        public static final String PAGER_LOGIN = SIGN + "/Login";
    }

    /**
     * 用户组件
     */
    public static class User {
        private static final String USER = "/user";
        /*用户详情*/
        public static final String PAGER_USERDETAIL = USER + "/UserDetail";
    }

    /**
     * 注册组件
     */
    public static class Register {
        private static final String REGISTER = "/register";
        /*注册模块*/
        public static final String PAGER_REGISTER = REGISTER + "/Register";
    }

    /**
     * 隐私政策组件
     */
    public static class PrivacyPolicy {
        private static final String PRIVACYPOLICY = "/privacypolicy";
        /*注册模块*/
        public static final String PAGER_PRIVACY_POLICY = PRIVACYPOLICY + "/PrivacyPolicy";
    }

    /**
     * 用户服务协议组件
     */
    public static class ServicePolicy {
        private static final String SERVICEPOLICY = "/servicepolicy";
        /*注册模块*/
        public static final String PAGER_SERVICE_POLICY = SERVICEPOLICY + "/ServicePolicy";
    }

    /**
     * 设置组件
     */
    public static class Setting {
        private static final String SETTING = "/setting";
        /*设置模块*/
        public static final String PAGER_SETTING = SETTING + "/Setting";
    }

    /**
     * 反馈组件
     */
    public static class Feedback {
        private static final String FEEDBACK = "/feedback";
        /*反馈模块*/
        public static final String PAGER_FEEDBACK = FEEDBACK + "/Feedback";
    }

    /**
     * 关于组件
     */
    public static class About {
        private static final String ABOUT = "/about";
        /*反馈模块*/
        public static final String PAGER_ABOUT = ABOUT + "/About";
    }
    /**
     * 忘记密码组件
     */
    public static class FindPassword {
        private static final String FINDPASSWORD = "/findpassword";
        /*忘记密码模块*/
        public static final String PAGER_FINDPASSWORD = FINDPASSWORD + "/FindPassword";
    }

}
