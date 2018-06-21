package com.wuchang.dailynews.ui.activity;

import android.os.Bundle;
import android.util.Log;

import com.wuchang.dailynews.base.BaseActivity;

import open.wuchang.com.dailynews.R;

public class HomeActivity extends BaseActivity {
    private final String TAG_LOG = this.getClass().getName();
    @Override
    public int getLayoutId() {
        Log.i(TAG_LOG, "启动成功");
        return R.layout.activity_home;
    }

    @Override
    public int getToolbarId() {
        return R.id.rlayout_parent_homeactivity;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void initToolBar() {

    }
}
