package open.wuchang.com.dailynews.base;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder mBind;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //设置布局内容
        setContentView(getLayoutId());
        //初始化ButterKnife控件绑定框架
        mBind = ButterKnife.bind(this);
        //初始化控件
        initViews(savedInstanceState);
        //初始化ToolBar
        initToolBar();
    }

    /***
     * 设置布局Layout
     *
     * @return
     */
    public abstract int getLayoutId();

    /***
     * 初始化views
     *
     * @param savedInstanceState
     */
    public abstract void initViews(Bundle savedInstanceState);

    /***
     * 初始化toolbar
     */
    public abstract void initToolBar();

    /***
     * 加载数据
     */
    public void loadData() {

    }

    /***
     * 初始化recyclerview
     */
    public void initRecyclerView() {

    }

    /***
     * 初始化refreshlayout
     */
    public void initRefreshLayout() {

    }

    /***
     * 设置数据显示
     */
    public void finishTask() {

    }

}
