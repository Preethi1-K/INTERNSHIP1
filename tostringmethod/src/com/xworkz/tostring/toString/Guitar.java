package com.xworkz.tostring.toString;

public class Guitar {

    private String brand;
    private String type;
    private int strings;
    private double price;

    public Guitar() {
    }
@Override
    public String toString() {
        return "Guitar:(brand:" + this.brand + ",\n type:" + this.type + ",\n strings:" + this.strings + ",\n price:" + this.price + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getStrings() {
        return strings;
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

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
