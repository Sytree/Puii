package com.huii.puii.business.dagger.module;

import com.huii.puii.activity.MainActivity;
import com.huii.puii.business.dagger.scope.PerActivity;
import com.huii.puii.presenter.MainActivityPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yinlh on 2016/2/23.
 */
@Module
public class MainActivityModule {

    MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Provides
    @PerActivity
    public MainActivityPresenter provideMainPresenter(){
        return new MainActivityPresenter(mainActivity.getApplicationContext());
    }
}
