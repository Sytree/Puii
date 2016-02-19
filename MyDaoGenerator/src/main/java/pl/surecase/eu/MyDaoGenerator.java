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

        new DaoGenerator().generateAll(schema, args[0]);
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
