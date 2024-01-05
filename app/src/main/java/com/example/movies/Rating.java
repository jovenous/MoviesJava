package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("kp")
    private float ratingKp;

    public Rating(float ratingKp) {
        this.ratingKp = ratingKp;
    }

    public float getRatingKp() {
        return ratingKp;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingKp=" + ratingKp +
                '}';
    }
}
