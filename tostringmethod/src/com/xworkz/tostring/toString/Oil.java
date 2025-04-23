package com.xworkz.tostring.toString;

public class Oil {

    private String type;
    private double quantity;
    private double price;
    private String brand;

    public Oil() {
    }
@Override
    public String toString() {
        return "Oil:(type:" + this.type + ",\n quantity:" + this.quantity + ",\n price:" + this.price + ",\n brand:" + this.brand + ")";
    }

    public String getType() {
        return type;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
