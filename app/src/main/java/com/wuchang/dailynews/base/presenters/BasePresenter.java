package com.wuchang.dailynews.base.presenters;

public interface BasePresenter {

    /***
     * 对应onCreate生命周期
     */
    void onCreate();

    /***
     * 对应onResume生命周期
     */
    void onResume();

    /***
     * 对应onStart生命周期
     */
    void onStart();

    /***
     * 对应onPause生命周期
     */
    void onPause();

    /***
     * 对应onStop生命周期
     */
    void onStop();

    /***
     * 对应onDestroy生命周期
     */
    void onDestroy();

}
