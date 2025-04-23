package com.xworkz.tostring.toString;

public class Cotton {

    private String type;
    private double pricePerKg;
    private double quantity;
    private String origin;

    public Cotton() {
    }
@Override
    public String toString() {
        return "Cotton:(type:" + this.type + ",\n pricePerKg:" + this.pricePerKg + ",\n quantity:" + this.quantity + ",\n origin:" + this.origin + ")";
    }

    public String getType() {
        return type;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
