package com.zhu.zjut.jianshu.application;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.zhu.zjut.jianshu.cache.AppConfig;

/**
 * Created by LaoZhu on 2016/10/26.
 */
public class MyApplication extends Application {

    public static Context mContext;
    public static AppConfig appConfig;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        appConfig = new AppConfig(mContext);

    }
}
