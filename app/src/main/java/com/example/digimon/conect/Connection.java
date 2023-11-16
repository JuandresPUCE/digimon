package com.example.digimon.conect;

import com.example.digimon.models.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Connection {
    //String apiUrl = "https://digimon-api.vercel.app/api/digimon";
    @GET("digimon")
    Call<List<Model>> getDigimon();
    }
