package com.xworkz.tostring.toString;

public class Cloth {

    private String material;
    private String color;
    private double price;
    private double length;

    public Cloth() {
    }
@Override
    public String toString() {
        return "Cloth:(material:" + this.material + ",\n color:" + this.color + ",\n price:" + this.price + ",\n length:" + this.length + ")";
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
