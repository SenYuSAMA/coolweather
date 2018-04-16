package com.coolweather.android.gson;

/**
 * Created by 森宇 on 2018/4/16.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
