package com.xinghai.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import junit.runner.Version;

public class CoolWeatherDB {
    public static final String DB_NAME = "cool_weather";
    public static final int VERSION = 1;
    private static CoolWeatherDB coolWeatherDB;
    private SQLiteDatabase db;

    private CoolWeatherDB(Context context) {
        CoolWeatherOpenHelper dbHelper = new CoolWeatherOpenHelper(context,DB_NAME,null, VERSION);
        db= dbHelper.getWritableDatabase();
    }
}
