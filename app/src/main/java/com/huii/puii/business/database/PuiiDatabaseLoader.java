package com.huii.puii.business.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.puii.dao.DaoMaster;
import com.puii.dao.DaoSession;

/**
 * Created by yinlh on 2016/2/22.
 */
public class PuiiDatabaseLoader {

    private static final String DATABASE_NAME = "puii-db";
    private static DaoSession daoSession;

    public static void init(Context context) {
        PuiiDataBaseHelper helper = new PuiiDataBaseHelper(context, "puii-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoSession(){
        return daoSession;
    }
}
