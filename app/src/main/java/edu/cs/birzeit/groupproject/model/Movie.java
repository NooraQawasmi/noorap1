package edu.cs.birzeit.groupproject.model;

public class Movie {
    private String title;
    private int imageId;
    private String genre;
    private String description;
    private String year;

    public Movie(String title, int imageId, String genre, String description, String year) {
        this.title = title;
        this.imageId = imageId;
        this.genre = genre;
        this.description = description;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getYear() {
        return year;
    }

    public int getImageId(){
        return imageId;
    }

    public String getTitle(){
        return title;
    }

}
