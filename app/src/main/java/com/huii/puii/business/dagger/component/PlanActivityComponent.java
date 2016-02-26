package com.huii.puii.business.dagger.component;

import com.huii.puii.business.dagger.module.YearPlanMoudle;
import com.huii.puii.business.dagger.scope.PerActivity;
import com.huii.puii.view.activity.YearPlanActivity;

import dagger.Component;
import dagger.Module;

/**
 * Created by yinlh on 2016/2/26.
 */
@PerActivity
@Component(
        dependencies = ApplicationComponent.class,
        modules = YearPlanMoudle.class
)
public interface PlanActivityComponent {
    YearPlanActivity injectPlanActivity(YearPlanActivity activity);
}
