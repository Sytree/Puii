package com.huii.puii.business.database.daohelper;

import android.text.TextUtils;
import com.huii.puii.business.database.PuiiDatabaseLoader;
import com.puii.bean.PastFeedBean;
import com.puii.dao.PastFeedBeanDao;

import java.util.List;

import de.greenrobot.dao.query.QueryBuilder;

/**
 * Created by yinlh on 2016/2/23.
 */
public class PastFeedBeanDaoHelper implements PuiiDaoHelperInterface {
    private PastFeedBeanDao pastFeedBeanDao;

    public PastFeedBeanDaoHelper(){
        try{
            pastFeedBeanDao = PuiiDatabaseLoader.getDaoSession().getPastFeedBeanDao();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public <T> void addData(T bean) {
        if (pastFeedBeanDao != null && bean != null){
            pastFeedBeanDao.insertOrReplace((PastFeedBean)bean);
        }
    }

    @Override
    public void deleteData(String id) {
        if (pastFeedBeanDao != null && !TextUtils.isEmpty(id)){
            pastFeedBeanDao.deleteByKey(id);
        }
    }

    @Override
    public PastFeedBean getDataById(String id) {
        if (pastFeedBeanDao != null && !TextUtils.isEmpty(id)){
            return pastFeedBeanDao.load(id);
        }
        return null;
    }

    @Override
    public List getAllData() {
        if (pastFeedBeanDao != null){
            return pastFeedBeanDao.loadAll();
        }
        return null;
    }

    @Override
    public boolean hasKey(String id) {
        if (pastFeedBeanDao == null || TextUtils.isEmpty(id)){
            return false;
        }

        QueryBuilder<PastFeedBean> qb = pastFeedBeanDao.queryBuilder();
        qb.where(PastFeedBeanDao.Properties.Id.eq(id));
        long count = qb.buildCount().count();
        return count>0 ? true:false;
    }

    @Override
    public long getTotalCount() {
        if (pastFeedBeanDao == null){
            return 0;
        }
        QueryBuilder<PastFeedBean> qb = pastFeedBeanDao.queryBuilder();
        return qb.buildCount().count();
    }

    @Override
    public void deleteAll() {
        if (pastFeedBeanDao != null){
            pastFeedBeanDao.deleteAll();
        }
    }

    // TODO: 2016/2/23
    @Override
    public <T> List getDataByTag(T t) {

        return null;
    }
}
