package com.huii.puii.business.database;

import java.util.List;

/**
 * Created by yinlh on 2016/2/19.
 */
public interface PuiiDaoHelperInterface {
    public <T> void addData(T t);
    public void deleteData(String id);
    public <T> T getDataById(String id);
    public List getAllData();
    public boolean hasKey(String id);
    public long getTotalCount();
    public void deleteAll();
    public <T> List getDataByTag(T t);
}
