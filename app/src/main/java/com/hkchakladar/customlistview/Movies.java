package com.hkchakladar.customlistview;

public class Movies {

    String title;
    String rating;
    String released;
    int poster;

    public Movies() {
    }

    public Movies(String title, String rating, String released, int poster) {
        this.title = title;
        this.rating = rating;
        this.released = released;
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public String getReleased() {
        return released;
    }

    public int getPoster() {
        return poster;
    }

}
