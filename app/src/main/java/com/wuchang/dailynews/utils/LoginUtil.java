package com.wuchang.dailynews.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2018/6/22.
 */

public class LoginUtil {

    public static Boolean loginSuccess (Context context) {
        SharedPreferences sp = context.getSharedPreferences("User", Context.MODE_PRIVATE);
        return sp.getBoolean("LoginSuccess", false);
    }
}
