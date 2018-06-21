package com.wuchang.dailynews.app;

/**
 * Created by Administrator on 2018/6/21.
 */

public class Application {
    /***
     * 注册接口
     * key=00d91e8e0cca2b76f515926a36db68f5 应用Key
     * phone=13594347817 用户名/ID 唯一
     * passwd=123654 密码
     * image=File文件 头像
     * name=peakchao 昵称/名字
     * text= 这是我的签名。 签名/备注
     * other=这是我的备注信息1 开发者需要使用的其他字段
     * other2=这是我的备注信息2 开发者需要使用的其他字段
     */
    public static final String URL_REGIST = "https://www.apiopen.top/createUser";
    /***
     * 登录接口
     * key=00d91e8e0cca2b76f515926a36db68f5 应用Key
     * phone=13594347817 用户名/ID 唯一
     * passwd=123654 密码
     */
    public static final String URL_LOGIN = "https://www.apiopen.top/login";
}
