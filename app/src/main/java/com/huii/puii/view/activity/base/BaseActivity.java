package com.huii.puii.view.activity.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.huii.puii.app.PuiiApp;
import com.huii.puii.business.dagger.component.ApplicationComponent;
import com.huii.puii.business.dagger.component.BaseActivityComponent;
import com.huii.puii.business.dagger.component.DaggerBaseActivityComponent;
import com.huii.puii.business.dagger.module.BaseActivityModule;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpComponent(((PuiiApp) getApplication()).getComponent());
        setUpView();
    }

    protected abstract void setUpView();

    protected abstract void setUpComponent(ApplicationComponent appComponent);

}
