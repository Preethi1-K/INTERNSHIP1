package com.xworkz.tostring.toString;

public class Garden {

    private String name;
    private String city;
    private int trees;
    private boolean hasFountain;

    public Garden() {
    }
@Override
    public String toString() {
        return "Garden:(name:" + this.name + ",\n city:" + this.city + ",\n trees:" + this.trees + ",\n hasFountain:" + this.hasFountain + ")";
    }

    public String getName() { return name; }
    public String getCity() { return city; }
    public int getTrees() { return trees; }
    public boolean isHasFountain() { return hasFountain; }

    public void setName(String name) { this.name = name; }
    public void setCity(String city) { this.city = city; }
    public void setTrees(int trees) { this.trees = trees; }
    public void setHasFountain(boolean hasFountain) { this.hasFountain = hasFountain; }
}
