package com.neu.model;

public class Movie {
    private int mid;
    private String name;
    private String descri;
    private String timelong;
    private String shoot;
    private String issue;
    private String language;
    private String genres;
    private String director;
    private String actors;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getTimelong() {
        return timelong;
    }

    public void setTimelong(String timelong) {
        this.timelong = timelong;
    }

    public String getShoot() {
        return shoot;
    }

    public void setShoot(String shoot) {
        this.shoot = shoot;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mid=" + mid +
                ", name='" + name + '\'' +
                ", descri='" + descri + '\'' +
                ", timelong='" + timelong + '\'' +
                ", shoot='" + shoot + '\'' +
                ", issue='" + issue + '\'' +
                ", language='" + language + '\'' +
                ", genres='" + genres + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                '}';
    }
}
