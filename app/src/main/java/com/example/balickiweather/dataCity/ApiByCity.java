package com.example.balickiweather.dataCity;



import com.example.balickiweather.data.Post;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiByCity {


        @GET("weather")
        Call<JsonObj> getPost(@Query("q") String city, @Query("units") String units , @Query("appid") String appid);
       // @GET("weather?q=wroclaw&units=metric&appid=f3b5a40c344c7013895e06fd6e666d29")
       // Call<JsonObj> getPost();


}
