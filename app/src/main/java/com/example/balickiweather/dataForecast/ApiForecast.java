package com.example.balickiweather.dataForecast;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiForecast {


        @GET("onecall")
        Call<JsonObj> getPost(@Query("lat") String lat,@Query("lon") String lon,@Query("exclude")String exclude, @Query("units") String units ,@Query("appid") String appid);
       // @GET("weather?q=wroclaw&units=metric&appid=f3b5a40c344c7013895e06fd6e666d29")
       // Call<JsonObj> getPost();
       // https://api.openweathermap.org/data/2.5/onecall?lat=69&lon=69&exclude=current,minutely,hourly,alerts&appid=f3b5a40c344c7013895e06fd6e666d29


}
