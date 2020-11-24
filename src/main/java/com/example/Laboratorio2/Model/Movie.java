package com.example.Laboratorio2.Model;
public class Movie {
    
    public Movie() {
    }

    public Movie(int _id, int _year, String _title, String _poster, String _description) {
        this.id = _id;
        this.year = _year;
        this.title = _title;
        this.poster = _poster;
        this.description = _description;
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
    // Añado poster
    private String poster;
    public String getPoster(){
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    // Añado description
    private String description;
    public String getDescription(){
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}