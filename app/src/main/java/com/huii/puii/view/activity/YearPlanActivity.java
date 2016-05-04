package com.huii.puii.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.huii.puii.R;
import com.huii.puii.business.dagger.component.ApplicationComponent;
import com.huii.puii.business.dagger.component.DaggerPlanActivityComponent;
import com.huii.puii.business.dagger.component.PlanActivityComponent;
import com.huii.puii.business.dagger.module.YearPlanMoudle;
import com.huii.puii.view.activity.base.BaseActivity;
import com.huii.puii.view.adapter.PlanAdapter;

import org.json.JSONArray;

import javax.inject.Inject;

import butterknife.Bind;


public class YearPlanActivity extends BaseActivity {

    @Inject
    PlanAdapter adapter;
    @Bind(R.id.new_plan_plan_list)
    RecyclerView plan_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_plan);

    }

    @Override
    protected void setUpView() {
        plan_list.setAdapter(adapter);
    }


    @Override
    protected void setUpComponent(ApplicationComponent appComponent) {
        PlanActivityComponent component = DaggerPlanActivityComponent.builder().applicationComponent(appComponent).yearPlanMoudle(new YearPlanMoudle(this)).build();
        component.injectPlanActivity(this);
    }
}
