package com.example.chaletbooking.data;

import com.example.chaletbooking.pojo.ChaletModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class chaletclient {
    private  static final  String BASEURL="https://60b32f3a1bec230017bf3492.mockapi.io/";
    private chaletInterface chaletInterface;

    private static chaletclient INSTANCE;



    public chaletclient(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        chaletInterface=retrofit.create(chaletInterface.class);

    }
    public static chaletclient getINSTANCE() {
        if(null==INSTANCE){
            INSTANCE=new chaletclient();
        }
        return INSTANCE;
    }

  public Call<List<ChaletModel>> getchalet(){
        return chaletInterface.getchalet();
  }




}


