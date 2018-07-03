package com.wuchang.dailynews.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import open.wuchang.com.dailynews.R;
import com.wuchang.dailynews.base.activities.BaseActivity;

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
        setupTabIcons();
    }

    private void setupTabIcons() {
        mTabLayout.getTabAt(0).setCustomView(getTabView(0));
        mTabLayout.getTabAt(1).setCustomView(getTabView(1));
        mTabLayout.getTabAt(2).setCustomView(getTabView(2));
        mTabLayout.getTabAt(3).setCustomView(getTabView(3));
    }

    private View getTabView(int position) {
        View view = LayoutInflater.from(this).inflate(R.layout.tab_layout, null);
        TextView tabTitle = view.findViewById(R.id.txt_tab_title);
        ImageView tabIcon = view.findViewById(R.id.img_tab_icon);
        String[] tabTitles = getResources().getStringArray(R.array.tab_choice);
        int[] tabIcons = {R.drawable.tab_home_selector, R.drawable.tab_video_watermelon_selector,
                R.drawable.tab_micro_head_selector, R.drawable.tab_video_volcano_selector};

        tabTitle.setText(tabTitles[position]);
        //tabTitle.setTextColor(R.drawable.tab_text_color);
        tabIcon.setImageResource(tabIcons[position]);
        return view;
    }


}
