package com.wuchang.dailynews.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.wuchang.dailynews.app.Application;
import com.wuchang.dailynews.base.BaseActivity;
import com.wuchang.dailynews.utils.LoginUtil;

import butterknife.BindView;
import open.wuchang.com.dailynews.R;

public class HomeActivity extends BaseActivity {
    private final String TAG_LOG = this.getClass().getName();

    //@BindView(R.id.toolbar_home)
    private Toolbar mToolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finishTask();
    }

    @Override
    public int getLayoutId() {
        Log.i(TAG_LOG, "启动成功");
        return R.layout.activity_home;
    }

    @Override
    public View getToolbar() {
        mToolbar = findViewById(R.id.toolbar_home);
        return mToolbar;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
    }

    @Override
    public void initToolBar() {
        //设置沉浸式状态栏
        setImmerseLayout();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(Color.TRANSPARENT);
        }
    }

    @Override
    public void finishTask() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(HomeActivity.this, NewsActivity.class));
                HomeActivity.this.finish();
            }
        }, Application.SPLASH_DISPLAY_LENGHT);
    }
}
