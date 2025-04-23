package com.xworkz.tostring.toString;

public class Hotel {

    private String name;
    private String location;
    private int rating;
    private double pricePerNight;

    public Hotel() {
    }
@Override
    public String toString() {
        return "Hotel:(name:" + this.name + ",\n location:" + this.location + ",\n rating:" + this.rating + ",\n pricePerNight:" + this.pricePerNight + ")";
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getRating() {
        return rating;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
