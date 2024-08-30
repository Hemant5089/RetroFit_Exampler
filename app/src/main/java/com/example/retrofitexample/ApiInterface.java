package com.example.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface ApiInterface {
    @GET("/photos")
    Call<List<UserModel>> getUser();

}
