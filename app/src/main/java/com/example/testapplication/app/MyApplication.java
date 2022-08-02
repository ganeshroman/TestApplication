package com.example.testapplication.app;

import android.app.Application;

import com.example.testapplication.utils.SharedPreferencesHelper;


/**
 * Global Application Level class
 *
 * @author Ganesh Roman
 * Created on 8/2/22.
 */
public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        SharedPreferencesHelper.getInstance().setInstallationTime(System.currentTimeMillis());
    }

    public static MyApplication getInstance() {
        return instance;
    }
}
