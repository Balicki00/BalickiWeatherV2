package com.example.balickiweather.dataCity;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class JsonObj {

    @SerializedName("coord")
    @Expose
    public Coord coord;
    @SerializedName("weather")
    @Expose
    public List<Weather> weather = null;
    @SerializedName("base")
    @Expose
    public String base;
    @SerializedName("main")
    @Expose
    public Main main;
    @SerializedName("visibility")
    @Expose
    public Integer visibility;
    @SerializedName("wind")
    @Expose
    public Wind wind;
    @SerializedName("clouds")
    @Expose
    public Clouds clouds;
    @SerializedName("dt")
    @Expose
    public Integer dt;
    @SerializedName("sys")
    @Expose
    public Sys sys;
    @SerializedName("timezone")
    @Expose
    public Integer timezone;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("cod")
    @Expose
    public Integer cod;

    public JsonObj withCoord(Coord coord) {
        this.coord = coord;
        return this;
    }

    public JsonObj withWeather(List<Weather> weather) {
        this.weather = weather;
        return this;
    }

    public JsonObj withBase(String base) {
        this.base = base;
        return this;
    }

    public JsonObj withMain(Main main) {
        this.main = main;
        return this;
    }

    public JsonObj withVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }

    public JsonObj withWind(Wind wind) {
        this.wind = wind;
        return this;
    }

    public JsonObj withClouds(Clouds clouds) {
        this.clouds = clouds;
        return this;
    }

    public JsonObj withDt(Integer dt) {
        this.dt = dt;
        return this;
    }

    public JsonObj withSys(Sys sys) {
        this.sys = sys;
        return this;
    }

    public JsonObj withTimezone(Integer timezone) {
        this.timezone = timezone;
        return this;
    }

    public JsonObj withId(Integer id) {
        this.id = id;
        return this;
    }

    public JsonObj withName(String name) {
        this.name = name;
        return this;
    }

    public JsonObj withCod(Integer cod) {
        this.cod = cod;
        return this;
    }

}