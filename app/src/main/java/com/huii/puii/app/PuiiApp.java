package com.huii.puii.app;

import android.app.Application;
import com.huii.puii.business.dagger.component.ApplicationComponent;
import com.huii.puii.business.dagger.component.DaggerApplicationComponent;
import com.huii.puii.business.dagger.module.ApplicationModule;
import com.huii.puii.business.database.PuiiDatabaseLoader;
/**
 * Created by yinlh on 2016/2/19.
 */
public class PuiiApp extends Application {

    private ApplicationComponent component;


    @Override
    public void onCreate() {
        super.onCreate();

        //初始化数据库
        PuiiDatabaseLoader.init(this);
    }

    //dagger component 获取
    public ApplicationComponent getComponent() {
        this.component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        return component;
    }
}
