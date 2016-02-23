package com.huii.puii.business.database.daohelper;

import android.text.TextUtils;

import com.huii.puii.business.database.PuiiDatabaseLoader;
import com.puii.bean.BookListBean;
import com.puii.dao.BookListBeanDao;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.dao.query.QueryBuilder;


/**
 * Created by yinlh on 2016/2/19.
 */
public class BookListDaoHelper implements PuiiDaoHelperInterface {

    private BookListBeanDao bookListBeanDao;

    public BookListDaoHelper(){
        try{
            bookListBeanDao = PuiiDatabaseLoader.getDaoSession().getBookListBeanDao();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public <T> void addData(T bean) {
        if (bookListBeanDao != null && bean != null){
            bookListBeanDao.insertOrReplace((BookListBean)bean);
        }
    }

    @Override
    public void deleteData(String id) {
        if (bookListBeanDao != null && !TextUtils.isEmpty(id)){
            bookListBeanDao.deleteByKey(id);
        }
    }

    @Override
    public BookListBean getDataById(String id) {
        if (bookListBeanDao != null && !TextUtils.isEmpty(id)){
            return bookListBeanDao.load(id);
        }
        return null;
    }

    @Override
    public List getAllData() {
        if (bookListBeanDao != null){
            return bookListBeanDao.loadAll();
        }
        return null;
    }

    @Override
    public boolean hasKey(String id) {
        if (bookListBeanDao == null || TextUtils.isEmpty(id)){
            return false;
        }

        QueryBuilder<BookListBean> qb = bookListBeanDao.queryBuilder();
        qb.where(BookListBeanDao.Properties.Id.eq(id));
        long count = qb.buildCount().count();
        return count>0 ? true:false;
    }

    @Override
    public long getTotalCount() {
        if (bookListBeanDao == null){
            return 0;
        }
        QueryBuilder<BookListBean> qb = bookListBeanDao.queryBuilder();
        return qb.buildCount().count();
    }

    @Override
    public void deleteAll() {
        if (bookListBeanDao != null){
            bookListBeanDao.deleteAll();
        }
    }

    // TODO: 2016/2/23
    @Override
    public <T> List getDataByTag(T t) {

        return null;
    }
}
