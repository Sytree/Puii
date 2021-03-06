package com.puii.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.puii.bean.FeedBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table feed.
*/
public class FeedBeanDao extends AbstractDao<FeedBean, String> {

    public static final String TABLENAME = "feed";

    /**
     * Properties of entity FeedBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Add_date = new Property(2, String.class, "add_date", false, "ADD_DATE");
        public final static Property Buy_date = new Property(3, String.class, "buy_date", false, "BUY_DATE");
        public final static Property Plan_id = new Property(4, String.class, "plan_id", false, "PLAN_ID");
        public final static Property Book_id = new Property(5, String.class, "book_id", false, "BOOK_ID");
        public final static Property Price = new Property(6, String.class, "price", false, "PRICE");
    };


    public FeedBeanDao(DaoConfig config) {
        super(config);
    }
    
    public FeedBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'feed' (" + //
                "'ID' TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "'NAME' TEXT," + // 1: name
                "'ADD_DATE' TEXT," + // 2: add_date
                "'BUY_DATE' TEXT," + // 3: buy_date
                "'PLAN_ID' TEXT," + // 4: plan_id
                "'BOOK_ID' TEXT," + // 5: book_id
                "'PRICE' TEXT);"); // 6: price
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_feed_ID ON feed" +
                " (ID);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'feed'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, FeedBean entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String add_date = entity.getAdd_date();
        if (add_date != null) {
            stmt.bindString(3, add_date);
        }
 
        String buy_date = entity.getBuy_date();
        if (buy_date != null) {
            stmt.bindString(4, buy_date);
        }
 
        String plan_id = entity.getPlan_id();
        if (plan_id != null) {
            stmt.bindString(5, plan_id);
        }
 
        String book_id = entity.getBook_id();
        if (book_id != null) {
            stmt.bindString(6, book_id);
        }
 
        String price = entity.getPrice();
        if (price != null) {
            stmt.bindString(7, price);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public FeedBean readEntity(Cursor cursor, int offset) {
        FeedBean entity = new FeedBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // add_date
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // buy_date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // plan_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // book_id
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // price
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, FeedBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAdd_date(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBuy_date(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPlan_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBook_id(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPrice(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(FeedBean entity, long rowId) {
        return entity.getId();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(FeedBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
