package com.huii.puii.view.activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.huii.puii.R;
import com.huii.puii.view.activity.base.BaseActivity;
import com.huii.puii.business.dagger.component.ApplicationComponent;
import com.huii.puii.business.dagger.component.DaggerMainActivityComponent;
import com.huii.puii.business.dagger.module.MainActivityModule;
import com.huii.puii.presenter.MainActivityPresenter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    //控件绑定
    //首页P按钮
    @Bind(R.id.button_new_plan)
    TextView button_new_plan;
    //展开的p+
    @Bind(R.id.extend_new_plan)
    LinearLayout extend_new_plan;
    @Bind(R.id.button_new_plan_plan)
    TextView button_new_plan_plan;
    @Bind(R.id.button_new_plan_booklist)
    TextView button_new_plan_booklist;
    @Bind(R.id.button_new_plan_cancel)
    ImageView button_new_plan_cancel;
    //presenter
    @Inject
    MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void setUpComponent(ApplicationComponent appComponent) {
        DaggerMainActivityComponent.builder().applicationComponent(appComponent).mainActivityModule(new MainActivityModule(this)).build();
    }

    //+p按钮的单击操作
    @OnClick(R.id.button_new_plan)
    public void onClickNewPlan(){
        extend_new_plan.setVisibility(View.VISIBLE);
        button_new_plan.setVisibility(View.GONE);
    }
    //+p按钮取消展开
    @OnClick(R.id.button_new_plan_cancel)
    public void onNewPlanCancel(){
        extend_new_plan.setVisibility(View.GONE);
        button_new_plan.setVisibility(View.VISIBLE);
    }
    //计划按钮
    @OnClick(R.id.button_new_plan_plan)
    public void onClickPlan(){
        // TODO: 2016/2/23
    }
    //书单按钮
    @OnClick(R.id.button_new_plan_booklist)
    public void onClickBookList(){
        // TODO: 2016/2/23
    }

    //菜单
    // TODO: 2016/2/23
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
