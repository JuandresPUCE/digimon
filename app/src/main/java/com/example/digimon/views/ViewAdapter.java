package com.example.digimon.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digimon.R;
import com.example.digimon.models.Model;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context context;
    private List<Model> digimonList;

public ViewAdapter(Context context, List<Model> digimonList) {
        this.context = context;
        this.digimonList = digimonList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.digimon_item, parent, false));
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getName().setText(digimonList.get(position).getName());
        holder.getLevel().setText(digimonList.get(position).getLevel());
        Picasso.get().load(digimonList.get(position).getImg()).into(holder.getImg());

    }

    @Override
    public int getItemCount() {
        return digimonList.size();
    }
}









