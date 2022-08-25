package com.example.detailmoviejava.network;

import com.example.detailmoviejava.model.Item;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    String SERVER = "https://springfilm.herokuapp.com";
    @GET("/apifree/home")
    Call<Item> apiGetDataItem();
}
