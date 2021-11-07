package com.lost.pokemonprojecttest.model;

import java.io.Serializable;

public class Pokemon implements Serializable {

    private String name;
    private String description;
    private String imgURL;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pokemon(String name, String description, String imgURL, String type) {
        this.name = name;
        this.description = description;
        this.imgURL = imgURL;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
