
package com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_players;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArrayDesign1Class {

    @SerializedName("data")
    @Expose
    private List<ObjectDesign1Class> data = null;

    public List<ObjectDesign1Class> getData() {
        return data;
    }

    public void setData(List<ObjectDesign1Class> data) {
        this.data = data;
    }

}
