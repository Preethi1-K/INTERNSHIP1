package com.xworkz.tostring.toString;

public class Grinder {

    private String brand;
    private String type;
    private int power;
    private String color;
    private double price;

    public Grinder() {
    }
@Override
    public String toString() {
        return "Grinder:(brand:" + this.brand + ",\n type:" + this.type + ",\n power:" + this.power + ",\n color:" + this.color + ",\n price:" + this.price + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
