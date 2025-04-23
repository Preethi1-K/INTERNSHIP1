package com.xworkz.tostring.toString;

public class Wallet {

    private String brand;
    private String material;
    private double price;
    private String color;
    private boolean isLeather;

    public Wallet() {
    }
@Override
    public String toString() {
        return "Wallet:(brand:" + this.brand + ",\n material:" + this.material + ",\n price:" + this.price + ",\n color:" + this.color + ",\n isLeather:" + this.isLeather + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isLeather() {
        return isLeather;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLeather(boolean isLeather) {
        this.isLeather = isLeather;
    }
}
