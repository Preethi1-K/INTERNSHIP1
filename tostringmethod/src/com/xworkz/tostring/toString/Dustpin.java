package com.xworkz.tostring.toString;

public class Dustpin {

    private String material;
    private double capacity;
    private String color;

    public Dustpin() {
    }
@Override
    public String toString() {
        return "Dustpin:(material:" + this.material + ",\n capacity:" + this.capacity + ",\n color:" + this.color + ")";
    }

    public String getMaterial() {
        return material;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
