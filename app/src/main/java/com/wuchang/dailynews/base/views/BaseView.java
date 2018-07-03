package com.wuchang.dailynews.base.views;

public interface BaseView {

    /***
     * 展示吐司
     * @param message 吐司内容
     */
    void showToast(String message);

    /***
     * 显示加载控件
     */
    void showLoading();

    /***
     * 隐藏加载控件
     */
    void hideLoading();

}
