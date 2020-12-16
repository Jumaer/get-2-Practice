package com.example.retrofitadvanceprocesspractice.real_api_data_relationship.crick_teams;

public class TeamCrick {
    private String name;
    private int country_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public TeamCrick() {
    }

    public TeamCrick(String name, int country_id) {
        this.name = name;
        this.country_id = country_id;
    }
}
