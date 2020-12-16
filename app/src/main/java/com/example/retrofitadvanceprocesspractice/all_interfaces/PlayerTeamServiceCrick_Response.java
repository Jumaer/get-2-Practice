package com.example.retrofitadvanceprocesspractice.all_interfaces;

import com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_players.ArrayDesign1Class;
import com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_teams.TeamsCrickData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PlayerTeamServiceCrick_Response {

    @GET("teams/{id}")
    Call<TeamsCrickData> get_TeamDataService(@Path("id") int id, @Query("api_token") String ApiToken);

    @GET("players")
    Call<ArrayDesign1Class> get_PlayerDataService(@Query("api_token") String ApiToken, @Query("country_id") int cid);
}
