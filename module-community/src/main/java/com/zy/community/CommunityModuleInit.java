package com.zy.community;

import android.app.Application;

import com.zy.base.base.IModuleInit;

/**
 * Created by 卢文钏 on 2020/2/27
 */
public class CommunityModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        return false;
    }
}
