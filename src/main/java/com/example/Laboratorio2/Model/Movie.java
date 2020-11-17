package com.example.Laboratorio2.Model;
public class Movie {
    
    public Movie() {
    }

    public Movie(int _id, int _year, String _title, String _poster) {
        this.id = _id;
        this.year = _year;
        this.title = _title;
        this.poster = _poster;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String poster;
    public String getPoster(){
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }

}