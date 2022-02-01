package com.example.balickiweather.dataCity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("temp")
    @Expose
    public Float temp;
    @SerializedName("feels_like")
    @Expose
    public Float feelsLike;
    @SerializedName("temp_min")
    @Expose
    public Float tempMin;
    @SerializedName("temp_max")
    @Expose
    public Float tempMax;
    @SerializedName("pressure")
    @Expose
    public Integer pressure;
    @SerializedName("humidity")
    @Expose
    public Integer humidity;

    public Main withTemp(Float temp) {
        this.temp = temp;
        return this;
    }

    public Main withFeelsLike(Float feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public Main withTempMin(Float tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    public Main withTempMax(Float tempMax) {
        this.tempMax = tempMax;
        return this;
    }

    public Main withPressure(Integer pressure) {
        this.pressure = pressure;
        return this;
    }

    public Main withHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

}