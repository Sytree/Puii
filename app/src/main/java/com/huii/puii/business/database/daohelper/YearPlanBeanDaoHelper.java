package com.huii.puii.business.database.daohelper;

import android.text.TextUtils;

import com.huii.puii.business.database.PuiiDatabaseLoader;
import com.puii.bean.YearPlanBean;
import com.puii.dao.YearPlanBeanDao;

import java.util.List;

import de.greenrobot.dao.query.QueryBuilder;

/**
 * Created by yinlh on 2016/2/23.
 */
public class YearPlanBeanDaoHelper implements PuiiDaoHelperInterface {
    private YearPlanBeanDao yearPlanBeanDao;

    public YearPlanBeanDaoHelper(){
        try{
            yearPlanBeanDao = PuiiDatabaseLoader.getDaoSession().getYearPlanBeanDao();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public <T> void addData(T bean) {
        if (yearPlanBeanDao != null && bean != null){
            yearPlanBeanDao.insertOrReplace((YearPlanBean)bean);
        }
    }

    @Override
    public void deleteData(String id) {
        if (yearPlanBeanDao != null && !TextUtils.isEmpty(id)){
            yearPlanBeanDao.deleteByKey(id);
        }
    }

    @Override
    public YearPlanBean getDataById(String id) {
        if (yearPlanBeanDao != null && !TextUtils.isEmpty(id)){
            return yearPlanBeanDao.load(id);
        }
        return null;
    }

    @Override
    public List getAllData() {
        if (yearPlanBeanDao != null){
            return yearPlanBeanDao.loadAll();
        }
        return null;
    }

    @Override
    public boolean hasKey(String id) {
        if (yearPlanBeanDao == null || TextUtils.isEmpty(id)){
            return false;
        }

        QueryBuilder<YearPlanBean> qb = yearPlanBeanDao.queryBuilder();
        qb.where(YearPlanBeanDao.Properties.Id.eq(id));
        long count = qb.buildCount().count();
        return count>0 ? true:false;
    }

    @Override
    public long getTotalCount() {
        if (yearPlanBeanDao == null){
            return 0;
        }
        QueryBuilder<YearPlanBean> qb = yearPlanBeanDao.queryBuilder();
        return qb.buildCount().count();
    }

    @Override
    public void deleteAll() {
        if (yearPlanBeanDao != null){
            yearPlanBeanDao.deleteAll();
        }
    }

    // TODO: 2016/2/23
    @Override
    public <T> List getDataByTag(T t) {

        return null;
    }
}
