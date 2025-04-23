package com.xworkz.tostring.toString;

public class Paint {

    private String brand;
    private String color;
    private double quantity;
    private double price;

    public Paint() {
    }
@Override
    public String toString() {
        return "Paint:(brand:" + this.brand + ",\n color:" + this.color + ",\n quantity:" + this.quantity + ",\n price:" + this.price + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
