package com.huii.puii.business.dagger.module;

import android.app.Application;
import android.content.Context;


import com.huii.puii.business.database.PuiiDatabaseLoader;
import com.huii.puii.business.database.daohelper.BookListDaoHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yinlh on 2016/2/22.
 *
 */

@Module
public class ApplicationModule {
    Application mApplication;
    Context mContext;
    public ApplicationModule(Application application){
        mApplication = application;
        mContext = application;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return this.mApplication;
    }

    @Provides
    @Singleton

    Context provideContext(){
        return this.mContext;
    }

    @Provides
    @Singleton
    PuiiDatabaseLoader providePuiiDatabaseLoader(){
        return new PuiiDatabaseLoader();
    }
}
