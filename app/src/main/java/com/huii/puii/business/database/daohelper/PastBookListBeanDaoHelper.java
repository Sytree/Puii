package com.huii.puii.business.database.daohelper;

import android.text.TextUtils;
import com.huii.puii.business.database.PuiiDatabaseLoader;
import com.puii.bean.PastBookListBean;
import com.puii.dao.PastBookListBeanDao;

import java.util.List;

import de.greenrobot.dao.query.QueryBuilder;

/**
 * Created by yinlh on 2016/2/23.
 */
public class PastBookListBeanDaoHelper implements PuiiDaoHelperInterface {
    private PastBookListBeanDao pastBookListBeanDao;

    public PastBookListBeanDaoHelper(){
        try{
            pastBookListBeanDao = PuiiDatabaseLoader.getDaoSession().getPastBookListBeanDao();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public <T> void addData(T bean) {
        if (pastBookListBeanDao != null && bean != null){
            pastBookListBeanDao.insertOrReplace((PastBookListBean)bean);
        }
    }

    @Override
    public void deleteData(String id) {
        if (pastBookListBeanDao != null && !TextUtils.isEmpty(id)){
            pastBookListBeanDao.deleteByKey(id);
        }
    }

    @Override
    public PastBookListBean getDataById(String id) {
        if (pastBookListBeanDao != null && !TextUtils.isEmpty(id)){
            return pastBookListBeanDao.load(id);
        }
        return null;
    }

    @Override
    public List getAllData() {
        if (pastBookListBeanDao != null){
            return pastBookListBeanDao.loadAll();
        }
        return null;
    }

    @Override
    public boolean hasKey(String id) {
        if (pastBookListBeanDao == null || TextUtils.isEmpty(id)){
            return false;
        }

        QueryBuilder<PastBookListBean> qb = pastBookListBeanDao.queryBuilder();
        qb.where(PastBookListBeanDao.Properties.Id.eq(id));
        long count = qb.buildCount().count();
        return count>0 ? true:false;
    }

    @Override
    public long getTotalCount() {
        if (pastBookListBeanDao == null){
            return 0;
        }
        QueryBuilder<PastBookListBean> qb = pastBookListBeanDao.queryBuilder();
        return qb.buildCount().count();
    }

    @Override
    public void deleteAll() {
        if (pastBookListBeanDao != null){
            pastBookListBeanDao.deleteAll();
        }
    }

    // TODO: 2016/2/23
    @Override
    public <T> List getDataByTag(T t) {

        return null;
    }
}
