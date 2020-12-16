package com.example.retrofitadvanceprocesspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.retrofitadvanceprocesspractice.all_interfaces.PlayerTeamServiceCrick_Response;
import com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_players.ArrayDesign1Class;
import com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_players.ArrayDesign1Class;
import com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_players.ObjectDesign1Class;
import com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_players.ObjectDesign1Class;
import com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_players.Position;
import com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_teams.TeamsCrickData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static  final String BASE_URL ="https://cricket.sportmonks.com/api/v2.0/";
    private static final String API = "AG3PhlKtump7Bf7xbr4mpayEFQvjSyTPBRG14LJP8FieGk3cVDWO5C95WFDp";
    private static final int id = 10;
  int cid =0;
    PlayerTeamServiceCrick_Response teamServiceCrick_response;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();



      //For Team and Player Data Service..
         teamServiceCrick_response = retrofit.create(PlayerTeamServiceCrick_Response.class);

         Call<TeamsCrickData> crickDataCall = teamServiceCrick_response.get_TeamDataService(id,API);

         crickDataCall.enqueue(new Callback<TeamsCrickData>() {
             @Override
             public void onResponse(Call<TeamsCrickData> call, Response<TeamsCrickData> response) {

                 if(response.isSuccessful()){
                     cid =  response.body().getCountryId();
                     String c_name =  response.body().getName();


                     Call<ArrayDesign1Class> player_crickDataCall = teamServiceCrick_response.get_PlayerDataService(API,cid);

                     player_crickDataCall.enqueue(new Callback<ArrayDesign1Class>() {
                         @Override
                         public void onResponse(Call<ArrayDesign1Class> call, Response<ArrayDesign1Class> response) {



                                 try{
                                     List<ObjectDesign1Class> objectDesignClasses=  response.body().getData();
                                     for(ObjectDesign1Class objectDesignClass : objectDesignClasses){
                                         String full_name =   objectDesignClass.getFullname();
                                         String date_of_B =   objectDesignClass.getDateofbirth();
                                         String gender =  objectDesignClass.getGender();

                                         Position position = objectDesignClass.getPosition();
                                         String name =   position.getName();
                                         int id =   position.getId();





                                         Log.d("full_name",String.valueOf(full_name));
                                         Log.d("date_of_B",String.valueOf(date_of_B));
                                         Log.d("gender",String.valueOf(gender));
                                         Log.d("name",String.valueOf(name));
                                         Log.d("id",String.valueOf(id));








                                     }

                                 }
                                 catch(Exception e){
                                     System.out.println(e);
                                 }



                         }

                         @Override
                         public void onFailure(Call<ArrayDesign1Class> call, Throwable t) {
                             Log.d("response","Something wrong, Failed");
                         }
                     });
                 }


                 else{
                     Log.d("response","Net is ok but, it is not working (may be server issue), Failed");
                 }



               }


             @Override
             public void onFailure(Call<TeamsCrickData> call, Throwable t) {
                 Log.d("response","It is not working, Failed");
             }
         });
















//  //For Single data response with id number...
//
//
//        ID_DataService_Response service_id = retrofit.create(ID_DataService_Response.class);
//        Call<ObjectDataResponse> dataResponse_id = service_id.get_id_MainDataResponseService(id,API);
//        dataResponse_id.enqueue(new Callback<ObjectDataResponse>() {
//            @Override
//            public void onResponse(Call<ObjectDataResponse> call, Response<ObjectDataResponse> response) {
//                   if(response.code()==200){
//                   Datum datum =    response.body().getData();
//
//
//               Log.d("id", String.valueOf(datum.getId()));
//              Log.d("name",datum.getName());
//              Log.d("resource",datum.getResource());
//              Log.d("updated_at",datum.getUpdatedAt());
//
//
//                   }
//            }
//
//            @Override
//            public void onFailure(Call<ObjectDataResponse> call, Throwable t) {
//                Log.d("response","fail");
//
//            }
//        });
//
//
//
//
//
//






   //  For full array list data response..


 // DataServiceCrick_forResponse service = retrofit.create(DataServiceCrick_forResponse.class);
// Call< MainDataResponse> dataResponse = service.getMainDataResponseService(API);
//
//    dataResponse.enqueue(new Callback<MainDataResponse>() {
//        @Override
//        public void onResponse(Call<MainDataResponse> call, Response<MainDataResponse> response) {
//            if(response.code()==200){
//
//            List<Datum> datumList = response.body().getData();
//            for(Datum  datum : datumList){
//                Log.d("id", String.valueOf(datum.getId()));
//                Log.d("name",datum.getName());
//                Log.d("resource",datum.getResource());
//                Log.d("updated_at",datum.getUpdatedAt());
//
//
//            }
//
//
//            }
//            else{
//
//            }
//
//        }
//
//        @Override
//        public void onFailure(Call<MainDataResponse> call, Throwable t) {
//
//        }
//    });
//
//


    }
}