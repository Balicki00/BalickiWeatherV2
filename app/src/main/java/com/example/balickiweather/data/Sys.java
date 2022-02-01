package com.example.balickiweather.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Sys {

    @SerializedName("sunrise")

    private Integer sunrise;
    @SerializedName("sunset")

    private Integer sunset;

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

}
