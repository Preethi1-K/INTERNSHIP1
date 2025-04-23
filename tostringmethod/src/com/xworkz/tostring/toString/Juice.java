package com.xworkz.tostring.toString;

public class Juice {

    private String flavor;
    private String brand;
    private double quantity;
    private boolean isCold;

    public Juice() {
    }
@Override
    public String toString() {
        return "Juice:(flavor:" + this.flavor + ",\n brand:" + this.brand + ",\n quantity:" + this.quantity + ",\n isCold:" + this.isCold + ")";
    }

    public String getFlavor() {
        return flavor;
    }

    public String getBrand() {
        return brand;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }
}
