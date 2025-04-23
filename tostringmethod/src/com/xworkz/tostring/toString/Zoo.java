package com.xworkz.tostring.toString;

public class Zoo {

    private String name;
    private String location;
    private int animals;
    private double area;

    public Zoo() {
    }
@Override
    public String toString() {
        return "Zoo:(name:" + this.name + ",\n location:" + this.location + ",\n animals:" + this.animals + ",\n area:" + this.area + ")";
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getAnimals() { return animals; }
    public double getArea() { return area; }

    public void setName(String name) { this.name = name; }
    public void setLocation(String location) { this.location = location; }
    public void setAnimals(int animals) { this.animals = animals; }
    public void setArea(double area) { this.area = area; }
}
