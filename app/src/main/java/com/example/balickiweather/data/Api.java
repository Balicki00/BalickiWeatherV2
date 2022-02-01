package com.example.balickiweather.data;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface Api {
        @GET("weather")
        Call<Post> getPost(@Query("lat") String lat,@Query("lon") String lon, @Query("units") String units ,@Query("appid") String appid);
   // @GET("weather?lat=69&lon=69&appid=f3b5a40c344c7013895e06fd6e666d29")
    //Call<Post> getPost();

    }

