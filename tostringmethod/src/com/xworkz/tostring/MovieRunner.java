package com.xworkz.tostring;

import com.xworkz.tostring.toString.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(148);
        movie.setGenre("Sci-Fi");

        System.out.println(movie.toString());
    }
}
