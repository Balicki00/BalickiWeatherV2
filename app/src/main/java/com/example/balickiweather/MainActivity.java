package com.example.balickiweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.balickiweather.data.Api;
import com.example.balickiweather.dataCity.ApiByCity;
import com.example.balickiweather.data.Post;
import com.example.balickiweather.dataCity.JsonObj;
import com.example.balickiweather.dataForecast.ApiForecast;
import com.example.balickiweather.dataForecast.Daily;


import java.io.IOException;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import android.Manifest;

public class MainActivity extends AppCompatActivity {
    Post data;
    JsonObj dataCity;
    com.example.balickiweather.dataForecast.JsonObj dataForecast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    1);
        }

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        double longitude = 0;
        double latitude = 0;

        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        longitude = location.getLongitude();
        latitude = location.getLatitude();
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        List<Address> addresses = null;
        try {
            addresses = geocoder.getFromLocation(latitude, longitude, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String cityName = addresses.get(0).getAddressLine(0);

        //String city= addresses.get(0).getAddressLine(1);
        String stateName = addresses.get(0).getAddressLine(1);
        String countryName = addresses.get(0).getAddressLine(2);

        String lat=Double.toString(latitude);
        String lon = Double.toString(longitude);


             Call<Post> call= api.getPost(lat,lon,"metric","f3b5a40c344c7013895e06fd6e666d29");

            call.enqueue(new Callback<Post>() {
                @Override
                public void onResponse(Call<Post> call, Response<Post> response) {
                    data= response.body();
                    TextView temperature = (TextView) findViewById(R.id.text);
                    double tem = data.getMain().getTemp();
                    double total = Math.round(tem * 10) / 10.0;
                    String result = Double.toString(total)+" \u2103"+" "+cityName;
                    temperature.setText(result);
                }

                @Override
                public void onFailure(Call<Post> call, Throwable t) {
                    System.out.println("FAIL");
                }
            });



        Retrofit retrofit3 = new Retrofit.Builder().
                baseUrl("https://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiForecast api3 = retrofit3.create(ApiForecast.class);
        String exclude = "current,minutely,hourly,alerts";

        Call<com.example.balickiweather.dataForecast.JsonObj> call3= api3.getPost(lat,lon,exclude,"metric","f3b5a40c344c7013895e06fd6e666d29");
        TextView day1 = (TextView) findViewById(R.id.textViewDay1); // temperatury na 1 dni do przodu
        call3.enqueue(new Callback<com.example.balickiweather.dataForecast.JsonObj>() {
            @Override
            public void onResponse(Call<com.example.balickiweather.dataForecast.JsonObj> call, Response<com.example.balickiweather.dataForecast.JsonObj> response) {  //metoda, jak dostaniemy odp to sie wywoluje
                dataForecast= response.body(); //przypisywanie odp do zmiennej globalnej

                TextView day2 = (TextView) findViewById(R.id.textViewDay2);
                TextView day3 = (TextView) findViewById(R.id.textViewDay3);
                List<Daily> listDaily = dataForecast.daily; //wrzucamy dane do listy, wyciagamy z niej temperature

                day1.setText(String.valueOf(listDaily.get(1).temp.day));
                day2.setText(String.valueOf(listDaily.get(2).temp.day));
                day3.setText(String.valueOf(listDaily.get(3).temp.day));


            }

            @Override
            public void onFailure(Call<com.example.balickiweather.dataForecast.JsonObj> call, Throwable t) {
           // day1.setText(t.getMessage());

            }
        });






        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() { //coś co oczekuje jak klikniemy

            public void onClick(View v) { //jak klikniemy to sie wywoluje
                EditText city = (EditText) findViewById(R.id.editText);

                Retrofit retrofit2 = new Retrofit.Builder().
                        baseUrl("https://api.openweathermap.org/data/2.5/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                ApiByCity api2 = retrofit2.create(ApiByCity.class);
                String fetchedData = String.valueOf(city.getText()); //zczytujemy to co ktos wpisal w apce i wrzucamy to do zapytania
                 Call<JsonObj> call2= api2.getPost(fetchedData,"metric","f3b5a40c344c7013895e06fd6e666d29");
               // Call<JsonObj> call2 = api2.getPost();
                call2.enqueue(new Callback<JsonObj>() {

                    @Override
                    public void onResponse(Call<JsonObj> call, Response<JsonObj> response) {
                        dataCity = response.body();
                        TextView temp = (TextView) findViewById(R.id.textViewCity);
                        double stopnie = dataCity.main.temp;
                        double total = Math.round(stopnie* 10) / 10.0;
                        String result =  Double.toString(total)+" \u2103"+" "+dataCity.name;
                        temp.setText(result);

                    }

                    @Override
                    public void onFailure(Call<JsonObj> call, Throwable t) {

                    }
                });


                    }





            });
        }



    }

