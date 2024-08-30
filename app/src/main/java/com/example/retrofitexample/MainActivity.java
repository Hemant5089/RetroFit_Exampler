package com.example.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
   ///photos
     public  static   String api = "https://jsonplaceholder.typicode.com";
     List<UserModel> allUsersList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      RetrofitInstance.getInstance().apiInterface.getUser().enqueue(new Callback<List<UserModel>>() {
          @Override
          public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
              Log.e("api" , "onFailure: " + response.body().toString());
              allUsersList = response.body();


          }

          @Override
          public void onFailure(Call<List<UserModel>> call, Throwable t) {
              Log.d("api" , "onFailure: " + t.getLocalizedMessage());
          }
      });

    }
}