package com.xworkz.tostring.toString;

public class Food {

    private String name;
    private String cuisine;
    private boolean isVegetarian;
    private double price;

    public Food() {
    }
@Override
    public String toString() {
        return "Food:(name:" + this.name + ",\n cuisine:" + this.cuisine + ",\n isVegetarian:" + this.isVegetarian + ",\n price:" + this.price + ")";
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
