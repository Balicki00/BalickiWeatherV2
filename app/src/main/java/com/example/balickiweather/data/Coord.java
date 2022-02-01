package com.example.balickiweather.data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Coord {

    @SerializedName("lon")
    private double lon;
    @SerializedName("lat")
    private double lat;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

}