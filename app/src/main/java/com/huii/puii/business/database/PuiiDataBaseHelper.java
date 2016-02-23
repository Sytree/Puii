package com.huii.puii.business.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.puii.dao.DaoMaster;

/**
 * Created by yinlh on 2016/2/19.
 */
public class PuiiDataBaseHelper extends DaoMaster.OpenHelper {
    public PuiiDataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
    //避免更新数据库时将旧数据删除
    // TODO: 2016/2/19
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion){
            case 1:
                //创建新表，注意cr  eateTable()是静态方法
                // SchoolDao.createTable(db, true);

                // 加入新字段
                // db.execSQL("ALTER TABLE 'moments' ADD 'audio_path' TEXT;");

                // TODO
                break;
        }
    }
}
