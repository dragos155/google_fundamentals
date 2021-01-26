package com.example.proiectfinal;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitInterface {
    @GET("v6/41b8ae60232ccf2509faba7e/latest/{currency}")
    Call<JsonObject> getExchangeCurrency(@Path("currency") String currency);
}
