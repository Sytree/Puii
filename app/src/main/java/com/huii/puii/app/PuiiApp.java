package com.huii.puii.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.huii.puii.business.PuiiDataBaseHelper;
import com.puii.dao.DaoMaster;
import com.puii.dao.DaoSession;

/**
 * Created by yinlh on 2016/2/19.
 */
public class PuiiApp extends Application {

    public DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        setUpDatabase();
    }
    //初始化数据库
    private void setUpDatabase() {
//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "example-db", null);
//        SQLiteDatabase db = helper.getWritableDatabase();
//        DaoMaster daoMaster = new DaoMaster(db);
//        daoSession = daoMaster.newSession();
        PuiiDataBaseHelper helper = new PuiiDataBaseHelper(getApplicationContext(),"puii-db",null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession  = daoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
