package com.wuchang.dailynews.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.BindView;
import open.wuchang.com.dailynews.R;
import com.wuchang.dailynews.base.BaseActivity;

public class NewsActivity extends BaseActivity {

    @BindView(R.id.toolbar_news) Toolbar toolbar;

    @Override
    public int getLayoutId() {
        return R.layout.activity_news;
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
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

}
