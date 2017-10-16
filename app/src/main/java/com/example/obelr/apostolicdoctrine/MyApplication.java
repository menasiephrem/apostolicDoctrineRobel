package com.example.obelr.apostolicdoctrine;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;

/**
 * Created by gebeya-admin on 10/12/17.
 */

public class MyApplication extends Application {

    private final static String PREF_THEME = "pref_theme";

    @Override
    public void onCreate() {
        super.onCreate();
        constant.color =readTheme(getApplicationContext(),10);
        new Methods().setColorTheme();
    }

    static void saveTheme(Context context, Integer FileValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_THEME,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(PREF_THEME,FileValue);
        editor.apply();
    }

    static int readTheme(Context context, Integer DefValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_THEME,
                Context.MODE_PRIVATE);
        return sharedPreferences.getInt(PREF_THEME,DefValue);

    }

}
