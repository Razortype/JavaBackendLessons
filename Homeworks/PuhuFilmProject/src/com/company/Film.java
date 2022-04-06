package com.company;

public class Film {

    private int id;
    private String name;
    private String poster;

    private int date;
    private String directorName;
    private String summary;

    public Film(int id, String name, String posterUrl, int date, String directorName, String summary) {
        this.id = id;
        this.name = name;
        this.poster = posterUrl;

        this.date = date;
        this.directorName = directorName;
        this.summary = summary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDate() {
        return date;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getPoster() {
        return this.poster;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
