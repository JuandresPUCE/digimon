package com.example.digimon.views;

import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digimon.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.digimonName);
        img= itemView.findViewById(R.id.imageView);
        level = itemView.findViewById(R.id.level);

    }
    public TextView getName() {
        return name;
    }

    private TextView name;

    public ImageView getImg() {
        return img;
    }

    public TextView getLevel() {
        return level;
    }

    private ImageView img;
    private TextView level;

}

