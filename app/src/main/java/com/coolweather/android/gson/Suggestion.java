package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 森宇 on 2018/4/16.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Support support;

    public class Comfort{
        @SerializedName("text")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Support{
        @SerializedName("txt")
        public String info;
    }
}
