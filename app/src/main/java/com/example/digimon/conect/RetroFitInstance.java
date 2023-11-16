package com.example.digimon.conect;


import static com.example.digimon.MainActivity.apiUrl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitInstance {
    public static RetroFitInstance instance;

    private Connection connection;


    RetroFitInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       connection = retrofit.create(Connection.class);
    }
    public static RetroFitInstance getInstance() {
        if (instance == null) {
            instance = new RetroFitInstance();
        }
        return instance;
    }
    public Connection getApiInterface() {
        return connection;
    }
}





