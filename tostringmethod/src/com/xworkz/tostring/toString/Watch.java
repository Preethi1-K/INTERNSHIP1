package com.xworkz.tostring.toString;

public class Watch {

    private String brand;
    private String type;
    private double price;
    private String color;

    public Watch() {
    }
@Override
    public String toString() {
        return "Watch:(brand:" + this.brand + ",\n type:" + this.type + ",\n price:" + this.price + ",\n color:" + this.color + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
