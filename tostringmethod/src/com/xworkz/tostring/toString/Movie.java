package com.xworkz.tostring.toString;

public class Movie {

    private String title;
    private String director;
    private int duration;
    private String genre;

    public Movie() {
    }
@Override
    public String toString() {
        return "Movie:(title:" + this.title + ",\n director:" + this.director + ",\n duration:" + this.duration + ",\n genre:" + this.genre + ")";
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
