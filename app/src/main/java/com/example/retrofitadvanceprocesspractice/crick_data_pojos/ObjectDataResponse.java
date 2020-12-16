package com.example.retrofitadvanceprocesspractice.crick_data_pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ObjectDataResponse {
    @SerializedName("data")
    @Expose
    private Datum data;

    public Datum getData() {
        return data;
    }

    public void setData(Datum data) {
        this.data = data;
    }

    public ObjectDataResponse(Datum data) {
        this.data = data;
    }

    public ObjectDataResponse() {
    }
}
