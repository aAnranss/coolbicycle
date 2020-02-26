package com.zy.main;

import android.app.Application;

import com.zy.base.base.IModuleInit;

/**
 * Created by 卢文钏 on 2020/2/26
 */
public class MainModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        return false;
    }
}
