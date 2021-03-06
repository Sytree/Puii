package pl.surecase.eu;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyDaoGenerator {

    public static void main(String args[]) throws Exception {
        // 1: 数据库版本号
        // com.xxx.bean:自动生成的Bean对象会放到/java-gen/com/xxx/bean中
        Schema schema = new Schema(1, "com.puii.bean");

        // DaoMaster.java、DaoSession.java、BeanDao.java会放到/java-gen/com/xxx/dao中
        schema.setDefaultJavaPackageDao("com.puii.dao");

        //初始化bean
        initBookListBean(schema);
        initYearPlanBean(schema);
        initPastBookListBean(schema);
        initPastPlanBean(schema);
        initFeedBean(schema);
        initPastFeedBean(schema);
        new DaoGenerator().generateAll(schema, args[0]);
    }

    private static void initPastFeedBean(Schema schema) {
        Entity PastFeedBean = schema.addEntity("PastFeedBean");//表名
        PastFeedBean.setTableName("feed");//对表命名
        PastFeedBean.addStringProperty("id").primaryKey().index();//id键
        PastFeedBean.addStringProperty("name");
        PastFeedBean.addStringProperty("buy_date");
        PastFeedBean.addStringProperty("plan_id");
        PastFeedBean.addStringProperty("book_id");
        PastFeedBean.addStringProperty("price");
    }

    private static void initFeedBean(Schema schema) {
        Entity FeedBean = schema.addEntity("FeedBean");//表名
        FeedBean.setTableName("feed");//对表命名
        FeedBean.addStringProperty("id").primaryKey().index();//id键
        FeedBean.addStringProperty("name");
        FeedBean.addStringProperty("add_date");
        FeedBean.addStringProperty("buy_date");
        FeedBean.addStringProperty("plan_id");
        FeedBean.addStringProperty("book_id");
        FeedBean.addStringProperty("price");
    }

    private static void initPastPlanBean(Schema schema) {
        Entity PastYearPlanBean = schema.addEntity("PastYearPlanBean");//表名
        PastYearPlanBean.setTableName("pastyearplan");//对表命名
        PastYearPlanBean.addStringProperty("id").primaryKey().index();//id键
        PastYearPlanBean.addStringProperty("content");
        PastYearPlanBean.addStringProperty("complete_date");
    }

    private static void initPastBookListBean(Schema schema) {
        Entity PastBookListBean = schema.addEntity("PastBookListBean");//表名
        PastBookListBean.setTableName("pastbooklist");//对表命名
        PastBookListBean.addStringProperty("id").primaryKey().index();//id键
        PastBookListBean.addStringProperty("name");
        PastBookListBean.addStringProperty("complete_date");
    }

    private static void initYearPlanBean(Schema schema) {
        Entity bookListBean = schema.addEntity("YearPlanBean");//表名
        bookListBean.setTableName("yearplan");//对表命名
        bookListBean.addStringProperty("id").primaryKey().index();//id键
        bookListBean.addStringProperty("content");
        bookListBean.addStringProperty("add_date");
        bookListBean.addStringProperty("complete_date");
        bookListBean.addStringProperty("state");
    }

    private static void initBookListBean(Schema schema) {
        Entity bookListBean = schema.addEntity("BookListBean");//表名
        bookListBean.setTableName("booklist");//对表命名
        bookListBean.addStringProperty("id").primaryKey().index();//id键
        bookListBean.addStringProperty("name");
        bookListBean.addStringProperty("add_date");
        bookListBean.addStringProperty("complete_date");
        bookListBean.addStringProperty("state");
    }
}
