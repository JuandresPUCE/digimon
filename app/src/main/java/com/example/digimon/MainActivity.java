package com.example.digimon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.digimon.conect.RetroFitInstance;
import com.example.digimon.models.Model;
import com.example.digimon.views.ViewAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    //public static String apiUrl = "https://digimon-api.vercel.app/api/digimon";
    public static String apiUrl = "https://digimon-api.vercel.app/api/";
    private RecyclerView rcvMain;
    private List<Model> digimonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvMain= findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new LinearLayoutManager(this));
        RetroFitInstance.getInstance().getApiInterface().getDigimon().enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                digimonList = response.body();
                rcvMain.setAdapter(new ViewAdapter(getApplicationContext(),digimonList));
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Log.e("API", "onFailure:" + t.getLocalizedMessage());
            }
        });
    }
}
