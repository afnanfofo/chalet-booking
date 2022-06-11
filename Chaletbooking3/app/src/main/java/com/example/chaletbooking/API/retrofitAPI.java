package com.example.chaletbooking.API;

import android.graphics.ColorSpace;

import com.example.chaletbooking.pojo.ChaletModel;
import com.example.chaletbooking.pojo.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface retrofitAPI {
    @GET("/users/")
    Call<List<Model>> getUser(@Query("UserName") String userName, @Query("password") String password);

    @POST("/users/")
    Call<Model> setUser(@Body Model user);


    @GET("chalet")
    Call<List<ChaletModel>> getchalet();

    @GET("/users/")
    Call<List<ChaletModel>> getChalet(@Query("title") String title);


}
