package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 森宇 on 2018/4/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}
