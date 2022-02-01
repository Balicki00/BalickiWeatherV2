package com.example.balickiweather.dataForecast;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Daily {

    @SerializedName("dt")
    @Expose
    public Integer dt;
    @SerializedName("sunrise")
    @Expose
    public Integer sunrise;
    @SerializedName("sunset")
    @Expose
    public Integer sunset;
    @SerializedName("moonrise")
    @Expose
    public Integer moonrise;
    @SerializedName("moonset")
    @Expose
    public Integer moonset;
    @SerializedName("moon_phase")
    @Expose
    public Float moonPhase;
    @SerializedName("temp")
    @Expose
    public Temp temp;
    @SerializedName("feels_like")
    @Expose
    public FeelsLike feelsLike;
    @SerializedName("pressure")
    @Expose
    public Integer pressure;
    @SerializedName("humidity")
    @Expose
    public Integer humidity;
    @SerializedName("dew_point")
    @Expose
    public Float dewPoint;
    @SerializedName("wind_speed")
    @Expose
    public double windSpeed;
    @SerializedName("wind_deg")
    @Expose
    public double windDeg;
    @SerializedName("wind_gust")
    @Expose
    public Float windGust;
    @SerializedName("weather")
    @Expose
    public List<Weather> weather = null;
    @SerializedName("clouds")
    @Expose
    public Integer clouds;
    @SerializedName("pop")
    @Expose
    public Float pop;
    @SerializedName("snow")
    @Expose
    public Float snow;
    @SerializedName("uvi")
    @Expose
    public double uvi;

    public Daily withDt(Integer dt) {
        this.dt = dt;
        return this;
    }

    public Daily withSunrise(Integer sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public Daily withSunset(Integer sunset) {
        this.sunset = sunset;
        return this;
    }

    public Daily withMoonrise(Integer moonrise) {
        this.moonrise = moonrise;
        return this;
    }

    public Daily withMoonset(Integer moonset) {
        this.moonset = moonset;
        return this;
    }

    public Daily withMoonPhase(Float moonPhase) {
        this.moonPhase = moonPhase;
        return this;
    }

    public Daily withTemp(Temp temp) {
        this.temp = temp;
        return this;
    }

    public Daily withFeelsLike(FeelsLike feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public Daily withPressure(Integer pressure) {
        this.pressure = pressure;
        return this;
    }

    public Daily withHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

    public Daily withDewPoint(Float dewPoint) {
        this.dewPoint = dewPoint;
        return this;
    }

    public Daily withWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public Daily withWindDeg(Integer windDeg) {
        this.windDeg = windDeg;
        return this;
    }

    public Daily withWindGust(Float windGust) {
        this.windGust = windGust;
        return this;
    }

    public Daily withWeather(List<Weather> weather) {
        this.weather = weather;
        return this;
    }

    public Daily withClouds(Integer clouds) {
        this.clouds = clouds;
        return this;
    }

    public Daily withPop(Float pop) {
        this.pop = pop;
        return this;
    }

    public Daily withSnow(Float snow) {
        this.snow = snow;
        return this;
    }

    public Daily withUvi(Integer uvi) {
        this.uvi = uvi;
        return this;
    }

}