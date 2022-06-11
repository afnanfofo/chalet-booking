package com.example.chaletbooking.data;

import com.example.chaletbooking.pojo.ChaletModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface chaletInterface {

        @GET("chalet")
        public Call<List<ChaletModel>> getchalet();
    }

