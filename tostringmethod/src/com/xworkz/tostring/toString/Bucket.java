package com.xworkz.tostring.toString;

public class Bucket {

    private String material;
    private double capacity;
    private String color;
    private double weight;
    private String shape;

    public Bucket() {
    }
@Override
    public String toString() {
        return "Bucket:(material:" + this.material + ",\n capacity:" + this.capacity + ",\n color:" + this.color + ",\n weight:" + this.weight + ",\n shape:" + this.shape + ")";
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

    public double getWeight() {
        return weight;
    }

    public String getShape() {
        return shape;
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
