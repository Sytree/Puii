package com.huii.puii.business.dagger.module;

import com.huii.puii.view.activity.YearPlanActivity;
import com.huii.puii.view.adapter.PlanAdapter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yinlh on 2016/2/26.
 */
@Module
public class YearPlanMoudle {
    YearPlanActivity activity;

    public YearPlanMoudle(YearPlanActivity activity){
        this.activity = activity;
    }

    @Provides
    PlanAdapter providesPlanAdapter(){
        return PlanAdapter.getIstance(activity.getApplicationContext());
    }

}
