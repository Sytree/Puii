package com.huii.puii.business.dagger.module;

import com.huii.puii.view.activity.base.BaseActivity;

import dagger.Module;

/**
 * Created by yinlh on 2016/2/23.
 */
@Module
public class BaseActivityModule {
    private BaseActivity baseActivity;
    public BaseActivityModule(BaseActivity baseActivity){
        this.baseActivity = baseActivity;
    }
}
