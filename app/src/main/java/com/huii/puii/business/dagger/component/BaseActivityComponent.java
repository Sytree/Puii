package com.huii.puii.business.dagger.component;

import com.huii.puii.activity.base.BaseActivity;
import com.huii.puii.business.dagger.module.BaseActivityModule;
import com.huii.puii.business.dagger.scope.Base;

import dagger.Component;

/**
 * Created by yinlh on 2016/2/23.
 */
@Base
@Component(
        dependencies = ApplicationComponent.class,
        modules = BaseActivityModule.class
)
public interface BaseActivityComponent {
        BaseActivity injectBaseActivity(BaseActivity baseActivity);
}
