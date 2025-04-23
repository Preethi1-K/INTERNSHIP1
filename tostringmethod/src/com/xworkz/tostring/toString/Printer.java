package com.xworkz.tostring.toString;

public class Printer {

    private String brand;
    private String model;
    private String type;
    private double price;

    public Printer() {
    }
@Override
    public String toString() {
        return "Printer:(brand:" + this.brand + ",\n model:" + this.model + ",\n type:" + this.type + ",\n price:" + this.price + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
