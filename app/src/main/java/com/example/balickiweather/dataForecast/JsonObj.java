package com.example.balickiweather.dataForecast;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class JsonObj {

    @SerializedName("lat")
    @Expose
    public double lat;
    @SerializedName("lon")
    @Expose
    public double lon;
    @SerializedName("timezone")
    @Expose
    public String timezone;
    @SerializedName("timezone_offset")
    @Expose
    public Integer timezoneOffset;
    @SerializedName("daily")
    @Expose
    public List<Daily> daily = null;

    public JsonObj withLat(Integer lat) {
        this.lat = lat;
        return this;
    }

    public JsonObj withLon(Integer lon) {
        this.lon = lon;
        return this;
    }

    public JsonObj withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public JsonObj withTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    public JsonObj withDaily(List<Daily> daily) {
        this.daily = daily;
        return this;
    }

}