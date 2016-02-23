package com.huii.puii.business.database.daohelper;

import android.text.TextUtils;
import com.huii.puii.business.database.PuiiDatabaseLoader;
import com.puii.bean.PastYearPlanBean;
import com.puii.dao.PastYearPlanBeanDao;

import java.util.List;

import de.greenrobot.dao.query.QueryBuilder;

/**
 * Created by yinlh on 2016/2/23.
 */
public class PastYearPlanBeanDaoHelper implements PuiiDaoHelperInterface {
    private PastYearPlanBeanDao pastYearPlanBeanDao;

    public PastYearPlanBeanDaoHelper(){
        try{
            pastYearPlanBeanDao = PuiiDatabaseLoader.getDaoSession().getPastYearPlanBeanDao();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public <T> void addData(T bean) {
        if (pastYearPlanBeanDao != null && bean != null){
            pastYearPlanBeanDao.insertOrReplace((PastYearPlanBean)bean);
        }
    }

    @Override
    public void deleteData(String id) {
        if (pastYearPlanBeanDao != null && !TextUtils.isEmpty(id)){
            pastYearPlanBeanDao.deleteByKey(id);
        }
    }

    @Override
    public PastYearPlanBean getDataById(String id) {
        if (pastYearPlanBeanDao != null && !TextUtils.isEmpty(id)){
            return pastYearPlanBeanDao.load(id);
        }
        return null;
    }

    @Override
    public List getAllData() {
        if (pastYearPlanBeanDao != null){
            return pastYearPlanBeanDao.loadAll();
        }
        return null;
    }

    @Override
    public boolean hasKey(String id) {
        if (pastYearPlanBeanDao == null || TextUtils.isEmpty(id)){
            return false;
        }

        QueryBuilder<PastYearPlanBean> qb = pastYearPlanBeanDao.queryBuilder();
        qb.where(PastYearPlanBeanDao.Properties.Id.eq(id));
        long count = qb.buildCount().count();
        return count>0 ? true:false;
    }

    @Override
    public long getTotalCount() {
        if (pastYearPlanBeanDao == null){
            return 0;
        }
        QueryBuilder<PastYearPlanBean> qb = pastYearPlanBeanDao.queryBuilder();
        return qb.buildCount().count();
    }

    @Override
    public void deleteAll() {
        if (pastYearPlanBeanDao != null){
            pastYearPlanBeanDao.deleteAll();
        }
    }

    // TODO: 2016/2/23
    @Override
    public <T> List getDataByTag(T t) {

        return null;
    }
}
