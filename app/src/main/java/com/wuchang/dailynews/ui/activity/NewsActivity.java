package com.wuchang.dailynews.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.BindView;
import open.wuchang.com.dailynews.R;
import com.wuchang.dailynews.base.BaseActivity;

public class NewsActivity extends BaseActivity {

    @BindView(R.id.toolbar_news) Toolbar mToolbar;
    @BindView(R.id.tab_main)
    TabLayout mTabLayout;

    @Override
    public int getLayoutId() {
        return R.layout.activity_news;
    }

    @Override
    public View getToolbar() {
        return mToolbar;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        initTab();
    }

    @Override
    public void initToolBar() {
        setImmerseLayout();
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initTab() {
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.setSelectedTabIndicatorHeight(0);
        ViewCompat.setElevation(mTabLayout, 10);
        String[] tabTitles = getResources().getStringArray(R.array.tab_choice);
        for (int i = 0; i < tabTitles.length; i++) {
            mTabLayout.addTab(mTabLayout.newTab().setText(tabTitles[i]));
        }
    }
}
