package com.huii.puii.business.dagger.component;

import com.huii.puii.app.PuiiApp;
import com.huii.puii.business.dagger.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yinlh on 2016/2/22.
 */
@Singleton
@Component(
        modules = ApplicationModule.class
)
public interface ApplicationComponent {
    PuiiApp injectAplication(PuiiApp app);
}
