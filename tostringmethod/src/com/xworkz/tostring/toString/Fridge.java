package com.xworkz.tostring.toString;

public class Fridge {

    private String brand;
    private String model;
    private int capacity;
    private String color;
    private double price;

    public Fridge() {
    }
@Override
    public String toString() {
        return "Fridge:(brand:" + this.brand + ",\n model:" + this.model + ",\n capacity:" + this.capacity + ",\n color:" + this.color + ",\n price:" + this.price + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
