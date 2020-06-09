package com.example.card_view_example.model;

import android.widget.ImageView;

public class Post {
    String name, location, legend;

    int image;

    public Post() {}

    public Post(String name, String location, String legend, int image) {
        this.name = name;
        this.location = location;
        this.legend = legend;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLegend() {
        return legend;
    }

    public void setLegend(String legend) {
        this.legend = legend;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
