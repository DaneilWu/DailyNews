package com.wuchang.dailynews.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.wuchang.dailynews.base.activities.BaseActivity;

import open.wuchang.com.dailynews.R;

public class LoginActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public View getToolbar() {
        return null;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void initToolBar() {
        setImmerseLayout();
    }
}
