package com.xworkz.tostring.toString;

public class Snacks {

    private String name;
    private String type;
    private double price;
    private String brand;
    private String flavor;

    public Snacks() {
    }
@Override
    public String toString() {
        return "Snacks:(name:" + this.name + ",\n type:" + this.type + ",\n price:" + this.price + ",\n brand:" + this.brand + ",\n flavor:" + this.flavor + ")";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
