package com.example.retrofitadvanceprocesspractice.all_interfaces;

import com.example.retrofitadvanceprocesspractice.crick_data_pojos.MainDataResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataServiceCrick_forResponse {

       @GET("continents")
       Call< MainDataResponse > getMainDataResponseService(@Query("api_token") String ApiToken);

}
