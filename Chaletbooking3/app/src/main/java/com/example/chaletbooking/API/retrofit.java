package com.example.chaletbooking.API;

import com.example.chaletbooking.pojo.ChaletModel;
import com.example.chaletbooking.pojo.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofit {

    private retrofitAPI api;
    private static retrofit instance;


    private retrofit() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://60b32f3a1bec230017bf3492.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(retrofitAPI.class);
    }

    public static retrofit getInstance() {
        if (instance == null) {
            instance = new retrofit();
        }
        return instance;
    }

    public Call<List<Model>> getUser(String userName, String password) {
        return api.getUser(userName, password);
    }

    public Call<Model> setUser(Model user) {
        return api.setUser(user);
    }


    public Call<List<ChaletModel>> getchalet() {
        return api.getchalet();
    }

    public Call<List<ChaletModel>> getChaletTitle(String title) {
        return api.getChalet(title);



    }
}








