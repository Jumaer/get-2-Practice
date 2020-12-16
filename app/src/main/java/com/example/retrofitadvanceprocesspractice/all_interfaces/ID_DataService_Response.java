package com.example.retrofitadvanceprocesspractice.all_interfaces;

import com.example.retrofitadvanceprocesspractice.crick_data_pojos.MainDataResponse;
import com.example.retrofitadvanceprocesspractice.crick_data_pojos.ObjectDataResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ID_DataService_Response {


    @GET("continents/{id}")
    Call<ObjectDataResponse> get_id_MainDataResponseService(@Path("id") int id, @Query("api_token") String ApiToken);
}
