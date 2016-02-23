package com.huii.puii.business.database.daohelper;

import android.text.TextUtils;

import com.huii.puii.business.database.PuiiDatabaseLoader;
import com.puii.bean.FeedBean;
import com.puii.dao.FeedBeanDao;

import java.util.List;

import de.greenrobot.dao.query.QueryBuilder;

/**
 * Created by yinlh on 2016/2/23.
 */
public class FeedBeanDaoHelper implements PuiiDaoHelperInterface {
    private FeedBeanDao feedBeanDao;

    public FeedBeanDaoHelper(){
        try{
            feedBeanDao = PuiiDatabaseLoader.getDaoSession().getFeedBeanDao();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public <T> void addData(T bean) {
        if (feedBeanDao != null && bean != null){
            feedBeanDao.insertOrReplace((FeedBean)bean);
        }
    }

    @Override
    public void deleteData(String id) {
        if (feedBeanDao != null && !TextUtils.isEmpty(id)){
            feedBeanDao.deleteByKey(id);
        }
    }

    @Override
    public FeedBean getDataById(String id) {
        if (feedBeanDao != null && !TextUtils.isEmpty(id)){
            return feedBeanDao.load(id);
        }
        return null;
    }

    @Override
    public List getAllData() {
        if (feedBeanDao != null){
            return feedBeanDao.loadAll();
        }
        return null;
    }

    @Override
    public boolean hasKey(String id) {
        if (feedBeanDao == null || TextUtils.isEmpty(id)){
            return false;
        }

        QueryBuilder<FeedBean> qb = feedBeanDao.queryBuilder();
        qb.where(FeedBeanDao.Properties.Id.eq(id));
        long count = qb.buildCount().count();
        return count>0 ? true:false;
    }

    @Override
    public long getTotalCount() {
        if (feedBeanDao == null){
            return 0;
        }
        QueryBuilder<FeedBean> qb = feedBeanDao.queryBuilder();
        return qb.buildCount().count();
    }

    @Override
    public void deleteAll() {
        if (feedBeanDao != null){
            feedBeanDao.deleteAll();
        }
    }

    // TODO: 2016/2/23
    @Override
    public <T> List getDataByTag(T t) {

        return null;
    }
}
