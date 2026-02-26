package edu.iesam.features.albums.domain;

public class Album {

    private int id;
    private String name;
    private int year;

    public Album(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
}
