package com.example.digimon.models;

import com.google.gson.annotations.SerializedName;

public class Model {

        private String name; //name para el json
        @SerializedName("img") //thumbnail del json
        private String img; //thumbnailUrl del json

        @SerializedName("level")
        private String level; //nivel digimon

    public String getName() {
        return name;
    }


    public String getImg() {
        return img;
    }

    public String getLevel() {
        return level;
    }

    public Model(String name, String img, String level) {
        this.name = name;

        this.img = img;
        this.level = level;
    }
}
