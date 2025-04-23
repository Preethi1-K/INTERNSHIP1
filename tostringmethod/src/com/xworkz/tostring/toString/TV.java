package com.xworkz.tostring.toString;

public class TV {

    private String brand;
    private double size;
    private String resolution;
    private boolean smart;
    private double price;

    public TV() {
    }
@Override
    public String toString() {
        return "TV:(brand:" + this.brand + ",\n size:" + this.size + ",\n resolution:" + this.resolution + ",\n smart:" + this.smart + ",\n price:" + this.price + ")";
    }

    public String getBrand() {
        return brand ;
    }

    public double getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    public boolean isSmart() {
        return smart;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
