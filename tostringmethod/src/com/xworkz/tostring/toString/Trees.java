package com.xworkz.tostring.toString;

public class Trees {

    private String species;
    private double height;
    private int age;
    private String location;
    private String type;

    public Trees() {
    }
@Override
    public String toString() {
        return "Trees:(species:" + this.species + ",\n height:" + this.height + ",\n age:" + this.age + ",\n location:" + this.location + ",\n type:" + this.type + ")";
    }

    public String getSpecies() {
        return species;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }
}
