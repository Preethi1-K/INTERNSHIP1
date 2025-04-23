package com.xworkz.tostring.toString;

public class IceCream {

    private String flavor;
    private double price;
    private double weight;
    private String brand;

    public IceCream() {
    }
@Override
    public String toString() {
        return "IceCream:(flavor:" + this.flavor + ",\n price:" + this.price + ",\n weight:" + this.weight + ",\n brand:" + this.brand + ")";
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
