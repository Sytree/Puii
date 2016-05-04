package com.puii.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.puii.bean.BookListBean;
import com.puii.bean.YearPlanBean;
import com.puii.bean.PastBookListBean;
import com.puii.bean.PastYearPlanBean;
import com.puii.bean.FeedBean;
import com.puii.bean.PastFeedBean;

import com.puii.dao.BookListBeanDao;
import com.puii.dao.YearPlanBeanDao;
import com.puii.dao.PastBookListBeanDao;
import com.puii.dao.PastYearPlanBeanDao;
import com.puii.dao.FeedBeanDao;
import com.puii.dao.PastFeedBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bookListBeanDaoConfig;
    private final DaoConfig yearPlanBeanDaoConfig;
    private final DaoConfig pastBookListBeanDaoConfig;
    private final DaoConfig pastYearPlanBeanDaoConfig;
    private final DaoConfig feedBeanDaoConfig;
    private final DaoConfig pastFeedBeanDaoConfig;

    private final BookListBeanDao bookListBeanDao;
    private final YearPlanBeanDao yearPlanBeanDao;
    private final PastBookListBeanDao pastBookListBeanDao;
    private final PastYearPlanBeanDao pastYearPlanBeanDao;
    private final FeedBeanDao feedBeanDao;
    private final PastFeedBeanDao pastFeedBeanDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bookListBeanDaoConfig = daoConfigMap.get(BookListBeanDao.class).clone();
        bookListBeanDaoConfig.initIdentityScope(type);

        yearPlanBeanDaoConfig = daoConfigMap.get(YearPlanBeanDao.class).clone();
        yearPlanBeanDaoConfig.initIdentityScope(type);

        pastBookListBeanDaoConfig = daoConfigMap.get(PastBookListBeanDao.class).clone();
        pastBookListBeanDaoConfig.initIdentityScope(type);

        pastYearPlanBeanDaoConfig = daoConfigMap.get(PastYearPlanBeanDao.class).clone();
        pastYearPlanBeanDaoConfig.initIdentityScope(type);

        feedBeanDaoConfig = daoConfigMap.get(FeedBeanDao.class).clone();
        feedBeanDaoConfig.initIdentityScope(type);

        pastFeedBeanDaoConfig = daoConfigMap.get(PastFeedBeanDao.class).clone();
        pastFeedBeanDaoConfig.initIdentityScope(type);

        bookListBeanDao = new BookListBeanDao(bookListBeanDaoConfig, this);
        yearPlanBeanDao = new YearPlanBeanDao(yearPlanBeanDaoConfig, this);
        pastBookListBeanDao = new PastBookListBeanDao(pastBookListBeanDaoConfig, this);
        pastYearPlanBeanDao = new PastYearPlanBeanDao(pastYearPlanBeanDaoConfig, this);
        feedBeanDao = new FeedBeanDao(feedBeanDaoConfig, this);
        pastFeedBeanDao = new PastFeedBeanDao(pastFeedBeanDaoConfig, this);

        registerDao(BookListBean.class, bookListBeanDao);
        registerDao(YearPlanBean.class, yearPlanBeanDao);
        registerDao(PastBookListBean.class, pastBookListBeanDao);
        registerDao(PastYearPlanBean.class, pastYearPlanBeanDao);
        registerDao(FeedBean.class, feedBeanDao);
        registerDao(PastFeedBean.class, pastFeedBeanDao);
    }
    
    public void clear() {
        bookListBeanDaoConfig.getIdentityScope().clear();
        yearPlanBeanDaoConfig.getIdentityScope().clear();
        pastBookListBeanDaoConfig.getIdentityScope().clear();
        pastYearPlanBeanDaoConfig.getIdentityScope().clear();
        feedBeanDaoConfig.getIdentityScope().clear();
        pastFeedBeanDaoConfig.getIdentityScope().clear();
    }

    public BookListBeanDao getBookListBeanDao() {
        return bookListBeanDao;
    }

    public YearPlanBeanDao getYearPlanBeanDao() {
        return yearPlanBeanDao;
    }

    public PastBookListBeanDao getPastBookListBeanDao() {
        return pastBookListBeanDao;
    }

    public PastYearPlanBeanDao getPastYearPlanBeanDao() {
        return pastYearPlanBeanDao;
    }

    public FeedBeanDao getFeedBeanDao() {
        return feedBeanDao;
    }

    public PastFeedBeanDao getPastFeedBeanDao() {
        return pastFeedBeanDao;
    }

}