package com.xworkz.tostring.toString;

public class Fruits {

    private String name;
    private String color;
    private double weight;
    private boolean isSeasonal;

    public Fruits() {
    }
@Override
    public String toString() {
        return "Fruits:(name:" + this.name + ",\n color:" + this.color + ",\n weight:" + this.weight + ",\n isSeasonal:" + this.isSeasonal + ")";
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isSeasonal() {
        return isSeasonal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSeasonal(boolean seasonal) {
        isSeasonal = seasonal;
    }
}
