package com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_teams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamsCrickData {

        @SerializedName("resource")
        @Expose
        private String resource;
        @SerializedName("id")
        @Expose
        private Integer id;

    public TeamsCrickData() {
    }

    @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("image_path")
        @Expose
        private String imagePath;
        @SerializedName("country_id")
        @Expose
        private int countryId;

    public TeamsCrickData(String name, int countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    @SerializedName("national_team")
        @Expose
        private Boolean nationalTeam;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public String getResource() {
        return resource;
    }

        public void setResource(String resource) {
        this.resource = resource;
    }

        public Integer getId() {
        return id;
    }

        public void setId(Integer id) {
        this.id = id;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public String getCode() {
        return code;
    }

        public void setCode(String code) {
        this.code = code;
    }

        public String getImagePath() {
        return imagePath;
    }

        public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

        public int getCountryId() {
        return countryId;
    }

        public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

        public Boolean getNationalTeam() {
        return nationalTeam;
    }

        public void setNationalTeam(Boolean nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

        public String getUpdatedAt() {
        return updatedAt;
    }

        public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    }







