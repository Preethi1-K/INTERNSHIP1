package com.xworkz.tostring.toString;

public class Racket {

    private String brand;
    private String type;
    private double weight;
    private double price;

    public Racket() {
    }
@Override
    public String toString() {
        return "Racket:(brand:" + this.brand + ",\n type:" + this.type + ",\n weight:" + this.weight + ",\n price:" + this.price + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
