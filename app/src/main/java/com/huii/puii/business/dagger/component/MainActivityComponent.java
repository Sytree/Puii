package com.huii.puii.business.dagger.component;

import com.huii.puii.activity.MainActivity;
import com.huii.puii.business.dagger.module.MainActivityModule;
import com.huii.puii.business.dagger.scope.PerActivity;
import com.huii.puii.presenter.MainActivityPresenter;

import dagger.Component;

/**
 * Created by yinlh on 2016/2/23.
 */
@PerActivity
@Component(
        dependencies = ApplicationComponent.class,
        modules = MainActivityModule.class
)
public interface MainActivityComponent {
    MainActivity injectMainActivity(MainActivity mainActivity);
    MainActivityPresenter mainActivityPresenter();
}
