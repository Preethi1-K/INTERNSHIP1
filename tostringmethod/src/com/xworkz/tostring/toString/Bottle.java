package com.xworkz.tostring.toString;

public class Bottle {

    private String brand;
    private double capacity;
    private String material;
    private String color;

    public Bottle() {
    }
@Override
    public String toString() {
        return "Bottle:(brand:" + this.brand + ",\n capacity:" + this.capacity + ",\n material:" + this.material + ",\n color:" + this.color + ")";
    }

    public String getBrand() {
        return brand;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
